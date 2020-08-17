package com.demo;

public class Employee {
    //Attribute
    int  empId;
    String empName;
    String empDesignation;
    int empSalary;
    String empLocation;
    public Employee(int  empId
            ,String empName
            ,String empDesignation
            ,int empSalary
            ,String empLocation){
        this.empId=empId;
        this.empName=empName;
        this.empLocation=empDesignation;
        this.empSalary=empSalary;
        this.empLocation=empLocation;

    }
    //getter setter.


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    //toString Method.

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}
