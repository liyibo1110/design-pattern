package com.github.liyibo1110.design.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * <command> ::= <repeat command> | <primitive command>
 */
public class CommandNode extends Node {

    private Node node;

    @Override
    public void parse(Context context) throws ParseException {

        if(context.getCurrentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        }else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
