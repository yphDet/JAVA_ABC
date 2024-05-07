package com.LocallInnerClass;


public class test01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.O02();
    }
}
class Outer01{
    private int o1 = 1;
    private void O01(){
        System.out.println("outer01.O01()");
    }

    public void O02(){
        //局部内部类：不能添加访问修饰符，因为它的地位就是一个局部变量。
        class Inner01{
            int i = 0;
            public void I01(){
                System.out.println("Inner01.I01()");
                //局部内部类---访问--->外部类的成员[访问方式：直接访问]
                System.out.println(o1);
                O01();
            }
        }
        //5、外部类--访问--->局部内部类的成员。
        /*
        创建对象，然后调用方法即可
         */
        Inner01 inner01 = new Inner01();
        inner01.I01();
    }
    //外部类要想访问局部内部类的成员，只能在定义局部内部类中的方法/代码块等 去访问，而且还可以访问其中的私有成员。
    //Inner01 inner01 = new Inner01();错误
}
