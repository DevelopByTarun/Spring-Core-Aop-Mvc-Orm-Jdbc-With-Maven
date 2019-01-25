package com.app.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.dao.IStudentDAO;
import com.app.model.StudentDTO;

@Controller
public class StudentController {
	
	// logger
	private Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentDTO stud;
	
	@Autowired
	private IStudentDAO studDAO;
	
	// for welcome page
	@RequestMapping("welcome")
	public ModelAndView showWelcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("add");
		return model;
	}
	
	@RequestMapping(value = "/adding", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("city") String city) throws Exception {
		logger.debug("****Going To Start Add Student Method****");
		stud.setId(id);
		stud.setName(name);
		stud.setAge(age);
		stud.setCity(city);
		int result = studDAO.saveStudent(stud);
		if(result > 0) {
			logger.debug(name+" Is Added Successfully");
		}
		else {
			logger.debug("Unable To Add "+name);
		}
		logger.debug("****Going To End Add Student Method****");
		return new ModelAndView("redirect:/fetch");
	}
		
	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public ModelAndView fetchAllStudents() throws Exception {
		logger.debug("****Going To Start Fetch Students Method****");
		ModelAndView model = new ModelAndView("fetch");
		List<StudentDTO> studList = studDAO.getAllStudents();
		if(studList != null && studList.size() > 0) {
			model.addObject("studList", studList);
			logger.debug("You Have Successfully Fetch Students List");
		}
		else {
			logger.debug("Unable To Fetch Students List");
		}
		logger.debug("****Going To End Fetch Students Method****");
		return model;
	}
		
	@RequestMapping(value = "/edit/{id}")
	public ModelAndView editStudent(@PathVariable("id") int id) throws Exception {
		logger.debug("****Going To Start Get Student By Id Method****");
		ModelAndView model = new ModelAndView();
		StudentDTO edit = studDAO.getStudentById(id);
		if(edit != null) {
			model.addObject("values", edit);
			logger.debug("You Have Successfully Edit Student Id "+id);
		}
		else {
			logger.debug("Unable To Edit Employee Id "+id);
		}
		model.setViewName("update");
		logger.debug("****Going To End Get Student By Id Method****");
		return model;
	}
	
	@RequestMapping(value = "/updt", method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute("studDTO") StudentDTO studDTO) throws Exception {
		logger.debug("****Going To Start Update Student Method****");
		int result = studDAO.updateStudent(studDTO);
		if(result > 0) {
			logger.debug(studDTO.getName()+" Updated Successfully");
		}
		else {
			logger.debug("Unable To Update "+studDTO.getName());
		}
		logger.debug("****Going To End Update Student Method****");
		return new ModelAndView("redirect:/fetch");
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable("id") int id) throws Exception {
		logger.debug("****Going To Start Delete Student Method****");
		int result = studDAO.deleteStudent(id);
		if(result > 0) {
			logger.debug("You Have Successfully Delete Student Id "+id);
		}
		else {
			logger.debug("Unable To Delete Student Id "+id);
		}
		logger.debug("****Going To End Delete Student Method****");
		return new ModelAndView("redirect:/fetch");
	}	
}
