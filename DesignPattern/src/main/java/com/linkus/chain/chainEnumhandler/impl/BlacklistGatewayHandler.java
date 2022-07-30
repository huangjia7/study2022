package com.linkus.chain.chainEnumhandler.impl;

import com.linkus.chain.chainEnumhandler.GatewayHandler;

public class BlacklistGatewayHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println(".........BlacklistGatewayHandler");
        // 实现具体的限流服务流程
        if (this.next != null) {
            this.next.service();
        }
    }
}
