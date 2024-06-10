package com.linkus.command.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：遥控器
 */
public class Control {

    public List<Command> commands = new ArrayList<>();

    public Control(Command command) {
        commands.add(command);
    }

    
    public Control(List<Command> commands) {
        this.commands.addAll(commands);
    }

    public void action() {
        commands.forEach(e -> e.execute());
    }
}
