package com.linkus.observer;

/**
 * 被观察者抽象类
 */
public interface ObserverAble {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
