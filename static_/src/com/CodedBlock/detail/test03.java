package com.CodedBlock.detail;

public class test03 {
    public static void main(String[] args) {
        new B03();
        //
    }
}
class A03{
    static{
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类普通代码块");
    }
    private static int nA1 = getn();
    private int na1 = getn();
    public static int getn(){
        System.out.println("父类（普通属性的初始化）静态方法");
        return 3;
    }
    public A03(){
        System.out.println("父类构造器");
    }

}
class B03 extends A03{
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类普通代码块");
    }
    private static int nB1 = getn();
    private int nb1 = getn();
    public static int getn(){
        System.out.println("子类（普通属性的初始化）静态方法");
        return 6;
    }
    public B03(){
        System.out.println("子类构造器");
    }

}
