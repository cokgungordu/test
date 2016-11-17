package com.dante.commerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@RequestMapping(value = "/account/list", method = RequestMethod.GET)
	public String getAccounts(final ModelMap model) {
		logger.debug("Account List method is called");
		model.addAttribute("title", "Account Listeleme");
		model.addAttribute("accountStatus", "list");
		return "account";
	}

	@RequestMapping(value = "/account/add", method = RequestMethod.GET)
	public String addAccount(final ModelMap model) {
		logger.debug("Account Add method is called");
		model.addAttribute("title", "Account Ekleme");
		model.addAttribute("accountStatus", "add");
		return "account";
	}
}