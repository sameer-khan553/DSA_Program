package ArraysProgram;

public class Container_With_Most_Water {


    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(m1(arr));
    }

    public static int m1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int water = 0;


        while (left < right) {
            int h = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = h * width;
            water = Math.max(water, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }
}
