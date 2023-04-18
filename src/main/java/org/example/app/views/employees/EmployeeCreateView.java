package org.example.app.views.employees;

import org.example.app.entities.Employee;

import java.util.Scanner;

public class EmployeeCreateView {

    public Employee getData(){

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        String fn = "Enter employee's first name: ";
        System.out.print(fn);
        employee.setFirstName(sc.nextLine().trim());

        String ln = "Enter employee's last name: ";
        System.out.print(ln);
        employee.setLastName(sc.nextLine().trim());

        String id = "Enter employee's id: ";
        System.out.print(id);
        employee.setId(sc.nextInt());

        String idP = "Enter employee's id of position: ";
        System.out.print(idP);
        employee.setPositionId(sc.nextInt());

        String bd = "Enter employee's birth date: ";
        System.out.print(bd);
        employee.setBirthDate(sc.nextLine().trim());

        String sal = "Enter employee's salary: ";
        System.out.print(sal);
        employee.setSalary(sc.nextDouble());

        String ph = "Enter employee's phone: ";
        System.out.print(ph);
        employee.setPhone(sc.nextLine().trim());

        return employee;
}
    public void getOutput(String output) {
        System.out.println(output);
    }
}
