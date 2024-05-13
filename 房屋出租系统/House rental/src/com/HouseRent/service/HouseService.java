package com.HouseRent.service;

import com.HouseRent.domain.Houses;

import java.util.Scanner;

public class HouseService {

    private Houses[] houses;
    private int housesNum = 1;

    public HouseService(int size){
        houses = new Houses[size];
        houses[0] = new Houses(1,"jack","118","海淀区",3000,"未出租");
    }

    public Houses[] Read(){
        return houses;
    }
    public boolean Creat(Houses newhouse){
        if (housesNum >= houses.length){
            return false;
        }
        houses[housesNum++] = newhouse;
//        housesNum++;
        return true;
    }
    public boolean Delete(int num){
        Houses[] t = houses;
        for (int i = 0;i < housesNum;i++){
            t[i] = houses[i];
            if (houses[i].getId() == num){
                houses[i] = null;
                for (int j = i + 1;j < houses.length;j++){
                    t[j-1] = houses[j];
                }
                houses = t;
                housesNum--;
                return true;
            }
        }
        return false;
    }

    public Houses Seek(int id){
//        for (int i = 0;i < houses.length;i++){//这里会报空指针异常
        for (int i = 0;i < housesNum;i++){
            if (id == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    public Houses Update(int num){
        for (int i = 0;i < housesNum;i++){
            if (houses[i].getId() == num){
                return houses[i];
            }
        }
        return null;
    }
}
