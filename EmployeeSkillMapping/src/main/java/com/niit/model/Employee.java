package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
@Table(name="employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@NonNull
	private String empName;
	@NonNull
	private String empAddress;
	@NonNull
	@Column(name="empEmailId",unique=true)
	private String empMailId;
	@NonNull
	private String empMob;
	@NonNull
	private String empDob;
	@NonNull
	private String empQuali;
	@NonNull
	private String empPass;
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	@NonNull
	private String empSkill;
	@NonNull
	private String empLocation;
	@Nullable
	private int empExp;
	@NonNull
	private String empGender;
	@NonNull
	private String empRole;
	@NonNull
	private String empDesignation;
	@NonNull
	private String empStatus;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}
	public String getEmpMob() {
		return empMob;
	}
	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpQuali() {
		return empQuali;
	}
	public void setEmpQuali(String empQuali) {
		this.empQuali = empQuali;
	}
	public String getEmpSkill() {
		return empSkill;
	}
	public void setEmpSkill(String empSkill) {
		this.empSkill = empSkill;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public int getEmpExp() {
		return empExp;
	}
	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	
	
	
	
	
	
	
	
	
	
	
}
