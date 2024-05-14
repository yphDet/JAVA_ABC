package com.CustomInterfaceGeneric;

public class CustominterfaceGeneric_ {
    public static void main(String[] args) {
        //【自定义泛型接口的注意事项】
    }
}
//抽象方法  普通方法
interface IUsb<U,R>{
    //普通成员使用泛型
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    //泛型方法
    <E> R set(E e);

    //在JDK8中，可以在接口中，使用默认方法
    default R method(U u){
        return null;
    }
}

//泛型接口的类型，在继承接口或者实现接口时确定
/*
1、继承接口
        注意重写中的参数类型于泛型接口的参数类型
 */
class A implements IUsb<String ,Integer>{
    //说明：在实现IUsb接口的方法时，使用String替换U，Integer替换R
    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }

    @Override
    public <E> Integer set(E e) {
        return null;
    }

    @Override
    public Integer method(String s) {
        return IUsb.super.method(s);
    }
}

/*
2、实现接口
 */
interface usb extends IUsb<Double,Character>{}


//没有指定类型，默认为Object类型
interface USB extends IUsb{}//等价于   interface USB extends IUsb<Object,Object>{}
//但是推荐使用下面这种
interface B extends IUsb<Object,Object>{}
