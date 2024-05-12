package com.Detail;
//包装类型和String类型的相互转换
//以Integer和String转换为例
public class test {
    public static void main(String[] args) {
        Integer i = 100;
        //方式一 ：类似字符串
        String str1 = i + "";
        System.out.println(str1);

        //方式二：调用包装类的方法(toString)
        String str2 = i.toString();
        System.out.println(str2);

        //方式三：装箱(valueOf方法)
        String str3 = String.valueOf(i);
        System.out.println(str3);
    }
}
