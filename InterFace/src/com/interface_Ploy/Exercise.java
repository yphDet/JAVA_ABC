package com.interface_Ploy;

public class Exercise {
}
interface A{
    int x = 0;//接口中的属性本质是：public final static int a = 0;
}
class B{
    int x = 1;
}
class C extends B implements A{
    public void pX(){
        //System.out.println(x);//wrong存在争议；
        //解决方法：
        System.out.println(A.x + " " + super.x);//*
    }

    public static void main(String[] args) {
        new C().pX();
    }
}
