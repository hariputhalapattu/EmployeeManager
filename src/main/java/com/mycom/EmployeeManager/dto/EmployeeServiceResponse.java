package com.mycom.EmployeeManager.dto;

import com.mycom.EmployeeManager.utility.GenericServiceResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EmployeeServiceResponse extends GenericServiceResponse {

	private EmployeeDTO employee;

	public EmployeeServiceResponse(String statuscode, String statusmsg, String errorcode, EmployeeDTO employee) {
		super(statuscode, statusmsg, errorcode);
		this.employee = employee;
	}

}
