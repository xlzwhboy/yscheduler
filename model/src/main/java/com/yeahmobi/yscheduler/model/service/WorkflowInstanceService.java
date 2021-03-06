package com.yeahmobi.yscheduler.model.service;

import java.util.List;

import com.yeahmobi.yscheduler.common.Paginator;
import com.yeahmobi.yscheduler.model.Workflow;
import com.yeahmobi.yscheduler.model.WorkflowInstance;
import com.yeahmobi.yscheduler.model.common.Query;
import com.yeahmobi.yscheduler.model.type.WorkflowInstanceStatus;

public interface WorkflowInstanceService {

    WorkflowInstance get(long id);

    WorkflowInstance getLast(Workflow workflow, WorkflowInstance workflowInstance);

    List<WorkflowInstance> list(Query query, long workflowId, int pageNum, Paginator paginator);

    List<WorkflowInstance> listAll(long workflowId);

    void save(WorkflowInstance instance);

    List<WorkflowInstance> getAllRunning(boolean common);

    boolean existUncompleted(long workflowId);

    public List<WorkflowInstance> getAllInits();

    void updateStatus(Long instanceId, WorkflowInstanceStatus status);

    List<WorkflowInstance> list(List<Long> ids);

}
