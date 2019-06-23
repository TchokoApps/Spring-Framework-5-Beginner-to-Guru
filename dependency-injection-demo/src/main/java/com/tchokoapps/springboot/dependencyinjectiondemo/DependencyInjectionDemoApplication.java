package com.tchokoapps.springboot.dependencyinjectiondemo;

import com.tchokoapps.springboot.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.tchokoapps.springboot.dependencyinjectiondemo.controllers.MyController;
import com.tchokoapps.springboot.dependencyinjectiondemo.controllers.PropertyInjectedController;
import com.tchokoapps.springboot.dependencyinjectiondemo.controllers.SetterInjectedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tchokoapps.springboot.dependencyinjectiondemo"})
public class DependencyInjectionDemoApplication {

	private final static Logger logger = LoggerFactory.getLogger(DependencyInjectionDemoApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		logger.info(myController.hello());

		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		logger.info(propertyInjectedController.sayHello());

		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		logger.info(setterInjectedController.sayHello());

		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		logger.info(constructorInjectedController.sayHello());
	}

}
