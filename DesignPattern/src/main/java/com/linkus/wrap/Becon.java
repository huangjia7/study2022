package com.linkus.wrap;

public class Becon extends Seasoning {
    Becon(Cake cake) {
        super(cake);
    }
    int cost(){
        return super.cost()+2;
    }
}
