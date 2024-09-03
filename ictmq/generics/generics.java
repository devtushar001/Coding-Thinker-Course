package ictmq.generics;

import java.util.ArrayList;

// class MyGenerics<T1> {
//     int val;
//     private T1 t1;
    
//     public MyGenerics(int val, T1 t1) {
//         this.val = val;
//         this.t1 = t1;
//     }

//     public int getVal() {
//         return val;
//     }

//     public void setVal(int val) {
//         this.val = val;
//     }
   
//     public T1 getT1() {
//         return T1;
//     }

//     public void setT1(T1 t1) {
//         this.t1 = t1;
//     }
// }

public class generics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // System.out.println("Hello Sir");

        @SuppressWarnings("rawtypes")
        ArrayList<Double> arrayList = new ArrayList(7);
        arrayList.add(43.12);
        arrayList.add(23.78);
        arrayList.add(3.781);
        arrayList.add(9.741);
        arrayList.add(4.1234);
        arrayList.add(6.12457);
        arrayList.add(7.7412);
        arrayList.add(73.16542);

        // double a = arrayList.get(3);
        // System.out.println(a);

        // MyGenerics<String> g1 = new MyGenerics(23, "MyString");
        // System.out.println(g1);
    }
}
