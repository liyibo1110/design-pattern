package com.github.liyibo1110.design.pattern.chain;

public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    /**
     * 只能解决奇数编号的问题
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 1) {
            return true;
        }else {
            return false;
        }
    }
}
