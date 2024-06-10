package com.linkus.observer;

public class Client {
    public static void main(String[] args) {
        WeXinServer server = new WeXinServer();

        Observer userSan = new User("San");
        Observer userLi = new User("Si");
        Observer userWang = new User("Wu");

        server.registerObserver(userSan);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userSan);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
