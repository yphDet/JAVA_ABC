package com.detail;

public class tryExercise01 {
    public static int method(){
        //解读：
        try{
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
            return 3;
        }finally {//必须执行；
            return 4;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
