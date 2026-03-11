package interfaces;

import java.time.LocalDateTime;

public class Food implements interface1{
    @Override
    public void cook() {
         LocalDateTime time =  LocalDateTime.now();
        System.out.println("Food is cooking");
        System.out.println("time is: " + LocalDateTime.now());
    }

    @Override
    public LocalDateTime time() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        Food f = new  Food();
        f.cook();       // calling the cook method

        System.out.println("Current Time  is :"  +f.time());
    }

}
