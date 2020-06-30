package com.github.liyibo1110.design.pattern.abstractfactory.listfactory;

import com.github.liyibo1110.design.pattern.abstractfactory.factory.Item;
import com.github.liyibo1110.design.pattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption + "\n");
        sb.append("<ul>\n");
        for(Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
