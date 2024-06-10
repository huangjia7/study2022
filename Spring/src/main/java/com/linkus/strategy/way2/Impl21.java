package com.linkus.strategy.way2;

import org.springframework.stereotype.Service;

@Service
public class Impl21 implements  I2{
    @Override
    public StrategyEnum strategy() {
        return StrategyEnum.ENTRY1;
    }

    @Override
    public void exec(String input) {
        System.out.println("---------Impl21执行后："+input);
    }
}
