package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Element_in_Each_row {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row in array: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column in array: ");
        int col = sc.nextInt();
        int [] [] arr = new int [row][col];

        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter "+(i+1)+" "+(j+1) + "element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            int min = arr[i][0];
            for(int j=0;j<col;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];

                }

            }
            sum+=min;
            System.out.println("Minimum element in " +(i+1) +" row is:"+min);

        }
        System.out.println("sum of min element: " + sum);
        System.out.println(Arrays.toString(arr));
    }
}
