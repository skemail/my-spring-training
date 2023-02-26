package bean_practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullTimeEmployee extends Employee{

    public void createAccount(){
        System.out.println("Something FullTimeEmployee");
    }
}
