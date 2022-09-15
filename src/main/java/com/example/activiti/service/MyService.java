package com.example.activiti.service;

/**
 * @author 刘德意
 * @date 2022/9/15
 */
public interface MyService {

    /**
     * 开始部署流程
     */
    void startProcess();

    /**
     * 根据key部署流程
     *
     * @param key 实例key
     */
    void startProcess(String key);

    /**
     * 部署
     * @param classPath 路径
     * @param name 名称
     */
    void deploy(String classPath, String name);
}
