package com.github.liyibo1110.design.pattern.chain;

public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    /**
     * 推卸给下一个对象，由子类调用
     * @param next
     * @return
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 解决步骤
     * @param trouble
     */
    public final void support(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        }else if(next != null) {
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
