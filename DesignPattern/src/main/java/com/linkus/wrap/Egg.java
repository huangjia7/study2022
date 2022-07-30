package com.linkus.wrap;

public class Egg extends Seasoning {
    Egg(Cake cake) {
        super(cake);
    }
    int cost(){
        return super.cost()+2;
    }
}
