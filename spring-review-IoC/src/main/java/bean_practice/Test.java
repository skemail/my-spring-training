package bean_practice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class,StringConfig.class);

        container.getBean(FullTimeEmployee.class).createAccount();
        container.getBean(PartTimeEmployee.class).createAccount();

        container.getBean("full", Employee.class).createAccount();
        container.getBean("part", Employee.class).createAccount();

        System.out.println(container.getBean("welcome"));
        System.out.println(container.getBean("practice"));

        System.out.println(container.getBean("welcome", String.class));
        System.out.println(container.getBean("practice", String.class));
    }
}
