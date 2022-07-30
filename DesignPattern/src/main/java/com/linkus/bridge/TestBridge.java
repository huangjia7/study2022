package com.linkus.bridge;

import com.linkus.bridge.brand.Audi;
import com.linkus.bridge.brand.BMW;
import com.linkus.bridge.type.Car;
import com.linkus.bridge.type.SportsCar;

public class TestBridge {
    public static void main(String[] args) {
        Car car = new SportsCar(new Audi());
        car.info();

        Car car2 = new SportsCar(new BMW());
        car2.info();
    }
}
