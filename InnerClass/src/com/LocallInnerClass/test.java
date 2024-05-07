package com.LocallInnerClass;

public class test {

    public void ok(){
        class A{
            private int n = 1;
        }

        A a = new A();
        System.out.println(a.n);
    }
    private int i = 1;
}
class T{
    public static void main(String[] args) {
        test t = new test();
        //System.out.println(t.i);//错误，无法访问
        t.ok();
    }
}
