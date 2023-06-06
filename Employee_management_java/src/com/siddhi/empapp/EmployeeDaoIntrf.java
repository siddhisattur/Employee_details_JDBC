package com.siddhi.empapp;

public interface EmployeeDaoIntrf {
    //create employee
    //show all emp
    //show emp based on id
    //update emp
    //delete emp

    public void createEmployee(Employee emp);
    public void showAllEmployee();
    public void  showEmployeeBasedOnID(int id);
    public void  updateEmployee(int id, String name);
    public void deleteEmployee(int id);

}
