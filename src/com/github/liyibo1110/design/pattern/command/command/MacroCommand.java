package com.github.liyibo1110.design.pattern.command.command;

import java.util.Stack;

public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for(Command c : commands) {
            c.execute();
        }
    }

    public void append(Command command) {
        if(command != this) {
            commands.push(command);
        }
    }

    /**
     * 删除最后一条Command
     */
    public void undo() {
        if(!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
