package spring_review.repository;

import lombok.Data;
import org.springframework.stereotype.Component;
import spring_review.model.Employee;

@Data
@Component
public class RegularHours implements HoursRepository{

    @Override
    public int getHours() {

        return 40;
    }

}
