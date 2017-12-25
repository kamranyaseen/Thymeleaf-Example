package com.kamranyaseen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class StudentController {
	
	@Autowired
	public StudentRepository studentRespository;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Student> students = (List<Student>) studentRespository.findAll();
		model.addAttribute("students", students);
		return "index";
	}
	
	@RequestMapping(value = "/addNew",method = RequestMethod.GET)
	public String StudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "addNew";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Student student) {
		studentRespository.save(student);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id) {
		studentRespository.delete(id);
		return "redirect:/";
	}
}
