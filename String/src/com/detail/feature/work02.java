package com.detail.feature;
//画出内存布局图
public class work02 {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        work02 ex = new work02();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + "and");
        System.out.println(ex.ch);

    }
}
