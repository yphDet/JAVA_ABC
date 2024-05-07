package com.interface_Ploy;

public class test01 {
    public static void main(String[] args) {
        //接口的多态数组
        Usb[] usb = new Usb[2];//数组的创建

        //接口的多态参数
        usb[1] = new Phone();
        usb[0] = new Camera();
        //除了调用Usb接口定义的方法外，还需要调用Phone特有方法call
        for(int i = 0;i < usb.length;i++){
            //接口存在多态传递现象
            if(usb[i] instanceof Phone){//instanceof 是用于比较 运行类型是否相同
                ((Phone) usb[i]).call();
            }
            usb[i].start();
            usb[i].end();
        }
    }
}
interface Usb{
    void start();
    void end();
}
class Phone implements Usb{

    public void call(){
        System.out.println("手机，hi");
    }

    @Override
    public void start() {
        System.out.println("手机，开始");
    }

    @Override
    public void end() {
        System.out.println("手机，结束");
    }
}

class Camera implements Usb{

    @Override
    public void start() {
        System.out.println("相机，开始");
    }

    @Override
    public void end() {
        System.out.println("相机，结束");
    }
}
class Computer{
    public void work(Usb usb){//接口的多态参数
        usb.start();
        usb.end();
    }
}