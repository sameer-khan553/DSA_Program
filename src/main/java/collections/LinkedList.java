package collections;

import java.util.LinkedList;

class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        LinkedList<Integer> odd = new LinkedList();
        LinkedList<Integer> even = new LinkedList();


        for (int i =0; i<list.size();i++){
            if(list.get(i)%2!=0) {
                odd.add(list.get(i));
            }
            else {
                even.add(list.get(i));
            }
        }

        odd.addAll(even);
        System.out.println(odd);
    }
}
