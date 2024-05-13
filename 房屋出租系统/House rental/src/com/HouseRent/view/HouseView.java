package com.HouseRent.view;

import com.HouseRent.domain.Houses;
import com.HouseRent.service.HouseService;
import com.HouseRent.utils.Utility;

import java.util.Scanner;

public class HouseView {

    private HouseService houseService;
    private static int id = 1;
    private boolean loop = true;

    public HouseView(){
        houseService = new HouseService(10);
    }
    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n=============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.next().charAt(0)) {
                case '1':
                    CreatHouses();
                    break;
                case '2':
                    SeekHouses();
                    break;
                case '3':
                    DeleteeHouses();
                    break;
                case '4':
                    UpdateHouses();
                    break;
                case '5':
                    ReadHouses();
                    break;
                case '6':
                    ExitAPP();
                    break;
                default:
                    System.out.println("输入的有误，请重新输入(1-6)");
            }
        } while (loop);
    }

    public void CreatHouses(){//添加房屋
        System.out.println("----------添加房屋----------");
        System.out.print("姓名： ");
        String name = Utility.readString(6);
        System.out.print("电话： ");
        String tel = Utility.readString(11);
        System.out.print("地址： ");
        String address = Utility.readString(9);
        System.out.print("月租： ");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)： ");
        String state = Utility.readString(3);
        Houses newhouse = new Houses(++id, name, tel, address, rent, state);
        houseService.Creat(newhouse);
        System.out.println("----------添加完成----------");
    }
    public void SeekHouses(){
        System.out.println("----------查找房屋----------");
        System.out.print("请输入你要查找id: ");
        int num = Utility.readInt();

        Houses seek = houseService.Seek(num);
        if (seek != null){
            System.out.println(seek);
        }else {
            System.out.println("--------没有该房屋--------");
        }
    }
    public void DeleteeHouses(){
        System.out.println("----------删除房屋----------");
        System.out.print("请选择待删除房屋编号(-1退出)： ");
        int num = Utility.readInt();
        if(num == -1){
            System.out.println("----退出删除房屋操作----");
            return;
        }
        System.out.println("确认是否删除(Y/N): 请小心选择");
        System.out.println("请输入你的选择(Y/N):");
        char k = Utility.readChar();
        if(k == 'N'){
            System.out.println("----退出删除房屋操作----");
            return;
        }
        if (houseService.Delete(num) && k == 'Y'){
            System.out.println("----------删除成功----------");
        }else {
            System.out.println("------没有对应房屋编号------");
        }
    }
    public void UpdateHouses(){
        System.out.println("----------修改用户----------");
        System.out.print("请选择待修改房屋编号(-1退出):");
        int num = Utility.readInt();
        if (num == -1 ){
            System.out.println("--------退出修改--------");
            return;
        }
        Houses update = houseService.Update(num);
        if(update == null){
            System.out.println("---------没有该用户----------");
        }else {
            System.out.print("姓名("+ update.getName() +"):");
            String name = Utility.readString(10);
            update.setName(name);
            System.out.print("电话("+ update.getTel() +"):");
            String tel = Utility.readString(11);
            update.setTel(tel);
            System.out.print("地址("+ update.getAddress() +"):");
            String address = Utility.readString(10);
            update.setAddress(address);
            System.out.print("租金("+ update.getRent() +"):");
            int rent = Utility.readInt();
            update.setRent(rent);
            System.out.print("状态("+ update.getState() +"):");
            String state = Utility.readString(3);
            update.setState(state);
            System.out.println("----------修改成功----------");
        }
    }
    public void ReadHouses(){
        System.out.println("----------房屋列表----------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        Houses[] read = houseService.Read();
        for (int i = 0;i < read.length;i++){
            if (read[i] == null){
               break;
            }
            System.out.println(read[i]);
        }
    }
    public void ExitAPP(){
        System.out.println("请输入你的选择(Y/N)");
        //这里我们使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
            System.out.println("你退出了程序~");
        } else if (c == 'N') {
            loop = true;
            System.out.println("程序还在继续运行~");
        }

    };
}
