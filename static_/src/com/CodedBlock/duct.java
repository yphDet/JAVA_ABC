//什么是代码化快？
/*
代码化块又称初始化块，属于类中的成员【即 是类的一部分】

但是和方法不同，没有方法名、返回、参数；只有方法体，
而且不同通过对象或者类显示调用，
100% 而是加载类时，或创建对象时隐式调用（编译器会自动调用，但是又规则）
 */


//基本语法
/*
[关键字】{
    代码；
}
注意：
80% 1）：关键字 可选，要写的话，也只能写static
2）：代码块分为两类，使用static关键字的叫静态代码块，没有static关键字的叫普通代码块；
3）：逻辑语句可以为任何逻辑语句（输出，输入，方法第哦啊用，循环，判断等）
4）；结束符号 ; 可以写上，也可以忽略。
 */

//一般使用情况
/*
理解： 1）相当于另外一种形式的构造器（对构造器的补充机制），可以做初始化操作

 */
package com.CodedBlock;

public class duct {
    private String name;
    private int age;
    private char gender;

    //2）：场景：如果多个构造器中都有重复的语句，可以抽取到初始话块，提高代码的重用性【但是要用static来修饰代码块】
    public duct(){
        //System.out.println("go~~");
    }
    public duct(String name){
        //System.out.println("go~~");
        this.name = name;
    }
    public duct(int age,char gender){
        //System.out.println("go~~");
        this.age = age;
        this.gender = gender;
    }
    //2）：场景：如果多个构造器中都有重复的语句，可以抽取到初始话块，提高代码的重用性【但是要用static来修饰代码块】
    static {
        System.out.println("go~~");
    }
    public static void main(String[] args) {

        //普通代码块与静态代码块的被调用输出的结果不同；


        //代码块有static修饰时，static关键字往往于类加载有关，
        //什么是会发生类加载？但是无论这几种情况同时出现，类还是只会加载 一次
        //用类直接访问 静态属性/方法
        //创建对象等
        duct duct = new duct();
        duct duct1 = new duct("go");
        duct duct2 = new duct(39, '男');

    }

}
