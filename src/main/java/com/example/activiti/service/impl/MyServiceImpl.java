package com.example.activiti.service.impl;

import com.example.activiti.service.MyService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 刘德意
 * @date 2022/9/15
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private RepositoryService repositoryService;

    @Override
    public void deploy(String classPath, String name) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        ArrayList<Object> objects = new ArrayList<>();
        repositoryService.createDeployment()
                .addClasspathResource(classPath)
                .name(name)
                .deploy();
    }

    @Override
    public void startProcess() {
        ProcessInstance holiday = runtimeService.startProcessInstanceByKey("holiday");
        String name = holiday.getName();
        String id = holiday.getId();
        System.out.println("====ProcessInstance==== " + holiday);
    }

    @Override
    public void startProcess(String key) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(key);
        String name = processInstance.getName();
        String id = processInstance.getId();
        System.out.println(name + "======" + id);
        System.out.println("====ProcessInstance==== " + processInstance);
    }
}
