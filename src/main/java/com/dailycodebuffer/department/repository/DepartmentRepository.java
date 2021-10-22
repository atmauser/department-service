package com.dailycodebuffer.department.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.department.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>  {

	Department findByDepartmentId(Long departmentid);
	
	//findByDepartmentId();

}
