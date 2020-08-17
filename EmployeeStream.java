package com.demo;

import java.util.Arrays;
import java.util.List;

public class EmployeeStream {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Vijay", "COO", 20000, "Agra"),
                new Employee(2, "Ajay", "CEO", 55000, "Noida"),
                new Employee(3, "Aniket", "SDE", 100000, "Melhi"),
                new Employee(4, "Suresh", "SDE", 100000, "Melhi"),
                new Employee(5, "Mahesh", "SDE", 100000, "Melhi"),
                new Employee(6, "Mukesh", "Manager", 100000, "Melhi"),
                new Employee(7, "Mita", "CFO", 100000, "Melhi"),
                new Employee(8, "Babita", "SDE", 100000, "Melhi"),
                new Employee(9, "Lilly", "SDE", 100000, "Melhi"),
                new Employee(10, "Kanta", "SDE", 100000, "Melhi")
        );

        System.out.println("All Name");
        employees.stream().filter(n->n.getEmpName().startsWith("")).forEach(n-> System.out.println(n.getEmpName()));
        System.out.println("Salary Greater >50000");
        employees.stream().filter(e->e.getEmpSalary()>50000).forEach(e-> System.out.println(e.getEmpSalary()));
        System.out.println("Location Start with M");
        employees.stream().filter(l->l.getEmpLocation().startsWith("M")).forEach(l-> System.out.println(l.getEmpLocation()));
        System.out.println("Designation Ending with E");
        employees.stream().filter(d->d.getEmpDesignation().endsWith("E")).forEach(d-> System.out.println(d.getEmpDesignation()));
    }
}
