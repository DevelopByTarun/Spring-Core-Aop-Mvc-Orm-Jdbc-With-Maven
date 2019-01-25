package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.dao.IEmployeeDAO;
import com.app.model.EmployeeLogin;

@Controller
public class EmployeeLoginController {
	
	@Autowired
	private IEmployeeDAO iemployee;
	
	// for welcome page
		@RequestMapping("/goon")
		public ModelAndView showIndexPage() {
			ModelAndView model = new ModelAndView();
			model.setViewName("login");
			return model;
		}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView getAuthenticate(@RequestParam("usrnm") String username,
			@RequestParam("pwd") String password, @ModelAttribute() EmployeeLogin empLog) {
		EmployeeLogin employeeLogin = null;
		ModelAndView model = new ModelAndView();
		if(username.length() > 6) {
			throw new NullPointerException();
		}
		else {
			empLog.setUsername(username);
		}
		if(password.length() <= 6) {
			throw new NullPointerException();
		}
		else {
			empLog.setPassword(password);
		}
		employeeLogin = iemployee.authenticateEmployee(empLog);
		model.addObject("values", employeeLogin);
		model.setViewName("welcome");
		return model;
	}
}
