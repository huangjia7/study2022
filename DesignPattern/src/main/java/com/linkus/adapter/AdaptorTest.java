package com.linkus.adapter;

/**
 * 适配器应用场景:
 *   我们根据上面的适配器的特点的介绍中，我们来分析下适配器模式的几类比较适用的使用场景：
 *   1、我们在使用第三方的类库，或者说第三方的API的时候，我们通过适配器转换来满足现有系统的使用需求。
 *   2、我们的旧系统与新系统进行集成的时候，我们发现旧系统的数据无法满足新系统的需求，那么这个时候，我们可能需要适配器，完成调用需求。
 *   3、我们在使用不同数据库之间进行数据同步。(我这里只是分析的是通过程序来说实现的时候的情况。还有其他的很多种方式[数据库同步])。
 * @description TODO
 */
public class AdaptorTest {
    public static void main(String[] args) {
        CN220VInterface cn220VInterface = new CN220VInterfaceImpl();
        PowerAdaptor powerAdaptor = new PowerAdaptor(cn220VInterface);
        // 电饭煲
        ElectricCooker cooker = new ElectricCooker(powerAdaptor);
        cooker.cook();//使用了适配器,在220V的环境可以工作了。
    }
}
