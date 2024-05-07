
package com.duct;

public class test01 {
}
//接口有点类似于 抽象模板。
interface Usb{//接口
    //在接口中abstract关键字可以省略不写。
    public void start();//抽象方法
    public void end();
}
//implements 中文意思是：执行，贯彻；工具
//在这里是类 执行 接口
class Camera implements Usb{//实现接口,就是把接口方法的实现。
//接口方法的实现。
    @Override
    public void start() {
        System.out.println("我是相机，开始工作了？？");
    }

    @Override
    public void end() {
        System.out.println("我是相机，结束工作了!!");
    }
}
class Phone implements Usb{
    public void start(){
        System.out.println("我是手机，开始工作了！！！");
    }

    public void end(){
        System.out.println("我是手机，结束工作了！！！");
    }
}
class Computer{
    public void working(Usb usb){
        usb.start();
        usb.end();
    }
}

interface USB{
    //在jdk8后，可以有默认实现方法，需要使用default关键字修饰
    default public void hi(){
        System.out.println("默认方法");
    }
    //在jdk8后，可以有静态方法。
    public static void ok(){
        System.out.println("静态方法");
    };
}