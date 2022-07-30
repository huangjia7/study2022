package com.linkus.factory.abstractfactory;

//华为工厂实现类
public class HuaweiFactory implements IProductFactory {

    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}

//小米工厂实现类
class XiaomiFactory implements IProductFactory {

    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
