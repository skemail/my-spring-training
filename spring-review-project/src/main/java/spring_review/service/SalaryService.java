package spring_review.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring_review.repository.*;

@Data
@Component
public class SalaryService {

    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository,@Qualifier("overTimeHours") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){

        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());

    }
}
