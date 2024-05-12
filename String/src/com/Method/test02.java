package com.Method;

public class test02 {
    public static void main(String[] args) {

        //[1]--toUpperCase 转大写
        System.out.println("dali".toUpperCase());

//        [2]--tolowercase 转小写
        System.out.println("LDAJLI".toLowerCase());

//        [3]--concat    拼接
        System.out.println("dailsdas".concat("dali").concat("to"));

//        [4]--replace 替换字符串中的字符
            String s1 = "宝玉 and 林黛玉 林黛玉 贾宝玉";
        System.out.println(s1.replace("玉","wang"));//将字符串中的字符‘玉’ 替换成 "wang"

//        [5]--split 分割字符串，对于某些分割字符，返回一个数组
//        案例：String poem =“锄禾日当午，汗滴禾下土，谁知盘中餐粒粒皆辛苦；和文件路径
        String poem ="锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] s = poem.split(",");

//        我们需要转义比如\ |等
        String file = "D:\\aaa\\bb";
        String[] f = file.split("\\\\");
        System.out.println("==分割后内容==");
        for(int i = 0;i < f.length;i++){
            System.out.println(f[i]);
        }

        //[6]-- compareTo 比较两个字符串的大小,
        //如果前者大，则返回正数，后者大，则返回负数，如果相等，返回0
        //两种情况：字符串长度相等 与 不相等 的情况；
        System.out.println("kladsjoi".compareTo("dka"));
        System.out.println("sda".compareTo("sid"));
//        toCharArray 转换成字符数组
        poem = "happy";
        char[] chs = poem.toCharArray();
        for (int i = 0;i < chs.length;i++){
            System.out.println(chs[i]);
        }


//      [7]--  format 格式字符串，%s字符串%c字符%d整型%。2f浮点型案例，将一个人的信息格式化输出
        String name = "yph";
        int age = 20;
        char gender = '男';
        String arm = "大厂";
//拼接形式：
        System.out.println("我的姓名是"+ name +" 的目标是进"+ arm );
//格式化形式；优点向c语言中的输出形式，但是这里要运用方法；
        String m = "我的姓名是%s 的目标是进%s";
        String info = String.format(m,name,arm);
        System.out.println(info);

        //toCharArray 转换成字符数组
        char[] charArray = name.toCharArray();
        for(int i = 0;i < name.length();i++){
            System.out.println(charArray[i]);
        }
    }
}
