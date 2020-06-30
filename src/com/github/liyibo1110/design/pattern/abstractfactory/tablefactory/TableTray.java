package com.github.liyibo1110.design.pattern.abstractfactory.tablefactory;

import com.github.liyibo1110.design.pattern.abstractfactory.factory.Item;
import com.github.liyibo1110.design.pattern.abstractfactory.factory.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<td>");
        sb.append("<table width=\"100%\" border=\"1\"><tr>");
        sb.append("<td bgcolor=\"#CCCCCC\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" +caption + "</b></td>");
        sb.append("</tr>\n");
        sb.append("<tr>\n");
        for(Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</tr></table>");
        sb.append("</td>");
        return sb.toString();
    }
}
