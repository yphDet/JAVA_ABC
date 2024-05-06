package com.detail;

public class test02 {
    public static void main(String[] args) {

    }
}
abstract class AA{
    public abstract void ok();
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，
//如它想实现的化可以定义为abstract；定义成抽象类之后还是可以实现的；

abstract class BB extends AA{

//    public void ok(){
//        System.out.println("BB");
//    }
}
class CC extends BB{
    public void ok(){
        System.out.println("ok");
    }
}
