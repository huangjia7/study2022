package com.linkus.chain.chainEnumhandler;

public enum GatewayEnum {
    // handlerId, 拦截者名称，全限定类名，preHandlerId，nextHandlerId
    API_HANDLER(new GatewayEntity(1, "api接口限流", "com.linkus.chain.chainEnumhandler.impl.ApiLimitGatewayHandler", null, 2)),
    SESSION_HANDLER(new GatewayEntity(2, "用户会话拦截", "com.linkus.chain.chainEnumhandler.impl.SessionGatewayHandler", 1, 3)),
    BLACKLIST_HANDLER(new GatewayEntity(3, "黑名单拦截", "com.linkus.chain.chainEnumhandler.impl.BlacklistGatewayHandler", 2, null)),
    ;

    GatewayEntity gatewayEntity;

    public GatewayEntity getGatewayEntity() {
        return gatewayEntity;
    }

    GatewayEnum(GatewayEntity gatewayEntity) {
        this.gatewayEntity = gatewayEntity;
    }
}
