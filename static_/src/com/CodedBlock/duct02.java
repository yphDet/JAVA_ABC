package com.CodedBlock;

//【与duct.java文件中的   代码复用性进行比较---对比输出结果、代码块有无修饰符的区别】

public class duct02 {
    private String name;
    private int age;
    private char gender;

    //2）：场景：如果多个构造器中都有重复的语句，可以抽取到初始话块，提高代码的重用性【但是要用static来修饰代码块】
    public duct02(){
        System.out.println("go~~");
    }
    public duct02(String name){
        System.out.println("go~~");
        this.name = name;
    }

    public duct02(int age,char gender){
        System.out.println("go~~");
        this.age = age;
        this.gender = gender;
    }

    //2）：场景：如果多个构造器中都有重复的语句，可以抽取到初始话块，提高代码的重用性【但是要用static来修饰代码块】
    {
        System.out.println("go~~");
    }
    public static void main(String[] args) {
        //普通代码块与静态代码块的被调用输出的结果不同；

        //当代码块没有static修饰时，每次创建对象都会调用代码块【创建对象时隐式调用（编译器会自动调用，但是又规则）】
        //每次创建对象的时候都会调用构造器中的代码，如果多个构造器中出现相同语句，那么太繁琐了
        duct02 duct = new duct02();
        duct02 duct1 = new duct02("go");
        duct02 duct2 = new duct02(39, '男');
    }
}
