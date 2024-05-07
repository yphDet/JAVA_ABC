package com.detail;

public class Default {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.hello();
    }
}
interface Aa{
    default void hello(){
        System.out.println("当接口中的方法使用了default，与没有使用有什么区别");
    }
}
class AA implements Aa{}