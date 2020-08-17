package com.github.liyibo1110.design.pattern.interpreter;

/**
 * <program> ::= program <command list>
 */
public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        // 直接跳过（内含验证）
        context.skipToken("program");
        commandListNode = new CommandListNode();
        // 继续解析下一段
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
