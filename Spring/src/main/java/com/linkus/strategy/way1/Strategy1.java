package com.linkus.strategy.way1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class Strategy1 {
    @Autowired
    private List<I1> i1List;
    @Autowired
    private Set<I1> i12List;
    @Autowired
    private Map<String,I1> i13List;

    public void exec(String input){
        for(I1 i1 :i1List){
            if(i1.condition(input)){
                i1.exec(input);
            }
        }
    }
}
