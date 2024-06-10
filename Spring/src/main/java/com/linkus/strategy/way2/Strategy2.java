package com.linkus.strategy.way2;

import com.linkus.strategy.way1.I1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
@Slf4j
public class Strategy2 implements ApplicationContextAware {
    private Map<StrategyEnum,I2> map = new ConcurrentHashMap();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, I2> tempMap = applicationContext.getBeansOfType(I2.class);
        tempMap.values().forEach(I2Service -> map.put(I2Service.strategy(),I2Service));
    }

    public void exec(StrategyEnum strategyEnum,String input){
        I2 i2 = map.get(strategyEnum);
        if(null != i2){
            i2.exec(input);
        }else{
            log.info("抛错,未找到处理类");
        }

    }
}
