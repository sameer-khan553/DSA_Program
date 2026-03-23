package Arrays;

class Main {

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // first occurrence
    public static int findFirst(int[] arr, int target) {
       int left = 0; int right = arr.length-1;
       int ans = -1;

       while(left <= right ) {
           int mid = (left+right)/2;

           if(arr[mid] == target) {
               ans = mid;
               left = mid+1;
           }
           else if(arr[mid] < target) {
                left = mid+1;
           }
           else {
               right = mid-1;
           }
       }

        return ans;
    }

    // last occurrence
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1; // move right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int[] res = searchRange(arr, target);

        System.out.println(res[0] + " " + res[1]);
    }
}