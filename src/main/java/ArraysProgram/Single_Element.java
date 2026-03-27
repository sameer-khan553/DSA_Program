package ArraysProgram;

class Single_Element {


    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int res = 0;
        for (int x : arr) {
            res ^= x;
        }
        System.out.println(res);
    }
}
