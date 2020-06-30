package com.github.liyibo1110.design.pattern.abstractfactory.tablefactory;

import com.github.liyibo1110.design.pattern.abstractfactory.factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
