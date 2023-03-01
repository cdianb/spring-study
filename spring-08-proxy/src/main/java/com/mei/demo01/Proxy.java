package com.mei.demo01;

/**
 * @author mql
 * @date 2023年02月27日 21:42
 */
public class Proxy implements Rent{
    private Holder holder;

    public Proxy() {
    }

    public Proxy(Holder holder) {
        this.holder = holder;
    }

    //租房
    public void rent() {
        holder.rent();
        seeHouse();
        fee();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    //收中介费
    public void fee(){
        System.out.println("中介收中介费！");
    }
}
