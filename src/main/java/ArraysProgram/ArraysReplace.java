package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysReplace {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list, (a,b) ->b-a);
        System .out.println(list);
    }


}
