package com.dailycodebuffer.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="department")
public class Department {

	@NotNull
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long departmentId;
	
	@NotNull
	@Column(name = "departmentname")
	private String departmentname;
	
	@NotNull
	@Column(name="departmentaddress")
	private String departmentaddress;
	
	@NotNull
	@Column(name = "departmentcode")
	private String departmentcode;

	/*
	 * public Long getDepartmentId() { return departmentId; }
	 * 
	 * public void setDepartmentId(Long departmentId) { this.departmentId =
	 * departmentId; }
	 * 
	 * public String getDepartmentname() { return departmentname; }
	 * 
	 * public void setDepartmentname(String departmentname) { this.departmentname =
	 * departmentname; }
	 * 
	 * public String getDepartmentaddress() { return departmentaddress; }
	 * 
	 * public void setDepartmentaddress(String departmentaddress) {
	 * this.departmentaddress = departmentaddress; }
	 * 
	 * public String getDepartmentcode() { return departmentcode; }
	 * 
	 * public void setDepartmentcode(String departmentcode) { this.departmentcode =
	 * departmentcode; }
	 */
	
	
	
	

}
