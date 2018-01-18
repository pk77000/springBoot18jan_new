package com.capgemini.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.capgemini.demo.bean.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> emp = new ArrayList<>(Arrays.asList(                    //Arrays.asList is not mutable
	        new Employee("ram","spring framework"),
	        new Employee("john","core java"),
	        new Employee("tonny","javascript")
	  ));

	 public List<Employee> getAllTopics()
	 {
	    return emp;
	 }
	 
	 public Employee getTopic(String id)
	 {
		 return emp.stream().filter(t->t.getId().equals(id)).findFirst().get();
	 }

	public void addTopic(Employee emp1) {
		emp.add(emp1);
		
	}

	public void updateTopic(String id, Employee emp1) {
		for(int i=0;i<emp.size();i++)
		{
			
			Employee t =emp.get(i);
			if(t.getId().equals(id))
			{
				emp.set(i, emp1);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		emp.removeIf(t->t.getId().equals(id));
		
	}
	}

