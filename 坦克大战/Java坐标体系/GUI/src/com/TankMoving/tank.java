package com.TankMoving;

public class tank {
    private int x;
    private int y;
    private int dirct;

    public int getDirct() {
        return dirct;
    }

    public void setDirct(int dirct) {
        this.dirct = dirct;
    }

    public tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void moveUP(){
        y--;
    }
    public void moveDown(){
        y++;
    }
    public void moveRight(){
        x++;
    }
    public void moveLeft(){
        x--;
    }
}
