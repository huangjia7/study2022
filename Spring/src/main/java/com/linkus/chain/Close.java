package com.linkus.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
@Slf4j
public class Close extends AbstractHandler{
    @Override
    public void doFilter(String input) {
        log.info("{},关闭冰箱",input);
    }


}
