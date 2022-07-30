package com.linkus.template;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bankTemplate = new DrawMoney();
        //父类方法调用
        bankTemplate.process();

        System.out.println("--------------------------------------------------");

        //匿名内部类方式改写父类方法
        BankTemplateMethod bankTemplateMethod=new BankTemplateMethod() {
            @Override
            void transact() {
                System.out.println("[匿名内部类],我要存钱.");
            }
        };
        bankTemplateMethod.process();
    }
}
