package com.linkus.command.simple;

/**
 * 功能：换台
 */
public class ChangeCommand implements Command{
    private TV tv = new TV();

    @Override
    public void execute() {
        tv.change();
    }
}
