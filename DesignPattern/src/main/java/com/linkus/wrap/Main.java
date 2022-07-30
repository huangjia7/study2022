package com.linkus.wrap;

public class Main {
    public static void main(String[] args) {
        Cake cake = new HandCake();
        System.out.println("手抓饼："+cake.cost());
        Egg egg = new Egg(cake);
        System.out.println("+1个鸡蛋："+egg.cost());
        Ham ham = new Ham(egg);
        System.out.println("+1片火腿："+ham.cost());
        Becon becon = new Becon(ham);
        System.out.println("+1份培根："+becon.cost());
        Egg egg2 = new Egg(becon);
        System.out.println("再+一个鸡蛋："+egg2.cost());
    }
}
