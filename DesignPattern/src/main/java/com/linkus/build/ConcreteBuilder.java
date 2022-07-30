package com.linkus.build;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("ConcreteBuilder 建造 PartA");
    }
    public void buildPartB() {
        product.setPartB("ConcreteBuilder 建造 PartB");
    }
    public void buildPartC() {
        product.setPartC("ConcreteBuilder 建造 PartC");
    }
}
