package stereotype_annotations.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component("data")
@Data
public class DataStructure extends Course {

    private final ExtraHours exHours;

    public void getTotalHours(){
        System.out.println("Total hours is: " + (32 + exHours.getHours()));
    }

}
