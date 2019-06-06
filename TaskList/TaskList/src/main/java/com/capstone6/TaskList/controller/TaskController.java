package com.capstone6.TaskList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capstone6.TaskList.pojo.Task;
import com.capstone6.TaskList.repo.TaskRepo;
import com.capstone6.TaskList.repo.UserRepo;

@Controller
public class TaskController {
	@Autowired
	TaskRepo tr;
	@Autowired
	UserRepo ur;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/log-in")
	public ModelAndView optionPage() {
		return new ModelAndView("option-page");
	}
	@RequestMapping("/list-task")
	public ModelAndView listTasks() {
		return new ModelAndView("list-task","list", tr.findAll());
	}
	
	@RequestMapping("/go-create-tasks")
	public ModelAndView goCreateTask() {
		return new ModelAndView("create-task");
	}
	@RequestMapping("/create")
	public ModelAndView createTask(Task t) {
		tr.save(t);
		return new ModelAndView("redirect:/list-task");
		}
	
}

