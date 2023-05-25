package com.mycom.EmployeeManager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee_HK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double salary;

}
