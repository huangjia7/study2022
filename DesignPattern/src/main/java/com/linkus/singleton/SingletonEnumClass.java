package com.linkus.singleton;

/**
 *  由于单例模式的枚举实现代码比较简单，而且又可以利用枚举的特性来解决线程安全和单一实例的问题，还可以防止反射和反序列化对单例的破坏，因此在很多书和文章中都强烈推荐将该方法作为单例模式的最佳实现方法。
 */
public class SingletonEnumClass {
    private SingletonEnumClass(){}

    public void businessMethod() {
        System.out.println("我是一个单例！");
    }

    public static enum SingletonEnum {
        SINGLETON;
        private SingletonEnumClass instance = null;
        private SingletonEnum(){
            instance = new SingletonEnumClass();
        }
        public SingletonEnumClass getInstance(){
            return instance;
        }
    }
}
