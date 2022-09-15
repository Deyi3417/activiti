package com.example.activiti.controller;

import com.example.activiti.service.MyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘德意
 * @date 2022/9/15
 */
@RestController
@Api(tags = "ActivitiController")
@RequestMapping("/activiti")
public class ActivitiController {

    @Autowired
    private MyService myService;

    @PostMapping("/deploy")
    public void deploy(@RequestParam String classPath, @RequestParam String name) {
        myService.deploy(classPath, name);
    }

    @PostMapping("/process")
    public void startProcessInstance(@RequestParam String key) {
        myService.startProcess(key);
    }


}
