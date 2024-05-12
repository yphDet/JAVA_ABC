package com.Exercise;

public class work01 {
    public static void main(String[] args) {
        //三元运算符【是一个整体】，看最小精度；
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);//1.0

        //
        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);//1
    }
}
