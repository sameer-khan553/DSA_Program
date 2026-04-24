package ArraysProgram;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int [] arr = element(new int[] {1,1,1,2,2,3},2);
        System.out.println(Arrays.toString(arr));
    }

    static int [] element(int [] nums, int k) {
        int [] res  = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

    Queue<Integer> queue = new PriorityQueue<>((a,b) ->map.get(a)-map.get(b));

        for(int key :  map.keySet()){
            queue.add(key);

            if(queue.size()>k){
                queue.poll();
            }
        }
        while(k--> 0) {
            res[k] =  queue.poll();
        }
        return res;
    }


}
