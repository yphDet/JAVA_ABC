package com.AnonymousInnerClass.Exercise;

public class work01 {
    public static void main(String[] args) {
        work01.show(new A(){//体现了匿名内部类本质是对象
            public void cry(){
                System.out.println("实参直接传递");
            }
        });
    }
    public static void show(A a){
        a.cry();
    }
}
interface A{
    public void cry();
}