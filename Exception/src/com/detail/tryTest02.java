package com.detail;

//异常处理机制方式——try细节4-->多catch的使用
/*
4、可以有多个catch语句，捕获不同的异常（进行不同的业务处理），
要求父类异常在后，子类异常在前，比如（Exception在后，NullPionterException在前）
如果发生异常，只会匹配一个catch（但第一次异常出现时，后面的代码将不再执行）
 */
//多个catch语句类似与else if 语句
public class tryTest02 {
    public static void main(String[] args) {

        //解读：
        /*
        1、如果try块中可能有多个异常
        2、可以使用多个catch
        3.要求子类异常写在前面，父类异常写在后面
         */
        try {
            String str = "aa";
            int num = Integer.parseInt(str);
            str = null;
            System.out.println(str.equals("adfda"));
        } catch (NumberFormatException e) {
            System.out.println("数字格式化不正确" + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("空指针异常" + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
