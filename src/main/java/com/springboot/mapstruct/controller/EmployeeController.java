package com.springboot.mapstruct.controller;

import com.springboot.mapstruct.dto.EmployeeDTO;
import com.springboot.mapstruct.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @PostMapping("/create-emp")
    public void createEmp(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.createEmp(employeeDTO);
    }

}
