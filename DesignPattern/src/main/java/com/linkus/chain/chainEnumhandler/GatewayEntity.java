package com.linkus.chain.chainEnumhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GatewayEntity {
    private Integer handlerId;
    private String name;
    private String conference;
    private Integer preHandlerId;
    private Integer nextHandlerId;
}
