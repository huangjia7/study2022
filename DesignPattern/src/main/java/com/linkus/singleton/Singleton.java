package com.linkus.singleton;

/**
 * 懒汉式-线程不安全
 * 延迟初始化实例，线程不安全。
 *
 * 因为没有加锁 synchronized，是非线程安全的。严格意义上来说这种实现方式并不是是单例模式，因为如果程序中刚好有多个线程同时执行 getInstance() 方法，它们获取到的 Singleton 对象可能不是同一个。
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/**
 * 懒汉式-线程安全
 * 延迟初始化实例，线程安全。
 *
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
class Singleton1 {
    private static Singleton1 instance;
    private Singleton1 (){}

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

/**
 * 饿汉式
 * 类装载时初始化实例，线程安全。
 *
 * 优点：没有加锁，执行效率更高。
 * 缺点：类加载时就初始化实例，浪费资源。
 *
 * 该实现方式基于 classloader 机制避免了多线程的同步问题。但是 instance 是在类装载时实例化的，并没有达到延迟加载的效果。
 */
class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2 (){}
    public static Singleton2 getInstance() {
        return instance;
    }
}

/**
 * 双检锁/双重校验锁 (DCL)
 * 延迟初始化实例，线程安全。
 *
 * 这种是实现方式采用了双重校验锁的机制，安全，并在多线程的情况下保持高性能。
 */
class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3 (){}
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}

/**
 * 登记式/静态内部类
 * 延迟初始化实例，线程安全。
 *
 * 与「双重校验锁」实现方式相比：
 *
 * ● 这种通过对静态域使用延迟初始化的实现方式能达到一样的效果，实现也相对简单点。
 * ● 但这种实现方式只适用于 静态域 的情况，而「双重校验锁」方式可在 实例域 需要延迟初始化的情况下使用。
 *
 * 与「饿汉」实现方式相比：
 *
 * ● 这种实现方式在 Singleton 类被装载时，不一定会初始化 instance。因为内部类 SingletonHolder 还没有被主动使用，只有在显式调用 getInstance() 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
 *
 */
class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4 (){}
    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}