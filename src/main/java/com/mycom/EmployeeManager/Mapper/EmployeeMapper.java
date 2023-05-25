package com.mycom.EmployeeManager.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.mycom.EmployeeManager.dto.EmployeeDTO;
import com.mycom.EmployeeManager.entities.EmployeeEntity;

//@Component
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
//@Mapping(target = "configId", source ="id.configId");

/*public class EmployeeMapper {
	public EmployeeEntity toentity(EmployeeDTO dto)
	{
		return new EmployeeEntity(dto.getName(), dto.getId(), dto.getSalary());
	}
	
	public EmployeeDTO todto(EmployeeEntity ent)
	{
		return new EmployeeDTO(ent.getName(), ent.getId(), ent.getSalary());
	}
	
} */

public interface EmployeeMapper {
	public EmployeeMapper INSTANCE=Mappers.getMapper(EmployeeMapper.class);
	public EmployeeEntity toentity(EmployeeDTO dto);
	public EmployeeDTO todto(EmployeeEntity ent);
	
	public List<EmployeeEntity> toentitylist(List<EmployeeDTO> dto);
	public List<EmployeeDTO> todtolist(List<EmployeeEntity> ent);
	
}