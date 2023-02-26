package bean_practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartTimeEmployee extends Employee{

    public void createAccount(){
        System.out.println("Something PartTimeEmployee");
    }
}
