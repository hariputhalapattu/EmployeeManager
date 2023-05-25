package com.mycom.EmployeeManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.EmployeeManager.dto.EmployeeDTO;
import com.mycom.EmployeeManager.dto.EmployeeGetAllServiceResponse;
import com.mycom.EmployeeManager.dto.EmployeeServiceResponse;
import com.mycom.EmployeeManager.services.EmployeeService;
import com.mycom.EmployeeManager.utility.GenericServiceResponse;

@RestController
public class EmployeeRestController implements EmployeeAPI  {
	@Autowired
	EmployeeService empser;
	@Override
	@PostMapping("/createEmployee")
public ResponseEntity<EmployeeServiceResponse> createEmployeeDTO(@RequestBody EmployeeDTO employee)
	{
        EmployeeDTO empDto = empser.createemployee(employee);
		//return new EmployeeDTO("Hari", 1234L, 20000.00);
		return new ResponseEntity<EmployeeServiceResponse>(new EmployeeServiceResponse("0", "Employee Successfully Added", null,empDto),HttpStatus.OK);
	}
	@Override
	@DeleteMapping("/deleteEmployee")
	public GenericServiceResponse deleteEmployeeDTO(@RequestParam Long empid)
	{
		empser.deleteEmpbyid(empid);
		return new GenericServiceResponse("0", "Employee Successfully Deleted", null);
	}
	@Override
	@GetMapping("/getEmployeeid")
	public EmployeeDTO getEmployeebyid(@RequestParam Long empid)
	{
		return empser.getEmployeebyidDto(empid);
		//return new EmployeeDTO("Hari", 1234L, 20000.00);
		 
	}
	@Override
	@GetMapping("/getEmploylist")
	public ResponseEntity<EmployeeGetAllServiceResponse> getEmployList()
	{
		//empser.createemployee(employee);
		//return new EmployeeDTO("Hari", 1234L, 20000.00);
		///return empser.getEmployList();
		return new ResponseEntity<EmployeeGetAllServiceResponse>(new EmployeeGetAllServiceResponse("0", "Transaction Completed Successfully", null, empser.getEmployList()),HttpStatus.OK);
	}
	@Override
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody EmployeeDTO employee)
	{
		//empser.createemployee(employee);
		//return new EmployeeDTO("Hari", 1234L, 20000.00);
		return empser.updateEmp(employee);
	}
	
	
}
