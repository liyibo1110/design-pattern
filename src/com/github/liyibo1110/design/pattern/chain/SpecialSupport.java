package com.github.liyibo1110.design.pattern.chain;

public class SpecialSupport extends Support {

    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    /**
     * 只能解决特定编号的问题
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number) {
            return true;
        }else {
            return false;
        }
    }
}
