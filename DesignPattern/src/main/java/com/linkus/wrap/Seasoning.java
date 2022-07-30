package com.linkus.wrap;

public class Seasoning extends  Cake {
    private Cake cake;
    Seasoning(Cake cake){
        this.cake=cake;
    }

    @Override
    int cost() {
        return cake.cost();
    }
}
