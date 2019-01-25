package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.StudentDTO;
import com.app.model.StudentLoginDTO;
import com.app.service.StudentService;

@Controller
public class StudentController {
	
	// for welcome page
	@RequestMapping("/goon")
	public ModelAndView showIndexPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	
	@Autowired
	private StudentService myService;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView getAuthenticate(@RequestParam("usrnm") String username,
			@RequestParam("pwd") String password, @ModelAttribute() StudentLoginDTO studLog) {
		StudentLoginDTO studentLoginDTO = null;
		ModelAndView model = new ModelAndView();
		studLog.setUsername(username);
		studLog.setPassword(password);
		try {
			studentLoginDTO = myService.authenticateStudent(studLog);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		model.addObject("values", studentLoginDTO);
		model.setViewName("welcome");
		return model;
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView getStudentDetails(@RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("age") int age,
			@RequestParam("state") String state, @RequestParam("country") String country,
			@ModelAttribute() StudentDTO student) {
		StudentDTO studentDTO = null;
		ModelAndView model = new ModelAndView();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		student.setState(state);
		student.setCountry(country);
		try {
			studentDTO = myService.addStudentDetails(student);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		model.addObject("details", studentDTO);
		model.setViewName("studentDetail");
		return model;
	}
}
