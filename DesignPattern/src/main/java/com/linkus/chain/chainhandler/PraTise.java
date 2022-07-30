package com.linkus.chain.chainhandler;

public class PraTise {
    public static void main(String[] args) {
        AbstractHandler firstPassHandler = new FirstPassHandler();
        AbstractHandler secondPassHandler = new SecondPassHandler();
        AbstractHandler thirdPassHandler = new ThirdPassHandler();
        firstPassHandler.setNext(secondPassHandler);
        secondPassHandler.setNext(thirdPassHandler);

        System.out.println(firstPassHandler.handler());
    }
}
