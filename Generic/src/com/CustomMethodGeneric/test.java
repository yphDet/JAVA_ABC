package com.CustomMethodGeneric;

public class test {
    public static void main(String[] args) {
        //【想法测试：自定义泛型方法是否可用】
        /*
        静态与类有关，
        在这  类加载与静态成员的类型有关
        而泛型实例化是在对象创建时使用的；
         */
    }
}
class Dog<E>{
    //public E static num;错误
    //public<T> static void hi(T t){}错误
    //public static void ok(List<E> e){}//不行
}
