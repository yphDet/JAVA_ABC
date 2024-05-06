package com.detail;

public class test03 {
    public static void main(String[] args) {

    }
}
final class AAA{
    //final类不可以被继承，因此方法无法重写，
    // 所以一般来说，如果一个类已经是final类了，就没有必要在将方法修饰成final方法。
    public void say(){}
}

class BBB{
//    final不能修饰构造方法（构造器）
//    public final BBB(){
//
//    }
}


