package com.github.liyibo1110.design.pattern.abstractfactory.tablefactory;

import com.github.liyibo1110.design.pattern.abstractfactory.factory.Factory;
import com.github.liyibo1110.design.pattern.abstractfactory.factory.Link;
import com.github.liyibo1110.design.pattern.abstractfactory.factory.Page;
import com.github.liyibo1110.design.pattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
