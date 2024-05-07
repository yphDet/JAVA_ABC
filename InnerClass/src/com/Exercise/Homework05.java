package com.Exercise;

public class Homework05 {
}
class A{
    private String name;

    public void Inner(){

        class B{//3.不能添加访问修饰符,但是可以使用 final 修饰

           //final 修饰的属性在定义时，必须赋初值并且以后不能再修改，
           // 赋值可以在如下位置之一【选择一个位置赋初值即可】：
            /*
            1. 定义时：如 public final double TAX_RATE=0.08;
            2. 在构造器中
            3. 在代码块中
            */

            /*
            如果 final 修饰的属性是静态的，则初始化的位置只能是
            1 定义时 2 在静态代码块 不能在构造器中赋值。
            */
            private final String name = "学java";
            public void show(){
                System.out.println(name + "\t" + A.this.name);
            }
        }
    }
}
