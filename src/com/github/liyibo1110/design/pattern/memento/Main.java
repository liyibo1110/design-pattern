package com.github.liyibo1110.design.pattern.memento;

import com.github.liyibo1110.design.pattern.memento.game.Gamer;
import com.github.liyibo1110.design.pattern.memento.game.Memento;

public class Main {

    public static void main(String[] args) {

        Gamer gamer = new Gamer(100);
        Memento m = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);

            // 投色子
            gamer.bet();
            System.out.println("所持金钱为 " + gamer.getMoney() + "元。");
            // 处理Memento
            if(gamer.getMoney() > m.getMoney()) {
                System.out.println("    （所持金钱增加，保存游戏当前状态）");
                m = gamer.createMemento();
            }else if(gamer.getMoney() < m.getMoney() / 2) {
                System.out.println("    （所持金钱减少，恢复上一个状态）");
                gamer.restoreMemento(m);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
