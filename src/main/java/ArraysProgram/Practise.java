package ArraysProgram;

import java.util.HashSet;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        String str = "ab";


        char [] c  = str.toCharArray();

        for(int i =0;i<c.length;i++){
            for(int j =i+1;j<c.length;j++){
                System.out.print(c[i] +""+c[j]);
            }
            System.out.println();
        }
    }

/*import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char[] arr = str.toCharArray();

            int left = 0;
            int right = arr.length - 1;

            while(left < right) {

                if(arr[left] == ' ') {
                    left++;
                }
                else if(arr[right] == ' ') {
                    right--;
                }
                else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }

            System.out.println("Reversed String: " + String.valueOf(arr));
        }
    }

 */
}
