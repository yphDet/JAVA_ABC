package com.HouseRent.domain;

public class Houses {
    private int id;
    private String name;
    private String tel;
    private String address;
    private int rent;
    private String state;

    public Houses(int id, String name, String tel, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + tel +
                "\t\t" + address +
                "\t" + rent +
                "\t" + state ;
    }
}
