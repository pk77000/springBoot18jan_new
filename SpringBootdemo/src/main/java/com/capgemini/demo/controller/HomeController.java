package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.bean.Employee;
import com.capgemini.demo.service.EmployeeService;

@RestController
public class HomeController {
	
	@Autowired
	private EmployeeService topicService;

	@RequestMapping("/topics")
	public List<Employee> getAllTopics()
	{
	   return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Employee getTopic(@PathVariable String id)
	{
	  return topicService.getTopic(id);
	}


	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Employee topic)
	{
		topicService.addTopic(topic);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Employee topic,@PathVariable String id )
	{
		topicService.updateTopic(id,topic);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id )
	{
		topicService.deleteTopic(id);
	}

	}
