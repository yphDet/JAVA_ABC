package com.AnonymousInnerClass.Exercise;

public class work02 {
}
interface Bell{
    void ring();//是抽象方法；《==》public static void ring();
    //接口中所有的方法都是public
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }

    public static void main(String[] args) {
        new CellPhone().alarmclock(new Bell(){
        //重写建议用快捷键alt + enter

            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        new CellPhone().alarmclock(new Bell(){
            //重写建议用快捷键alt + enter

            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
