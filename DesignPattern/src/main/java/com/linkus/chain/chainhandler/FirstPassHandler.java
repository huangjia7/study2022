package com.linkus.chain.chainhandler;

public class FirstPassHandler extends AbstractHandler {

    private int play(){
        return 80;
    }

    @Override
    public int handler() {
        System.out.println("第一关 FirstPassHandler");
        int score = play();
        if (score >= 80){
            if(null != this.next){
               return  this.next.handler();
            }
        }
        return score;
    }
}
