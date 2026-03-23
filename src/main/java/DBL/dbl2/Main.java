package DBL.dbl2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        dbl2 dbl2 = new dbl2();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine().trim();

            String [] parts =  input.split(" ");


            String op = parts[0];

            switch (op) {
                case "insertFront" :
                    dbl2.insertFront(Integer.parseInt(parts[1]));
                    break;

                case "insertRear":
                    dbl2.insertRear(Integer.parseInt(parts[1]));
                    break;

                case "insertMid" :
                    dbl2.insertMid(Integer.parseInt(parts[1]),  Integer.parseInt(parts[2]));
                    break;


                case "deleteFront" :
                    dbl2.deleteFront();
                    break;

                case "deleteRear" :
                    dbl2.deleteRear();
                    break;

                case "deleteMid" :
                    dbl2.deleteMid(Integer.parseInt(parts[1]));
                    break;

                case "displayForward" :
                    dbl2.displayForward();
                    break;


                case "displayBackward" :
                    dbl2.displayBackward();
                    break;
            }
        }
    }
}
