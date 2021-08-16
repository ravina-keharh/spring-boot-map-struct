package com.springboot.mapstruct.dto;

import java.util.List;

public class EmployeeDTO {
    private String id;
    private String name;
    private List<EmployeeAddressDTO> addressList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeAddressDTO> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<EmployeeAddressDTO> addressList) {
        this.addressList = addressList;
    }
}
