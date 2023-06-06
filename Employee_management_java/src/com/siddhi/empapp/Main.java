package com.siddhi.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String name;
        EmployeeDaoIntrf dao=new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Add Employee \n"+
                    "2. Show All Employee \n"+
                            "3. Show Employee based on id \n"+
                            "4. Update the Employee \n"+
                            "5. Delete the Employee \n");
            System.out.println("Enter your choice");
            int c=sc.nextInt();
            switch (c){

                case 1:
                    Employee emp=new Employee();
                    System.out.print("Enter ID: ");
                     id=sc.nextInt();
                    System.out.print("Enter Name: ");
                     name=sc.next();
                    System.out.print("Enter Salary: ");
                    double salary=sc.nextDouble();
                    System.out.print("Enter Age: ");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id to show the details");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;
                case  4:
                    System.out.println("Enter id to update the details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name=sc.next();
                    dao.updateEmployee(empid1,name);
                    break;
                case 5:
                    System.out.println("Enter the id to delete");
                    id=sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thankyou for using the Application");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while (true);
    }
}
