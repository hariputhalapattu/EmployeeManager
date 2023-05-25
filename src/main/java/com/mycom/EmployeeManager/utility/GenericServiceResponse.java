package com.mycom.EmployeeManager.utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericServiceResponse {
	private String statuscode;
	private String statusmsg;
	private String errorcode;

}
