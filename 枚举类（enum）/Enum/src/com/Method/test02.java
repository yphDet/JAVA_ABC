package com.Method;

//enum常用方法。


//100% 4) values：返回当前枚举类中所有的常量
//80% 5) valueOf：将字符串转换成枚举对象，要求字符串必须
//为已有的常量名，否则报异常！
//80% 6) compareTo：比较两个枚举常量，比较的就是编号！
public class test02 {

    public static void main(String[] args) {
      //从反编译可以看出 values方法，返回 Season1[]
        //含义定义的所有枚举对象
        Season1[] season1 = Season1.values();
        System.out.println("====遍历取出枚举对象（增强for）===");
        //解读：
        /*
        Season1 s表示新建一个变量，season1表示数组名
        增强for 从数组season1中遍历放入新建变量中
         */
        for(Season1 s:season1){
            System.out.println(s);
        }
    }
}
enum Season1{//1、当我们使用enum关键字开发一个枚举类是，默认会继承Enum类

    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");//枚举对象的创建
    private String name;
    private String desciption;

    Season1(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    Season1() {
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}

