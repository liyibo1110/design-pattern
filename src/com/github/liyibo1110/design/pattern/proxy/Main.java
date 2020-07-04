package com.github.liyibo1110.design.pattern.proxy;

public class Main {

    public static void main(String[] args) {
        Printable p = new PrinterProxy("alice");
        System.out.println("现在名字是：" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在名字是：" + p.getPrinterName());
        p.print("Hello, world.");
    }
}
