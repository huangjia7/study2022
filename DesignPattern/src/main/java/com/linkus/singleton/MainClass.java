package com.linkus.singleton;

public class MainClass {
    public static void main(String[] args) {
        SingletonEnumClass s1 = SingletonEnumClass.SingletonEnum.SINGLETON.getInstance();
        SingletonEnumClass s2 = SingletonEnumClass.SingletonEnum.SINGLETON.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
        s1.businessMethod();
        s2.businessMethod();
    }
}
