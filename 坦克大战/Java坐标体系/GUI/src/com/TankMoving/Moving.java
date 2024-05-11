package com.TankMoving;

import javax.swing.*;

public class Moving extends JFrame {
    public static void main(String[] args) {
        new Moving();
    }
    Mprint mprint = null;
    public Moving(){
        mprint = new Mprint();
        this.add(mprint);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addKeyListener(mprint);
    }

}
