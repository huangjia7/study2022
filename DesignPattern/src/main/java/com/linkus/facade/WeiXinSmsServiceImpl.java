package com.linkus.facade;

public class WeiXinSmsServiceImpl   implements WeiXinSmsService{
    @Override
    public void sendSms() {
        System.out.println("调用微信接口发送消息..");
    }

}
