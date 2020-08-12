package com.github.liyibo1110.design.pattern.memento.game;

import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits;
    private Random random = new Random();
    private static String[] fruitNames = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if(dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了。");
        }else if(dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了。");
        }else if(dice == 6) {
            String fruit = getFruit();
            System.out.println("获得了水果（" + fruit + "）。");
            fruits.add(fruit);
        }else {
            System.out.println("什么也没有发生。");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for(String fruit : fruits) {
            if(fruit.startsWith("好吃的")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if(random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }
}
