package com.linkus.bridge.type;

import com.linkus.bridge.brand.Brand;

public class SportsCar extends Car {
    public SportsCar(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("跑车");
    }

    public void convertiable(){
        System.out.println("打开敞篷");
    }
}
