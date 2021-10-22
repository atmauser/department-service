package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.controller.DepartmentController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class DepartmentService {
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
	
		logger.info("inside saveDepartment method of DepartmentService ");
		return departmentRepository.save(department);
	}
    
	
	public Department findDepartmentbyId(Long departmentid)throws InterruptedException {
		Thread.sleep(2000);
		logger.info("inside findDepartmentbyId method of DepartmentService ");
		 Department dto= departmentRepository.findByDepartmentId(departmentid);
		 return dto;
	}

}
