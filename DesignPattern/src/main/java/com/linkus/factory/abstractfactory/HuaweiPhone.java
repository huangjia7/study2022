package com.linkus.factory.abstractfactory;

public class HuaweiPhone implements IPhoneProduct {

    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发邮件");
    }
}

class HuaweiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("打开华为wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置华为路由器");
    }
}

class XiaomiPhone implements IPhoneProduct {

    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发邮件");
    }
}

//小米路由器实现类
class XiaomiRouter implements IRouterProduct {

    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("打开小米wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器");
    }
}