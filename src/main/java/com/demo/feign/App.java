package com.demo.feign;

import com.demo.feign.client.ControllerClient;
import com.demo.feign.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
  public static void main(final String[] args) {
    final ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(Config.class);

    final ControllerClient client = applicationContext.getBean(ControllerClient.class);
    System.out.println(client.getGreetings());

    ((AbstractApplicationContext) applicationContext).close();
  }
}
