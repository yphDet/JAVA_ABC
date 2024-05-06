
package com.static_variable;

//使用注意实现和细节讨论
/*
1、什么时候需要用类变量？
当我们需要让某个类的所有对象都共享一个变量时，就可以考虑
使用类变量（静态变量）
2、类变量与实例变量（普通属性）区别
实例变量不能通过 类名.类变量名 方式访问
100% 3、类变量是在类加载时就初始化，也就是说，即使没有创建对象，只要类加载了，
就可以使用类变量了。
4、类变量的生命周期是随类的加载开始，随着类消亡而销毁。
40% 5、访问时，要遵循访问修饰符的访问范围；
 */

public class detail {
    public static void main(String[] args) {
        //3:类加载就可以使用类变量
        System.out.println(A.num);
        A.num = 2;

        A a = new A();
        //普通变量的访问方式 不可以：类名.变量名  A.count;、
        System.out.println(a.count);

        //性质：同包同名类中的任一对象以及同包同名类共有 类变量
        System.out.println(a.num);

    }
}
class A{
    protected int count = 0;
    static int num;
}
