package com.bank.parent.bankcustomerservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank-customer-service")
public class BankCustomerServiceController {
	private final static Logger LOGGER = LoggerFactory.getLogger(BankCustomerServiceController.class.getName());
	@GetMapping(path = "/hello")
	public String helloBankCustomer() {
		LOGGER.info("Processing Hello Bank Customer!!!");
		return "Hello Bank Customer";
	}
}
