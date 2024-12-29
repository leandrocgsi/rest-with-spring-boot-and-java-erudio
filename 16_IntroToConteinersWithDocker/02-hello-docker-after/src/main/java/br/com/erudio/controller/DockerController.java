package br.com.erudio.controller;

import br.com.erudio.environment.InstanceInformationService;
import br.com.erudio.model.HelloDocker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	Logger logger = LoggerFactory.getLogger(DockerController.class);

	@Autowired
	private InstanceInformationService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}

	@RequestMapping("/hello-docker")
	public HelloDocker greeting() {
		
		logger.info("Endpoint /hello-docker is called!!!");

		return new HelloDocker(
	"Hello Docker - V1",
			service.retrieveInstanceInfo()
		);
	}
}
