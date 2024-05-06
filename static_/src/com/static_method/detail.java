//使用注意实现和细节讨论
/*
1、什么时候需要用类方法？
当方法中不涉及到任何和对象相关的成员

80% 2、类方法和普通方法都是随着类的加载而加载，将【结构信息】存储在方法区
2.1：类方法中无this等关键字的使用(静态方法不能使用与对象有关的关键字！！！)
2.2：普通方法可以使用关键字。

100% 3、类方法与普通成员方法的区别
3、1 类方法（静态方法）中 只能访问 静态方法 或静态方法
3、2 普通成员方法，既可以访问 普通变量（方法），也可以访问静态变量（方法）
 */

package com.static_method;

public class detail {
}
class A{
    private int n = 100;
    public void say(){

    }
    public static void hi(){
        /*
        类方法中不允许使用和对象有关的关键字
        System.out.println(this.n);
         */

        /*类方法只能访问静态变量（方法）
        System.out.println(n);
         */
    }
}
