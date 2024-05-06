//6）我们看一下创建一个子类时（继承关系），他们的静态代码块，静态属性初始化
//普通代码块，普通睡醒初始化，构造方法的调用顺序：
//6.1： 父类的静态代码块和静态属性的初始化（优先级一样，按定义顺序执行）
//6.2： 子类的普通代码块和普通属性的初始化（优先级一样，按定义顺序执行）
//6.3： 父类的普通代码块和普通属性的初始化（优先级一样，按定义顺序执行）
//6.4： 父类的构造方法
//6.5： 子类的普通代码块和普通属性的初始化（优先级一样，按定义顺序执行）
//6.6： 子类的构造方法
//
//小结：1、static>普通；2、先有父亲才有儿子；


package com.CodedBlock.Exercise;

public class test02 {
    /*
    注释代码加深了我对属性以及变量的理解
    数据类型 变量名；
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");

     */
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");//属于静态属性
    static {
        System.out.println("static块执行");//【2】
        if (sam == null) {
            System.out.println("sam is null");
        }
    }
    test02(){
        System.out.println("test01默认构造函数被调用");//【4】
    }

    public static void main(String[] args) {
        test02 t = new test02();
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);//【3】
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");//[1]讲解：static Sample sam = new Sample("静态成员sam初始化");
    }
}
