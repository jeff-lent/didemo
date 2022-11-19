package com.emeritus.didemo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class EmployeeMasterDetails {
    private long empId;
    private String empName;
    private String empDept;
}
