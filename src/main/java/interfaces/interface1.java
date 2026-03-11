package interfaces;

import java.time.LocalDateTime;

public interface interface1 {

    void cook();
    LocalDateTime time();

    public default void m1() {
        System.out.println("hello");
    }
}
