package com.linkus.factory.abstractfactory;

public interface IRouterProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //打开wifi
    void openwifi();
    //设置
    void setting();
}
interface IPhoneProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //打电话
    void callup();
    //发邮件
    void sendSMS();
}