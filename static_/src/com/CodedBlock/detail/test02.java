//注意：（静态/普通）属性初始化
package com.CodedBlock.detail;

//text中4）

public class test02 {
    public static void main(String[] args) {
        new A2();
    }
}
class A2{
    private static int nA1 = getnA1();//静态成员（属性，方法）只能调用静态成员（属性，方法）
    static{
        System.out.println("A2静态代码块");
    }
    private static int nA2 = getnA2();
    public static int getnA1(){
        System.out.println("nA1静态方法");
        return 1;
    }
    public static int getnA2(){
        System.out.println("nA2静态方法");
        return 2;
    }
    {
        System.out.println("A2普通代码块");
    }
    private int a1 = geta1();
    public int geta1(){
        System.out.println("a1普通方法");
        return 100;
    }
    private int a2 = getnA2();
    public A2(){
        System.out.println("A2默认构造器");
    }


}
