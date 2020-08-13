package com.github.liyibo1110.design.pattern.state;

public interface Context {

    /**
     * 设定时间
     * @param hour
     */
    public void setClock(int hour);

    /**
     * 改变状态
     * @param state
     */
    public void changeState(State state);

    /**
     * 联系警报中心
     * @param msg
     */
    public void callSecurityCenter(String msg);

    /**
     * 在警报中心增加记录
     * @param msg
     */
    public void recordLog(String msg);
}
