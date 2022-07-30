package com.linkus.chain.chainhandler;

public class ThirdPassHandler extends AbstractHandler {

    private int play(){
        return 95;
    }

    @Override
    public int handler() {
        System.out.println("第三关 ThirdPassHandler");
        int score = play();
        if (score >= 95){
            if(null != this.next){
                return  this.next.handler();
            }
        }
        return score;
    }
}
