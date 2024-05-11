package com.TankMoving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mprint extends JPanel implements KeyListener {

    tank t;

    public Mprint(){
        t = new tank(100,100);
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.fillRect(0,0,1000,750);

        drawtank(t.getX(),t.getY(),g,0,0);
    }

    public void drawtank(int x,int y,Graphics g,int dirct,int type){
        switch (type){
            case 0:
                g.setColor(Color.BLUE);
                break;
            case 1:
                g.setColor(Color.red);
                break;
            default:
                System.out.println("没有这种类型的坦克");
        }

        switch (dirct){
            case 0://上
                g.fillRect(x,y,10,60);
                g.fillRect(x+10,y+10,20,40);
                g.fillRect(x+30,y,10,60);
                g.fillOval(x+20,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1://右
                g.fillRect(x,y,60,10);
                g.fillRect(x+10,y+10,40,20);
                g.fillRect(x,y+30,60,10);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2://下
                g.fillRect(x,y,10,60);
                g.fillRect(x+10,y+10,20,40);
                g.fillRect(x+30,y,10,60);
                g.fillOval(x+20,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3://左
                g.fillRect(x,y,60,10);
                g.fillRect(x+10,y+10,40,20);
                g.fillRect(x,y+30,60,10);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                t.setDirct(0);
//                t.setY(t.getY()-1);
                t.moveUP();
                break;
            case KeyEvent.VK_A:
                t.setDirct(3);
//                t.setY(t.getX() - 1);
                t.moveLeft();
                break;
            case KeyEvent.VK_S:
                t.setDirct(2);
//                t.setY(t.getY()+1);
                t.moveDown();
                break;
            case KeyEvent.VK_D:
                t.setDirct(1);
//                t.setY(t.getX()+1);
                t.moveRight();
                break;
        }

        //为了让tank动
        this.repaint();//要理解repaint方法的作用，以及使用后的效果，选择合理位置
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
