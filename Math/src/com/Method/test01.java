package com.Method;

public class test01 {
    public static void main(String[] args) {
        //看看Math常用的方法（学会使用API 来查询方法以及可以自己运用起来）
        //1.abs绝对值
        int n1 = Math.abs(-9);
        System.out.println(n1);

        //2.pow 求幂
        //Api中表示只能用double类型
//        int n2 = Math.pow(3,4);
//        System.out.println(n2);
        double d1 = Math.pow(1.23,5);
        System.out.println(d1);

        //3.ceil 向上取整，返回 >= 该参数的最小整数（转成double）
        //只能用double类型表示
        double d2 = Math.ceil(-5.13);//-5.00
        System.out.println(d2);

        //4.floor 向下取整，返回 <= 该参数的最大整数（转成double)
        d2 = Math.floor(-1.23);//-2.00
        System.out.println(d2);

        //5.round 四舍五入
        //只能有long类型
        long r = Math.round(5.132);//5
        System.out.println(r);

        //6.sqrt 求开方
        //只能有double型
//        int n2 = Math.sqrt(16);//wrong
        double d4 = Math.sqrt(16);
        System.out.println(d4);

        //7.random 求随机数【返回的是[0,1)范围之内的数】
        for(int i = 0;i <= 3 ;i++){
            System.out.println(Math.random());
        }
        //思考：请写出获取a-b之间的一个随机整数，比如： a = 2；b = 7；
        double a = 2.14;
        double b = 7.389;
        int d = (int)b;
        int a1 = (int) a;
        int b1 = (int)(Math.random()*(d - a + 1) +a);//[2,8) => [2,7]
        System.out.println(b1);
                //Math.random()*(d - a + 1)的取值是[0,6)

    }
}
