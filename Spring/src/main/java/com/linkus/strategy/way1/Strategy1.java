package com.linkus.strategy.way1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Strategy1 {
    @Autowired
    private List<I1> i1List;

    public void exec(String input){
        for(I1 i1 :i1List){
            if(i1.condition(input)){
                i1.exec(input);
            }
        }
    }
}
