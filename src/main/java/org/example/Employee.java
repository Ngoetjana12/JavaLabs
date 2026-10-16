package org.example;

import java.util.ArrayList;

public class Employee {
    String employeeNumber;
    String name;
    double salary;

    Employee(String employeeNumber, String name, double salary){

        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    void display(ArrayList<Employee> employees){

        System.out.println("ALL Employees");
        for(int i=0; i<employees.size(); i++){

            System.out.println("--------------");
            System.out.println("Employee:" + employees.get(i).employeeNumber);
            System.out.println("Name:" + employees.get(i).name);
            System.out.println("Salary:R" + employees.get(i).salary);
        }

        System.out.println();


        for(int i=0; i<employees.size(); i++){

            if(employees.get(i).salary < 10000 && employees.get(i).salary >0){

                System.out.println("Employees earning 10k and less");
                System.out.println("Employee:" + employees.get(i).employeeNumber);
                System.out.println("Name:" + employees.get(i).name);
                System.out.println("Salary:R" + employees.get(i).salary);

            }else if(employees.get(i).salary >= 10000 && employees.get(i).salary < 20000){

                System.out.println("=====================================");
                System.out.println("Employees earning between 10k and 20k");
                System.out.println("Employee:" + employees.get(i).employeeNumber);
                System.out.println("Name:" + employees.get(i).name);
                System.out.println("Salary:R" + employees.get(i).salary);
            }
            else{
                System.out.println("=====================================");
                System.out.println("Employees earning 20k and more");
                System.out.println("Employee:" + employees.get(i).employeeNumber);
                System.out.println("Name:" + employees.get(i).name);
                System.out.println("Salary:R" + employees.get(i).salary);
            }
        }
    }

}
