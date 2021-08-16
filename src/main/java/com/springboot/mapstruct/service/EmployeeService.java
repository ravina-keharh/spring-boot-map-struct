package com.springboot.mapstruct.service;

import com.springboot.mapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.mapper.EmployeeMapper;
import com.springboot.mapstruct.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void createEmp(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEmployee(employeeDTO);
        System.out.println(employee);
    }
}
