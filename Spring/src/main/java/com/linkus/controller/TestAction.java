package com.linkus.controller;

import com.linkus.strategy.way1.Strategy1;
import com.linkus.strategy.way2.Strategy2;
import com.linkus.strategy.way2.StrategyEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAction {
    @Autowired
    private Strategy1 strategy1;
    @Autowired
    private Strategy2 strategy2;

    @GetMapping("/test1/{input}")
    public String exec1(@PathVariable("input") String input){
        strategy1.exec(input);
        return "success";
    }

    @GetMapping("/test2")
    public String exec2(){
        strategy2.exec(StrategyEnum.ENTRY1,"hello ");
        strategy2.exec(StrategyEnum.ENTRY2,"world");
        return "success";
    }
}
