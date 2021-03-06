package com.yeahmobi.yscheduler.web.controller.workflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yeahmobi.yscheduler.common.Paginator;
import com.yeahmobi.yscheduler.model.Attempt;
import com.yeahmobi.yscheduler.model.TaskInstance;
import com.yeahmobi.yscheduler.model.WorkflowInstance;
import com.yeahmobi.yscheduler.model.service.AttemptService;
import com.yeahmobi.yscheduler.model.service.TaskInstanceService;
import com.yeahmobi.yscheduler.model.service.TaskService;
import com.yeahmobi.yscheduler.model.service.WorkflowInstanceService;
import com.yeahmobi.yscheduler.model.service.WorkflowService;
import com.yeahmobi.yscheduler.web.controller.AbstractController;
import com.yeahmobi.yscheduler.web.vo.WorkflowInstanceTasksVO;

/**
 * @author Leo.Liang
 */
@Controller
@RequestMapping(value = { WorkflowInstanceTasksController.SCREEN_NAME })
public class WorkflowInstanceTasksController extends AbstractController {

    public static final String      SCREEN_NAME = "workflow/instance/tasks";

    @Autowired
    private WorkflowService         workflowService;

    @Autowired
    private WorkflowInstanceService instanceService;

    @Autowired
    private TaskService             taskService;

    @Autowired
    private TaskInstanceService     taskInstanceService;

    @Autowired
    private AttemptService          attemptService;

    @RequestMapping(value = { "" })
    public ModelAndView index(Integer pageNum, long instanceId) {
        Map<String, Object> map = new HashMap<String, Object>();

        Paginator paginator = new Paginator();
        pageNum = ((pageNum == null) || (pageNum < 0)) ? 0 : pageNum;

        List<TaskInstance> taskInstances = this.taskInstanceService.listByWorkflowInstanceId(instanceId, pageNum,
                                                                                             paginator);
        WorkflowInstance workflowInstance = this.instanceService.get(instanceId);

        List<WorkflowInstanceTasksVO> voList = new ArrayList<WorkflowInstanceTasksVO>();

        for (TaskInstance taskInstance : taskInstances) {
            WorkflowInstanceTasksVO vo = new WorkflowInstanceTasksVO(taskInstance);
            vo.setTaskName(this.taskService.get(taskInstance.getTaskId()).getName());
            Attempt attempt = this.attemptService.getLastOne(taskInstance.getId());
            if (attempt != null) {
                vo.setAttempt(attempt);
                vo.setEndTime(attempt.getEndTime());
            }
            voList.add(vo);
        }

        map.put("workflow", this.workflowService.get(workflowInstance.getWorkflowId()));
        map.put("list", voList);
        map.put("paginator", paginator);
        map.put("instance", workflowInstance);

        return screen(map, SCREEN_NAME);
    }
}
