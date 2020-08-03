package com.github.liyibo1110.design.pattern.chain;

public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    /**
     * 只能解决编号小于limit的问题
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit) {
            return true;
        }else {
            return false;
        }
    }
}
