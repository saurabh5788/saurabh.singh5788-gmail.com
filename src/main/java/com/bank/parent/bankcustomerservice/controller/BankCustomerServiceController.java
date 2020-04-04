package com.bank.parent.bankcustomerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank-customer-service")
public class BankCustomerServiceController {
	@GetMapping(path = "/hello")
	public String helloParty() {
		return "Hello Bank Customer";
	}
}
