package com.linkus.chain.chainEnumhandler;

public class GetewayClient {
    public static void main(String[] args) {
        GatewayHandler firstGetewayHandler = GatewayHandlerEnumFactory.getFirstGatewayHandler();
        firstGetewayHandler.service();
    }
}
