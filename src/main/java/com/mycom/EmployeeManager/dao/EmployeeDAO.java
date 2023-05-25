package com.mycom.EmployeeManager.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycom.EmployeeManager.Mapper.EmployeeMapper;
import com.mycom.EmployeeManager.dto.EmployeeDTO;
import com.mycom.EmployeeManager.entities.EmployeeEntity;
import com.mycom.EmployeeManager.repositories.EmployeeRepository;
@Component
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository emprepo;
	
	
	
	@Autowired
	EmployeeMapper empmapper;
    public EmployeeDTO insertemprec(EmployeeEntity empins)
    { 
    	EmployeeDTO result = new EmployeeDTO();
    	result = empmapper.todto(emprepo.save(empins));
    	return result;
    	
    }
    
    public void deleteEmpbyid(Long empid) 
    {
    	emprepo.deleteById(empid);
    	//return "Employee Successfully Deleted";
    	
	}
    
    public EmployeeEntity getEmployeebyid(Long empid)
    { 
    	Optional<EmployeeEntity> employpresent =  emprepo.findById(empid); 
    	if (employpresent.isPresent())
    	{
    		return employpresent.get();
    	}
    	else
    	{
    		throw new RuntimeException("Employee not present with the provided empid");
    	}
    	
    }

    public List<EmployeeEntity> getEmployList()
	{
		return emprepo.findAll();
	}
    
    public String updateEmp(EmployeeEntity empins) 
    {
    	emprepo.save(empins);
    	//return "Employee Successfully Updated-"+empins.getId()+" "+empins.getName()+" "+empins.getSalary();
    	return null;
    	
	}

}
