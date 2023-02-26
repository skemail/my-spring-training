package spring_review.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private  String name;
    private  String department;
    private  int hourlyRate;
}
