package com.linkus.wrap;

public class Ham extends Seasoning{
    Ham(Cake cake) {
        super(cake);
    }
    int cost(){
        return super.cost()+2;
    }
}
