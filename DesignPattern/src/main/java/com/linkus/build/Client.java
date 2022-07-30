package com.linkus.build;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderOther();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
