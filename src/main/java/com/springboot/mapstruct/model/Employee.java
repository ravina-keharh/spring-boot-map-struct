package com.springboot.mapstruct.model;

import java.util.List;

public class Employee {
    private String empId;
    private String empName;
    private List<EmployeeAddress> empAddressList;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<EmployeeAddress> getEmpAddressList() {
        return empAddressList;
    }

    public void setEmpAddressList(List<EmployeeAddress> empAddressList) {
        this.empAddressList = empAddressList;
    }
}
