package com.yeahmobi.yscheduler.model;

import com.yeahmobi.yscheduler.model.type.DependingStatus;
import com.yeahmobi.yscheduler.model.type.TaskStatus;
import com.yeahmobi.yscheduler.model.type.TaskType;
import java.util.Date;

public class Task {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.owner
     *
     * @mbggenerated
     */
    private Long owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.type
     *
     * @mbggenerated
     */
    private TaskType type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.crontab
     *
     * @mbggenerated
     */
    private String crontab;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.agent_id
     *
     * @mbggenerated
     */
    private Long agentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.status
     *
     * @mbggenerated
     */
    private TaskStatus status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.can_skip
     *
     * @mbggenerated
     */
    private Boolean canSkip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.last_status_dependency
     *
     * @mbggenerated
     */
    private DependingStatus lastStatusDependency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.timeout
     *
     * @mbggenerated
     */
    private Integer timeout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.retry_times
     *
     * @mbggenerated
     */
    private Integer retryTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.last_schedule_time
     *
     * @mbggenerated
     */
    private Date lastScheduleTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.attachment
     *
     * @mbggenerated
     */
    private String attachment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.attachment_version
     *
     * @mbggenerated
     */
    private Long attachmentVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.command
     *
     * @mbggenerated
     */
    private String command;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.id
     *
     * @return the value of task.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.id
     *
     * @param id the value for task.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.name
     *
     * @return the value of task.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.name
     *
     * @param name the value for task.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.owner
     *
     * @return the value of task.owner
     *
     * @mbggenerated
     */
    public Long getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.owner
     *
     * @param owner the value for task.owner
     *
     * @mbggenerated
     */
    public void setOwner(Long owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.type
     *
     * @return the value of task.type
     *
     * @mbggenerated
     */
    public TaskType getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.type
     *
     * @param type the value for task.type
     *
     * @mbggenerated
     */
    public void setType(TaskType type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.crontab
     *
     * @return the value of task.crontab
     *
     * @mbggenerated
     */
    public String getCrontab() {
        return crontab;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.crontab
     *
     * @param crontab the value for task.crontab
     *
     * @mbggenerated
     */
    public void setCrontab(String crontab) {
        this.crontab = crontab == null ? null : crontab.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.agent_id
     *
     * @return the value of task.agent_id
     *
     * @mbggenerated
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.agent_id
     *
     * @param agentId the value for task.agent_id
     *
     * @mbggenerated
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.status
     *
     * @return the value of task.status
     *
     * @mbggenerated
     */
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.status
     *
     * @param status the value for task.status
     *
     * @mbggenerated
     */
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.can_skip
     *
     * @return the value of task.can_skip
     *
     * @mbggenerated
     */
    public Boolean getCanSkip() {
        return canSkip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.can_skip
     *
     * @param canSkip the value for task.can_skip
     *
     * @mbggenerated
     */
    public void setCanSkip(Boolean canSkip) {
        this.canSkip = canSkip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.last_status_dependency
     *
     * @return the value of task.last_status_dependency
     *
     * @mbggenerated
     */
    public DependingStatus getLastStatusDependency() {
        return lastStatusDependency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.last_status_dependency
     *
     * @param lastStatusDependency the value for task.last_status_dependency
     *
     * @mbggenerated
     */
    public void setLastStatusDependency(DependingStatus lastStatusDependency) {
        this.lastStatusDependency = lastStatusDependency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.timeout
     *
     * @return the value of task.timeout
     *
     * @mbggenerated
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.timeout
     *
     * @param timeout the value for task.timeout
     *
     * @mbggenerated
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.retry_times
     *
     * @return the value of task.retry_times
     *
     * @mbggenerated
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.retry_times
     *
     * @param retryTimes the value for task.retry_times
     *
     * @mbggenerated
     */
    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.description
     *
     * @return the value of task.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.description
     *
     * @param description the value for task.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.last_schedule_time
     *
     * @return the value of task.last_schedule_time
     *
     * @mbggenerated
     */
    public Date getLastScheduleTime() {
        return lastScheduleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.last_schedule_time
     *
     * @param lastScheduleTime the value for task.last_schedule_time
     *
     * @mbggenerated
     */
    public void setLastScheduleTime(Date lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.attachment
     *
     * @return the value of task.attachment
     *
     * @mbggenerated
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.attachment
     *
     * @param attachment the value for task.attachment
     *
     * @mbggenerated
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.attachment_version
     *
     * @return the value of task.attachment_version
     *
     * @mbggenerated
     */
    public Long getAttachmentVersion() {
        return attachmentVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.attachment_version
     *
     * @param attachmentVersion the value for task.attachment_version
     *
     * @mbggenerated
     */
    public void setAttachmentVersion(Long attachmentVersion) {
        this.attachmentVersion = attachmentVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.create_time
     *
     * @return the value of task.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.create_time
     *
     * @param createTime the value for task.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.update_time
     *
     * @return the value of task.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.update_time
     *
     * @param updateTime the value for task.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.command
     *
     * @return the value of task.command
     *
     * @mbggenerated
     */
    public String getCommand() {
        return command;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.command
     *
     * @param command the value for task.command
     *
     * @mbggenerated
     */
    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", owner=").append(owner);
        sb.append(", type=").append(type);
        sb.append(", crontab=").append(crontab);
        sb.append(", agentId=").append(agentId);
        sb.append(", status=").append(status);
        sb.append(", canSkip=").append(canSkip);
        sb.append(", lastStatusDependency=").append(lastStatusDependency);
        sb.append(", timeout=").append(timeout);
        sb.append(", retryTimes=").append(retryTimes);
        sb.append(", description=").append(description);
        sb.append(", lastScheduleTime=").append(lastScheduleTime);
        sb.append(", attachment=").append(attachment);
        sb.append(", attachmentVersion=").append(attachmentVersion);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", command=").append(command);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Task other = (Task) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCrontab() == null ? other.getCrontab() == null : this.getCrontab().equals(other.getCrontab()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCanSkip() == null ? other.getCanSkip() == null : this.getCanSkip().equals(other.getCanSkip()))
            && (this.getLastStatusDependency() == null ? other.getLastStatusDependency() == null : this.getLastStatusDependency().equals(other.getLastStatusDependency()))
            && (this.getTimeout() == null ? other.getTimeout() == null : this.getTimeout().equals(other.getTimeout()))
            && (this.getRetryTimes() == null ? other.getRetryTimes() == null : this.getRetryTimes().equals(other.getRetryTimes()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLastScheduleTime() == null ? other.getLastScheduleTime() == null : this.getLastScheduleTime().equals(other.getLastScheduleTime()))
            && (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment()))
            && (this.getAttachmentVersion() == null ? other.getAttachmentVersion() == null : this.getAttachmentVersion().equals(other.getAttachmentVersion()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCommand() == null ? other.getCommand() == null : this.getCommand().equals(other.getCommand()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCrontab() == null) ? 0 : getCrontab().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCanSkip() == null) ? 0 : getCanSkip().hashCode());
        result = prime * result + ((getLastStatusDependency() == null) ? 0 : getLastStatusDependency().hashCode());
        result = prime * result + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        result = prime * result + ((getRetryTimes() == null) ? 0 : getRetryTimes().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLastScheduleTime() == null) ? 0 : getLastScheduleTime().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getAttachmentVersion() == null) ? 0 : getAttachmentVersion().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCommand() == null) ? 0 : getCommand().hashCode());
        return result;
    }
}