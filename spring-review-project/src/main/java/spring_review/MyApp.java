package spring_review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_review.config.MyConfig;
import spring_review.service.SalaryService;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);

        container.getBean(SalaryService.class).calculateRegularSalary();
    }
}
