package com.github.liyibo1110.design.pattern.chain;

public class Main {

    public static void main(String[] args) {

        Support alice = new NoSupport("alice");
        Support bob = new LimitSupport("bob", 100);
        Support charlie = new SpecialSupport("charlie", 429);
        Support diana = new LimitSupport("diana", 200);
        Support elmo = new OddSupport("elmo");
        Support fred = new LimitSupport("fred", 300);

        // 构建职责链
        alice.setNext(bob)
             .setNext(charlie)
             .setNext(diana)
             .setNext(elmo)
             .setNext(fred);

        // 模拟生成问题
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
