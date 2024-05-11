package com.detail;

public class tryExercise02 {
    public static int method(){//静态方法只能调用静态成员（成员是归属于类）
        int i = 1;//这是局部变量
        try{
            i++;
            String[] names = new String[3];
            if(names[1].equals("tom")){//当代码执行到这一行发生异常，就不会再执行后面的语句了；
                System.out.println(names[1]);
            }else{
                names[3] = "hspedu";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return 2;
        }catch(NullPointerException e){//捕获
            return ++i;//i=3 => 保存临时变量 temp = 3；
        }finally {//必须执行；
            return ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());//4
    }
}
