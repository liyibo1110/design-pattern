package com.github.liyibo1110.design.pattern.state;

public interface State {

    /**
     * 设定时间
     * @param context
     * @param hour
     */
    public void doClock(Context context, int hour);

    /**
     * 使用金库
     * @param context
     */
    public void doUse(Context context);

    /**
     * 按警铃
     * @param context
     */
    public void doAlarm(Context context);

    /**
     * 打电话
     * @param context
     */
    public void doPhone(Context context);
}
