package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.MyConfig;
import stereotype_annotations.model.Course;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.Microservice;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);

        container.getBean(DataStructure.class).getTotalHours();

        container.getBean(Microservice.class).getTotalHours();

        container.getBean("data", Course.class).getTotalHours();

        container.getBean("mic", Course.class).getTotalHours();

    }
}
