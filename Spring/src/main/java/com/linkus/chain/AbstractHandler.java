package com.linkus.chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler abstractHandler){
        this.nextHandler = abstractHandler;
    }

    protected void filter(String input){
        doFilter(input);
        if (null != nextHandler) {
            nextHandler.filter(input);
        }
    }

    public abstract  void doFilter(String input);
}
