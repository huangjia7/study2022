package com.linkus.command.simple;

/**
 * 功能：关闭电视机
 */
public class CloseCommand implements Command{
    private TV tv = new TV();
    @Override
    public void execute() {
        tv.close();
    }
}
