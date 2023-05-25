package com.mycom.EmployeeManager.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.EmployeeManager.dto.EmployeeDTO;
import com.mycom.EmployeeManager.dto.EmployeeGetAllServiceResponse;
import com.mycom.EmployeeManager.dto.EmployeeServiceResponse;
import com.mycom.EmployeeManager.utility.GenericServiceResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/employeemanager/api/v1/")
public interface EmployeeAPI {
	@Operation(operationId = "Create Employee", summary = "Create Employees using this service", tags = {
			"create employee" }, responses = {@ApiResponse(responseCode = "200", description = "Success", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "400", description = "Bad Request", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "403", description = "Forbidden", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "404", description = "Not Found", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "409", description = "Conflict", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
					@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }) })
	
	@PostMapping(value = "/createEmployee", produces = { "application/json;charset=utf-8",
			"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	
	public default ResponseEntity<EmployeeServiceResponse> createEmployeeDTO(@RequestBody EmployeeDTO employee) {
		// empser.createemployee(employee);
		// return new EmployeeDTO("Hari", 1234L, 20000.00);
		return null;
	}

	@Operation(operationId = "Delete Employee", summary = "Delete Employeebyid using this service", tags = {
	"delete employbyid" }, responses = {@ApiResponse(responseCode = "200", description = "Success", content = {
			@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "404", description = "Not Found", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }) })
	@DeleteMapping(value = "/deleteEmployee", produces = { "application/json;charset=utf-8",
	"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default GenericServiceResponse deleteEmployeeDTO(@RequestParam Long empid) {
		// empser.deleteEmpbyid(empid);
		return null;
	}
    
	@Operation(operationId = "Get Employeebyid", summary = "Get Employeebyid using this service", tags = {
	"get employbyid" }, responses = {@ApiResponse(responseCode = "200", description = "Success", content = {
			@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "404", description = "Not Found", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }) })
	@GetMapping(value = "/getEmployeeid", produces = { "application/json;charset=utf-8",
	"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default EmployeeDTO getEmployeebyid(@RequestParam Long empid) {
		return null;
		// return new EmployeeDTO("Hari", 1234L, 20000.00);

	}
	
	@Operation(operationId = "Get Employlist", summary = "Get all Employees using this service", tags = {
	"get employlist" }, responses = {@ApiResponse(responseCode = "200", description = "Success", content = {
			@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "404", description = "Not Found", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }) })
	@GetMapping(value = "/getEmploylist", produces = { "application/json;charset=utf-8",
	"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default ResponseEntity<EmployeeGetAllServiceResponse> getEmployList() {
		// empser.createemployee(employee);
		// return new EmployeeDTO("Hari", 1234L, 20000.00);
		/// return empser.getEmployList();
		return null;
	}
    
	@Operation(operationId = "Update Employee", summary = "Update Employees using this service", tags = {
	"update employee" }, responses = {@ApiResponse(responseCode = "200", description = "Success", content = {
			@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "404", description = "Not Found", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = EmployeeServiceResponse.class)) }) })
	@PutMapping(value = "/updateEmployee", produces = { "application/json;charset=utf-8",
	"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default String updateEmployee(@RequestBody EmployeeDTO employee) {
		// empser.createemployee(employee);
		// return new EmployeeDTO("Hari", 1234L, 20000.00);
		return null;
	}
}
