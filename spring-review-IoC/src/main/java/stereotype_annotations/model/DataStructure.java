package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component("data")
@AllArgsConstructor
public class DataStructure extends Course {


    ExtraHours exHours;

    public void getTotalHours(){
        System.out.println("Total hours is: " + (32 + exHours.getHours()));
    }

}
