package com.CodedBlock.detail;

public class test01 {
    public static void main(String[] args) {

//        System.out.println(A.n2);//先类加载，再输出。【类只会加载一次】
        //类加载与  类变量的初始化以及static代码块有关。     与类方法无关。
//        new A();//2.1
//        new A();//1.1
        A.setn3();//解决问题
//        new C();//2.2理解：先有父亲才有儿子；
//        System.out.println(D.nD);//2.3 &（3）/*静态代码块与静态成员执行是否 有优先级（调用顺序）？ */
//        //4)中会进行详细说明；
    }
}
class A{
    private static int n3;//类加载时不会自动调用类方法(我的思考问题)，但是还是会有进行初始化（默认值/直接给定的值）
    public static void setn3(){
        System.out.println("静态属性在类方法中进行初始化");
        n3 = 300;//相当于后续操作
    }
    private int n1 = 100;
    public static void say(){
        System.out.println("say");
    }
    public static int n2 = 200;
    static{
        System.out.println("A类的静态代码块");
    }
}

class B{
    static{
        System.out.println("B类的静态代码块");
    }
}
class C extends B{

}

class D{
    static{
        System.out.println("D类的静态代码块");
    }
    {
        System.out.println("D类的普通代码块");
    }
    public static int nD = 4;
}