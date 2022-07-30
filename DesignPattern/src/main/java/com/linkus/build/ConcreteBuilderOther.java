package com.linkus.build;

public class ConcreteBuilderOther extends Builder {
    public void buildPartA() {
        product.setPartA("ConcreteBuilderOther 建造 PartA");
    }
    public void buildPartB() {
        product.setPartB("ConcreteBuilderOther 建造 PartB");
    }
    public void buildPartC() {
        product.setPartC("ConcreteBuilderOther 建造 PartC");
    }
}
