package com.linkus.command.simple;

/**
 * 功能：打开电视机
 */
public class OpenCommand implements Command{
    private TV tv = new TV();

    @Override
    public void execute() {
        tv.open();
    }
}
