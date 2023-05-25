package com.mycom.EmployeeManager.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.mycom.EmployeeManager.Mapper.EmployeeMapper;
import com.mycom.EmployeeManager.dao.EmployeeDAO;
import com.mycom.EmployeeManager.dto.EmployeeDTO;
import com.mycom.EmployeeManager.entities.EmployeeEntity;
import com.mycom.EmployeeManager.repositories.EmployeeRepository;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO empdao;
	@Autowired
	EmployeeMapper empmap;
	//EmployeeRepository EmployeeRepository;
	
	public EmployeeDTO createemployee(EmployeeDTO empdto)
	{
		EmployeeDTO result = new EmployeeDTO();
		result = empdao.insertemprec(empmap.toentity(empdto));
		return result;
	}
	
	
	public void deleteEmpbyid(Long empid) 
	{
		empdao.deleteEmpbyid(empid);
	}
	
	public EmployeeDTO getEmployeebyidDto(Long empid)
	{
		EmployeeEntity empentity = empdao.getEmployeebyid(empid);
		EmployeeDTO empdto = empmap.todto(empentity);
		return empdto;
		
	}
	
	public List<EmployeeDTO> getEmployList()
	{
		/*return empdao.getEmployList().stream().map(e->{
			return empmap.todto(e);
		}
		).collect(Collectors.toList());*/
		return EmployeeMapper.INSTANCE.todtolist(empdao.getEmployList());
	}
	
	 public String updateEmp(EmployeeDTO empdto) 
	 {
	    	empdao.updateEmp(empmap.toentity(empdto));
	    	//return "Employee Successfully Updated-"+empdto.getId()+" "+empdto.getName()+" "+empdto.getSalary();
	    	return null;
	}
}
