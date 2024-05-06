package com.duct;

public class test01 {
    public static void main(String[] args) {
        D d = new D();
        d.tax_rate = 1;
        //d.TAX_RATE = 8;
    }
}
//1)当不希望类被继承时，可以用final修饰
/*
final class A{

}
class B extends A{

}
 */
class D{
    //3）当不希望类的某个属性的值被修改，可以用final修饰。
    public double tax_rate = 0.1;
    public final double TAX_RATE = 0.8;
    public void hi(){
        System.out.println("hi--D");
    }
    //当不希望父类的某个方法被子类覆盖/重写时，可以用final关键字修饰。
    public final void ok(){
        System.out.println("ok");
    }
}
class E extends D{
    public void hi(){
        System.out.println("hi--E");
    }
//    public void ok(){
//
//    }
}

class F{
    public void no(){
        final double n = 0.2;
       // n = 2;//当不希望某个局部变量别修改，可以使用final修饰
    }
}
