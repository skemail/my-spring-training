package stereotype_annotations.model;


import org.springframework.stereotype.Component;

@Component("dev")
public class Devops extends Course {


    public void getTotalHours(){
        System.out.println("Total hours is: " + 30);
    }
}
