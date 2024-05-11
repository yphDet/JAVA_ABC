package com.duct;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})
//JFrame对应窗口,可以理解成一个画板
public class DrawCricle extends JFrame{//类似画板
    public static void main(String[] args) {
        new DrawCricle();
    }

    private MyPanel mp = null;

    public DrawCricle(){
        //定义一张画纸
        mp = new MyPanel();//‘拿’一张画纸
        //把画纸放入到画板
        this.add(mp);//将画纸放在画板上

        //设置窗口的大小
        this.setSize(400,300);//设置画板的大小.

        this.setVisible(true);//是否展示

        //当点击窗口的 × 图标,程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel{//类似画纸
    @Override
    //1.MyPanel对象就是一个画纸.
    //2.Graphics g 把 g 理解成一个画笔
    //3.Graphics 提供了很多绘图的方法
    public void print(Graphics g)/*绘图方法*/ {//Granphics类 类似 画笔类
        super.print(g);//调用父类方法完成初始化.

//绘制图形
        //画直线
        g.drawLine(0,0,10,10);
//
//        //画矩形边框
//        g.drawRect(0,0,10,10);
//
//        //画椭圆边框
//        g.drawOval(0, 0, 100, 100);
//
//        //填充矩形
//        g.setColor(Color.green);
//        g.fillRect(0,0,10,10);
//
//        //填充椭圆
//        g.setColor(Color.MAGENTA);
//        g.fillOval(0,0,10,10);
//
//        //画图片
//        //1、获取图片资源，/img.png 表示在该项目的根目录去获取 img.png 图片资源。
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/img.png"));
//        g.drawImage(image,0,0,920,518,this);
//
//        //画字符串  设置画笔的字体/颜色
//        g.setColor(Color.red);//设置画笔的颜色
          //传入字体对象
//        g.setFont(new Font("行楷",Font.BOLD,50));//字体，粗细，大小
//        g.drawString("北京欢迎你！",0,0);//字符串 放置位置。
    }
}
