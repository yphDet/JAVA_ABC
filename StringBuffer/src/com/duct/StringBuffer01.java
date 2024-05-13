package com.duct;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1、StringBuffer 的直接父类是 AbstractString
        //2、StringBuffer 实现了Serializable，即StringBuffer的对象可以串行化
        //串行化：是一个将对象状态转换为字节流的过程

        //3、在父类中 AbstractStringBuilder 有属性 char[] value,不是final
        //该value数组存放在 字符串内容，引出存放的堆中的。
        //对比String类中存放 字符串内容的是 属性 private final char[] value;
        //4、StringBuffer是一个final类，不能被继承。

        //5、因为StringBuffer 字符内容是存在 char[] value 所有在变化（增加/删除）
        //  不用每次都更改地址（即不是每次创建新对象），所以效率高于 String
        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
