package com.github.liyibo1110.design.pattern.chain;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    /**
     * 从不解决问题
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
