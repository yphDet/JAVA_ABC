package com.Exercise;
/*
输入商品名称和商品价格，要求打印效果示例，
使用前面学习的方法完成
商品名 商品价格
手机  123,564.59
//比如价格3,456,789.88要求：价格的小数点前面每三位用逗号隔开，在输出。
 */
public class work02 {
    public static void main(String[] args) {
        String s = "12345368.59";
        StringBuffer sb = new StringBuffer(s);
//        int index = sb.lastIndexOf(".");
//        sb.insert(index-3,",");
//        System.out.println(sb);
        for(int i = sb.lastIndexOf(".") - 3;i > 0;i-=3){
            sb.insert(i,",");
        }
        System.out.println(sb);


    }
}
