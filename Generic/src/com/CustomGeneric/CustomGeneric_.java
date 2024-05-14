package com.CustomGeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {
        //【1、普通成员使用泛型；】
    }
}
class Tiger<T,E>{
    String name;

    //1、普通成员使用泛型
    /*
    1.1属性
     */
    T t;
    E e;
    /*
    1.2成员
     */
    public T say(){//返回值类型为泛型
        return t;
    }//返回值类型为形参
    public void say1(T t1){}//参数类型为泛型
    public T say2(T t2){
        return t2;
    }


}