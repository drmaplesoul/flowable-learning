package com.zdr.workflow.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Slf4j
@Api(value = "Standard2ApproveController标准流程",tags="标准二级审批流程")
public class Standard2ApproveController {
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private ProcessEngine processEngine;

    /**
     *
     * @param flowId 流程ID
     * @param input 输入参数Map
     * @return
     */
    @ApiOperation(value = "发起流程", notes = "发起流程")
    @ApiParam(name ="流程ID",value = "flowId",required=true,type="String")
    @RequestMapping("/flow/{flowId}/start")
    public String startProcess(@PathVariable String flowId, HashMap<String, Object> input) {
        log.info("flow={},input={}",flowId,input);
        //启动流程
        HashMap<String, Object> map = new HashMap<>();
        map.put("taskUser", "userId");
        map.put("money", "money");
        map.putAll(input);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(flowId, map);
        return "提交成功.流程Id为：" + processInstance.getId();
    }
}
