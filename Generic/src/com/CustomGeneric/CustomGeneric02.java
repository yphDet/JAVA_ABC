package com.CustomGeneric;

public class CustomGeneric02 {
    public static void main(String[] args) {

    }
}
class Dog<T>{
    //使用泛型的数组，不能初始化
    T t[];//定义可以
    /*
     T t01[] = new T[8];//初始化不行；【原因：编译器不知道分配多大的空间】
     //补充因为数组在new 不能确定T的类型，就无法在内存开空间
     */

    //静态成员中不能使用类的泛型
    // 【因为静态与类相关，在类加载时，对象还没有创建；所以如果静态方法和静态属性使用了泛型，JVM就无法完成初始化】

    /*属性
    public static T t02;
     */

    /*方法
    public static T t03(){//错误
        return t;
    }

    public static void t04(T t){//错误

    }
     */

}
