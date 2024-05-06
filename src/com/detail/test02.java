package com.detail;

public class test02{
    public static void main(String[] args) {
        B b = new B();//final类不能继承，但是可以实例化对象。
        D d = new D();
        d.say();
    }
}
class A{
    //3、如果final修饰的属性是静态的，
    // 则初始化的位置只能是如下：
    public final static int a = 1;//定义时；

    public final static int b;
//    public A(){//不能在构造器中赋值。
//        b = 3;
//    }
    static{
        b = 2;//在静态代码块
    }
}
final class B{

}
//如果不是final类，但是含有fianl方法，则该方法虽然不能重写，但是可以被继承。
class C{
    public final void say(){
        System.out.println("say");
    }
}

class D extends C{

}