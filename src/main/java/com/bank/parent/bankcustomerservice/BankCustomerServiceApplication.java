package com.bank.parent.bankcustomerservice;

import java.util.Arrays;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankCustomerServiceApplication implements CommandLineRunner,
		ApplicationRunner {
	private final static Logger LOGGER = LoggerFactory
			.getLogger(BankCustomerServiceApplication.class.getName());
	@Value("${spring.application.name}")
	private String applicationName;
	@Value("${server.port}")
	private Integer serverPort;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				BankCustomerServiceApplication.class, args);
		Integer noOfBeans =  ctx.getBeanDefinitionCount();
		LOGGER.info("Total Beans : {}", noOfBeans);
		String[] beanNames = ctx.getBeanDefinitionNames();

		Arrays.sort(beanNames);

		for (String beanName : beanNames) {
			LOGGER.debug(beanName);
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("Inside ApplicationRunner");
		LOGGER.debug("Application Name : {}", applicationName);
		LOGGER.debug("Server Port : {}", serverPort);
		Set<String> optionNameSet = args.getOptionNames();
		int optionNameIndex = 0;
		for (String optionName : optionNameSet) {
			LOGGER.debug("Argument ({}) : {}", ++optionNameIndex, optionName);
		}
		LOGGER.info("Exit ApplicationRunner");

	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Inside CommandLineRunner");
		LOGGER.debug("Application Name : {}", applicationName);
		LOGGER.debug("Server Port : {}", serverPort);
		int argIndex = 0;
		for (String arg : args) {
			LOGGER.debug("Argument ({}) : {}", ++argIndex, arg);
		}
		LOGGER.info("Exit CommandLineRunner");
	}
}
