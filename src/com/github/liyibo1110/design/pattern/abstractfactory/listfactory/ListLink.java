package com.github.liyibo1110.design.pattern.abstractfactory.listfactory;

import com.github.liyibo1110.design.pattern.abstractfactory.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
