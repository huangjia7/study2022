package com.linkus.chain.chainhandler;

public class SecondPassHandler extends AbstractHandler {

    private int play(){
        return 90;
    }

    @Override
    public int handler() {
        System.out.println("第二关 SecondPassHandler");
        int score = play();
        if (score >= 90){
            if(null != this.next){
                return  this.next.handler();
            }
        }
        return score;
    }
}
