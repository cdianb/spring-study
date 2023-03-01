package com.mei.hungry;

/**
 * @author mql
 * @date 2023年02月26日 15:35
 * 静态内部类
 */
public class Holder {
    /**只要是单例模式，首先第一步：构造器私有
     *
     * 使用静态内部类获取单例
     */
    private Holder(){
        
    }

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }
    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
