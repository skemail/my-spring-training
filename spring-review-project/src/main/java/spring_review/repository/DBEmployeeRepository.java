package spring_review.repository;

import lombok.Data;
import org.springframework.stereotype.Component;
import spring_review.model.Employee;

@Component
@Data
public class DBEmployeeRepository implements EmployeeRepository{

    int hourlyRate = 55;

    @Override
    public int getHourlyRate() {

        Employee employee = new Employee("Kemal", "IT", 65);
        return employee.getHourlyRate();
    }

}
