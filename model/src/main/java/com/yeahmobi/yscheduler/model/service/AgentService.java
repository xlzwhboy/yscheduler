package com.yeahmobi.yscheduler.model.service;

import java.util.List;

import com.yeahmobi.yscheduler.common.Paginator;
import com.yeahmobi.yscheduler.model.Agent;

public interface AgentService {

    Agent get(long id);

    Agent get(String name);

    List<Agent> list(int pageNum, Paginator paginator);

    List<Agent> list(long teamId, int pageNum, Paginator paginator);

    List<Agent> list();

    List<Agent> list(long teamId, boolean enable);

    List<Agent> listInPlatform();

    void add(Agent agent);

    void remove(long agentId, String name);

    void update(long agentId, String ip, long teamId);

    void updateStatus(long agentId, boolean enable);

    void updateVersion(long agentId, String agentVersion);
}
