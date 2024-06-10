package com.linkus.rjsjs;

public class AbstraFactory {
    public static void main(String[] args) {
        Ifactory factory1 = new Product1Factory();
        ProductA productA = factory1.createProductA();
        productA.info();
        ProductB productB1 = factory1.createProductB();
        productB1.info();


        Ifactory factory2 = new Product2Factory();
        ProductB productB = factory2.createProductB();
        productB.info();
        ProductB productB2 = factory2.createProductB();
        productB2.info();
    }
}

interface Ifactory{
    public ProductA createProductA();
    public ProductB createProductB();
}

class Product1Factory implements Ifactory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
class Product2Factory implements Ifactory{
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}

abstract class ProductA{
    public abstract void info();
}
class ProductA1 extends ProductA{
    @Override
    public void info() {
        System.out.println("产品A1");
    }
}
class ProductA2 extends ProductA{
    @Override
    public void info() {
        System.out.println("产品A2");
    }
}

abstract class ProductB{
    public abstract void info();
}
class ProductB1 extends ProductB{
    @Override
    public void info() {
        System.out.println("产品B1");
    }
}
class ProductB2 extends ProductB{
    @Override
    public void info() {
        System.out.println("产品B2");
    }
}