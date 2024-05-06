package com.detail;

public class test01 {
}
//当类中有抽象方法时，需要将类改为抽象类
//抽象类:
//语法：
//访问修饰符 abstract class 类名{}
abstract class A{
    //抽象方法：
    // 语法：访问修饰符 abstract 返回类型 方法名(参数列表);
    public abstract void hi();
}
class B extends A{
    //子类继承父类（抽象类）必须对抽象方法进行实现
    public void hi(){
        System.out.println("抽象方法hi");
    }
}
