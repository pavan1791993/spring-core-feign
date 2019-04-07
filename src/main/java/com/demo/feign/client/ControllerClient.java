package com.demo.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "controllerClient", url = "http://localhost:8080/spring-rest/api")
public interface ControllerClient {

  @GetMapping("/controller/get")
  String getGreetings();

  @GetMapping("/controller/hello")
  String getHello(@RequestParam("name") final String name);

}
