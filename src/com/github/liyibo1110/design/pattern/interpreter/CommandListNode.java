package com.github.liyibo1110.design.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * <command list> ::= <command>* end
 */
public class CommandListNode extends Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {

        while(true) {
            if(context.getCurrentToken() == null) {
                throw new ParseException("Missing 'end'");
            }else if(context.getCurrentToken().equals("end")) {
                context.skipToken("end");
                break;
            }else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                // 记录是为了最后打印
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
