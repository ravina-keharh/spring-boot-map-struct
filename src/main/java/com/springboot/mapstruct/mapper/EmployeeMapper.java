package com.springboot.mapstruct.mapper;

import com.springboot.mapstruct.dto.EmployeeAddressDTO;
import com.springboot.mapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.model.Employee;
import com.springboot.mapstruct.model.EmployeeAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "id", target = "empId")
    @Mapping(source = "name", target = "empName")
    @Mapping(source = "addressList", target = "empAddressList", qualifiedByName = "toEmployeeAddress")
    Employee toEmployee(EmployeeDTO employeeDTO);

    @Named(value = "toEmployeeAddress")
    @Mapping(source = "country", target = "empCountry")
    @Mapping(source = "state", target = "empState")
    EmployeeAddress toEmployeeAddress(EmployeeAddressDTO employeeAddressDTO);
}
