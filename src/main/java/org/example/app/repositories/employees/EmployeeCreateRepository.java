package org.example.app.repositories.employees;

import org.example.app.database.DBConn;
import org.example.app.entities.Employee;
import org.example.app.utils.Constants;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeCreateRepository {

    public String createEmployee(Employee employee) {
        String sql = "INSERT INTO " + Constants.TABLE_EMPLOYEES + "(name) VALUES(?)";
        try (PreparedStatement empmt = DBConn.connect().prepareStatement(sql)) {
            empmt.setString(1, employee.getFirstName());
            empmt.setString(2,employee.getLastName());
            empmt.setString(3, employee.getPhone());
            empmt.setString(4, employee.getBirthDate());
            empmt.setInt(5, employee.getId());
            empmt.setInt(6, employee.getPositionId());
            empmt.setDouble(7, employee.getSalary());
            empmt.executeUpdate();
            return Constants.DATA_INSERT_MSG;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
