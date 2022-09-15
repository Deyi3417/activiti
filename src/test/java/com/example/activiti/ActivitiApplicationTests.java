package com.example.activiti;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ActivitiApplicationTests {

	@Autowired
	private RepositoryService repositoryService;


	@Test
	void contextLoads() {
		System.out.println("deyi is so handsome");
	}

	/**
	 * 测试部署流程
	 */
	@Test
	void testDeploy() {
		Deployment deploy = repositoryService.createDeployment().name("度假流程")
				.addClasspathResource("processes/holiday.bpmn20.xml")
				.deploy();
		System.out.println("流程部署id== " + deploy.getId());
		System.out.println("流程部署名称：" + deploy.getName());
	}

}
