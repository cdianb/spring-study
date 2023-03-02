/**
 * @author mql
 * @date 2023年03月02日 19:22
 */
public abstract class Computer {
    //组合 品牌属性
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        //自带品牌
        brand.info();
    }
}

class deskTop extends Computer{

    public deskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class noteBook extends Computer{

    public noteBook(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
