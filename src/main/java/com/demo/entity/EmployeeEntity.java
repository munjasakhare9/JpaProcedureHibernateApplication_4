package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
@NamedStoredProcedureQuery(name = "proc1", procedureName = "emp_experience", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "eno", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "name", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "experience", type = Integer.class) })
public class EmployeeEntity {
	@Id
	@Column(name = "empno")
	private Integer empNumber;

	@Column(name = "ename")
	private String empName;

	@Column(name = "sal")
	private Double salary;

	@Column(name = "deptno")
	private Integer deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary
				+ ", deptNumber=" + deptNumber + "]";
	}
}
