package com.LocallInnerClass;

public class test02 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.O02();
    }
}
class Outer02{
    private int a = 2;
    public void O02(){
        class Inner02{
            private int a = 1;
            public void I02(){
                //7、如果外部类和局部内部类的成员重名时，默认遵循就近原则
                //如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
                System.out.println(a + " " + Outer02.this.a );
                //对Outer02.this.a的解读： Outer02.this本质就是外部类的对象
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.I02();
    }
}