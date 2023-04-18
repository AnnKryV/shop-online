package org.example.app.services.employees;

import org.example.app.entities.Employee;
import org.example.app.repositories.employees.EmployeeReadRepository;
import org.example.app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeReadService {

    EmployeeReadRepository repository;

    public EmployeeReadService(EmployeeReadRepository repository) {
        this.repository = repository;
    }

    public String readEmployee() {

        List<Employee> list = repository.readEmployee();

        if (list != null) {
            if (!list.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach((prop) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") id: ")
                                .append(prop.getId())
                                .append(", ")
                                .append(prop.getFirstName())
                                .append(", ")
                                .append(prop.getLastName())
                                .append("\n")
                );
                return stringBuilder.toString();
            } else return Constants.DATA_ABSENT_MSG;
        } else return Constants.DATA_ABSENT_MSG;
    }
}
