package com.linkus.strategy.way1;

import org.springframework.stereotype.Service;

@Service
public class Impl11 implements I1{
    @Override
    public boolean condition(String input) {
        return "11".equals(input);
    }

    @Override
    public void exec(String input) {
        System.out.println("---------Impl11执行后："+input);
    }
}
