package com.mycom.EmployeeManager.dto;

import java.util.List;

import com.mycom.EmployeeManager.utility.GenericServiceResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EmployeeGetAllServiceResponse extends GenericServiceResponse {
	private List<EmployeeDTO> employeelist;

	public EmployeeGetAllServiceResponse(String statuscode, String statusmsg, String errorcode,
			List<EmployeeDTO> employeelist) {
		super(statuscode, statusmsg, errorcode);
		this.employeelist = employeelist;
	}

}
