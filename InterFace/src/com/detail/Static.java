package com.detail;

public interface Static {
    static void ok(){
        System.out.println("ok");
    }
}
class Ab implements Static{
    public static void main(String[] args) {
        Static.ok();
    }
}