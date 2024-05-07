//基于接口的匿名内部类

package com.AnonymousInnerClass;

public class test01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.methiod();
    }
}
class Outer01{
    private int n1 = 10;
    public void methiod(){
        //基于接口的匿名内部类
        //老韩解读
        //1、需求：想使用A接口，并创建对象
        //2、传统方式，2.1：写一个类，2.2；实现该接口，2.3并创建对象（引出匿名内部类）
        //3、这里的tiger类只是使用一次，后面不在使用
        //4、可以使用匿名内部类来简化开发
        //5、tiger的编译类型---》A
        //6、tiger的运行类型---》通过tiger.getclass()查看；
        /*

        匿名内部类的语法
        new 接口名/类名(参数){
            成员
        }

        匿名内部类的底层实现：
        1）、先创建一个局部内部类
        class XXX(匿名内部类的类名---随机取名) implements 接口名{
            重写;
            自己的成员;
        }
        2）、创建一个对象。
        new XXX(参数列表);
         */

        //匿名内部类；
        A tiger = new A(){//灵活；
            public void cry(){
                System.out.println("Innertiger:cry");
            }
            public void hi(){

            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型：" + tiger.getClass());
    }
}
interface A{//接口类似与抽象类
    public void cry();
}

//class Tiger implements A{
//    public void cry(){
//        System.out.println("tiger：cry");
//    }
//}
//
//class dog implements A{
//    public void cry(){
//        System.out.println("dog:cry");
//    }
//}
