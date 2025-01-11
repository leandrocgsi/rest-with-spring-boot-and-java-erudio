package br.com.erudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.environment.InstanceInformationService;

@RestController
public class HelloKubernetesController {
    
    @Autowired
    private InstanceInformationService service;

    @GetMapping(path = "/")
    public String imUpAndRunning() {
        return "{healthy:true}";
    }

    
    @GetMapping(path = "/hello-kubernetes")
    public String helloKubernetes() {
        return "Hello Kubernetes " + " V2 " + service.retrieveInstanceInfo();
    }
}