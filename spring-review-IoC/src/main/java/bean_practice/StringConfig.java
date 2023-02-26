package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringConfig {

    @Bean("welcome")
    public String welcome(){
        return "Welcome to CydeoApp";
    }

    @Bean("practice")
    public String practice(){
        return "Spring Core Practice";
    }
}
