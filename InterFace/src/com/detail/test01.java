package com.detail;

public class test01 {
    public static void main(String[] args) {
        //new Usb01();//接口不能实例化
    }
}
interface Usb01{}

interface Usb02{
    //接口中抽象方法，可以不用abstract修饰
    //接口中所有的方法是的访问修饰符public
//    protected void a();//wrong
//    private void aa();//wrong

    //接口中的方法使用了 默认访问修饰符 在接口中就相当于使用了 public访问修饰符
    void aaa();
}


interface Usb03{
    void ok();
    void en();
}
//一个普通类实现接口，就必须将该接口的所有方法的都实现，可以使用alt+enter解决
class M implements Usb03{
    @Override
    public void ok() {

    }

    @Override
    public void en() {

    }
}

interface Usb04{
    void ok();
}
//抽象方法实现接口，可以不用实现接口的方法。
abstract class Z implements Usb04{

}
