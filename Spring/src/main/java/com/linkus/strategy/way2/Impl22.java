package com.linkus.strategy.way2;

import org.springframework.stereotype.Service;

@Service
public class Impl22 implements  I2{
    @Override
    public StrategyEnum strategy() {
        return StrategyEnum.ENTRY2;
    }

    @Override
    public void exec(String input) {
        System.out.println("---------Impl22执行后："+input);
    }
}
