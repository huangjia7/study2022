package com.linkus.bridge.type;

import com.linkus.bridge.brand.Brand;

public abstract class Car {
    protected Brand brand;

    public Car(Brand brand){
        this.brand = brand;
    }

    public  void  info(){
        brand.info();
    }
}
