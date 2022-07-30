package com.linkus.observer;

/**
 * 观察者接口类
 */
public interface Observer {
    /**
     * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
     */
    public void update(String message);
}
