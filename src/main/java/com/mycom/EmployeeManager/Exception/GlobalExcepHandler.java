package com.mycom.EmployeeManager.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mycom.EmployeeManager.utility.GenericServiceResponse;
@ControllerAdvice
public class GlobalExcepHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) {
		 System.out.println("Iam Inside Global Exception Handler");
		 GenericServiceResponse EmpserResp = new GenericServiceResponse("1", "Request cannot be processed", ex.getLocalizedMessage());
		 return new ResponseEntity<Object>(EmpserResp,HttpStatus.BAD_REQUEST);
	}
}
