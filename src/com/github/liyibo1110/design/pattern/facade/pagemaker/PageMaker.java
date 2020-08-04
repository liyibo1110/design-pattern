package com.github.liyibo1110.design.pattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {

    }

    public static void makeWelcomePage(String email, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(email);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + " 欢迎来到 " + username + " 的主页。");
            writer.paragraph(" 等着你的邮件哦！");
            writer.mailto(email, username);
            writer.close();
            System.out.println(filename + " is created for " + email + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
