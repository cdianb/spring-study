package com.mei.hungry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author mql
 * @date 2023年02月26日 15:06
 * 懒汉式单例模式
 */
public class LazyMan {
    private static boolean liang = false;

    private LazyMan(){
        synchronized (LazyMan.class){
            if(!liang){
                liang = true;
            }else{
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
            if(LAZYMAN != null){
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
        System.out.println(Thread.currentThread().getName() + "ok");
    }
    private volatile static LazyMan LAZYMAN;
    public static LazyMan getInstance(){
//        双重检测锁模式的 懒汉式单例 DCL懒汉式
        if(LAZYMAN == null){
            synchronized (LazyMan.class){
                if(LAZYMAN == null){
                    LAZYMAN = new LazyMan();  //不是一个原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把对象指向这个空间
                     *
                     * 123
                     * 132 A
                     *     B 此时lazyMan还没有完成构造
                     */
                }
            }
        }

        return LAZYMAN;
    }
    //单线程下正常
    //多线程并发会有问题 ------>所以需要有双层检测
    public static void main(String[] args) throws Exception {
//        for(int i = 0; i < 10; i++){
//            new Thread(new Runnable() {
//                public void run(){
//                     LazyMan.getInstance();
//                }
//
//            }).start();
//        }
        //反射会破坏单例
//        LazyMan instance = LazyMan.getInstance();
        Field liang = LazyMan.class.getDeclaredField("liang");     //可以通过反射拿到属性，并修改值，此时还是不安全的
        liang.setAccessible(true);
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);//无视私有构造器
        LazyMan instance = declaredConstructor.newInstance();
        
        liang.set(instance, false);

        LazyMan instance2 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
