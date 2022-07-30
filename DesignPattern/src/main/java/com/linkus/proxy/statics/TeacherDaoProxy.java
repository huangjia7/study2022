package com.linkus.proxy.statics;

public class TeacherDaoProxy {
    private ITeacherDao target; // 目标对象，通过接口来聚合
    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        target.teach();
        System.out.println("提交。。。。。");//方法
    }
}
