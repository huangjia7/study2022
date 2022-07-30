package com.linkus.facade;

public class Computer {
    AliSmsService aliSmsService;
    EmailSmsService eamilSmsService;
    WeiXinSmsService weiXinSmsService;

    public Computer() {
        aliSmsService = new AliSmsServiceImpl();
        eamilSmsService = new EmailSmsServiceImpl();
        weiXinSmsService = new WeiXinSmsServiceImpl();
    }

    public void sendMsg() {
        aliSmsService.sendSms();
        eamilSmsService.sendSms();
        weiXinSmsService.sendSms();
    }
}
