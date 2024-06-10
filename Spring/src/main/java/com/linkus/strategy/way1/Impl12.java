package com.linkus.strategy.way1;

import org.springframework.stereotype.Service;

@Service
public class Impl12 implements I1{
    @Override
    public boolean condition(String input) {
        return "12".equals(input);
    }

    @Override
    public void exec(String input) {
        System.out.println("---------Impl12执行后："+input);
    }
}
