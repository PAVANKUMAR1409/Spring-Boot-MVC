package com.nt.model;

import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="curd_emp")
@Entity
public class Employee implements Serializable{

	@Id
	@SequenceGenerator(name="gen1", sequenceName = "curd_emp_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	@Column(length=20)
	private String ename;
	
	@Column(length=20)
	private String job;
	
	private Float sal;
	
	private Integer deptno;
	
	
	
}
