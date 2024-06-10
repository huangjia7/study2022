package com.linkus.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Slf4j
public class Push extends AbstractHandler{
    @Override
    public void doFilter(String input) {
        log.info("{},放入冰箱",input);
    }
}
