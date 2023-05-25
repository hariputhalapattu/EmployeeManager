package com.mycom.EmployeeManager.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee_HK_POC")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeContact {
	private String MobileNumber;
	@Id
	private Long id;
	private String EmailAddress;

}
