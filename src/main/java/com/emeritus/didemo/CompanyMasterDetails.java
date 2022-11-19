package com.emeritus.didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyMasterDetails {
    @Autowired
    private EmployeeMasterDetails empMasterDetails;

    public void addEmployee(EmployeeMasterDetails emd){
        this.empMasterDetails = emd;
    }

    @Override
    public String toString() {
        return "CompanyMasterDetails [empMasterDetails = " + 
            empMasterDetails.getEmpId() + " : " + 
            empMasterDetails.getEmpDept() + " : " + 
            empMasterDetails.getEmpName() + "]";
    }
}
