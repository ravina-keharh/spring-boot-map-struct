package com.springboot.mapstruct.model;

public class EmployeeAddress {
    private String empCountry;
    private String empState;

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }
}
