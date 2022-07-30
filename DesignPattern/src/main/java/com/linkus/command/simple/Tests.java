package com.linkus.command.simple;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        Command command = new OpenCommand();
        Command changeCommand = new ChangeCommand();
        Command closeCommand = new CloseCommand();
        List list = new ArrayList<>();
        list.add(command);
        list.add(changeCommand);
        list.add(closeCommand);
        Control control = new Control(list);
        control.action();
    }
}
