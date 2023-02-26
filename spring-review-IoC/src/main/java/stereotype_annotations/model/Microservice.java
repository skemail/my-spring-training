package stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component("mic")
public class Microservice extends Course {

    public void getTotalHours(){
        System.out.println("Total hours is: " +50);
    }
}
