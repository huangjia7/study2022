package com.linkus.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 被调用
 */
@Component
public class ChainService {
    @Autowired
    private List<AbstractHandler> abstractHandlerList;

    @PostConstruct
    public void initHandler(){
        for (int i =1 ;i< abstractHandlerList.size();++i){
            AbstractHandler currentAbstractHandler = abstractHandlerList.get(i-1);
            AbstractHandler nextAbstractHandler = abstractHandlerList.get(i);
            currentAbstractHandler.setNextHandler(nextAbstractHandler);
        }
    }

    public void exec(String input){
        getFirstAbstractHandler().filter(input);
    }

    public AbstractHandler getFirstAbstractHandler(){
        return abstractHandlerList.get(0);
    }
}
