package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.logging.Logger;

@Controller
public class AuthController {

	private static final Logger logger = Logger.getLogger("AuthController");

	@RequestMapping(value = "/getauth", method = RequestMethod.GET)
	public String printStatus(ModelMap model) {
		logger.info("AuthController -> printStatus");
		model.addAttribute("status", "SUCCESS!");
		return "auth";
	}
}