package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("full")
    public Employee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean("part")
    public Employee partTimeEmployee(){
        return new PartTimeEmployee();
    }

}
