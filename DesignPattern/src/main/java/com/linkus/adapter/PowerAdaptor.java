package com.linkus.adapter;

//实现的是110V的电压,但是生效的是220V的电压,也就是说用110V的电压适配器去用220V的电压
public class PowerAdaptor implements JP110VInterface {
    private CN220VInterface cn220VInterface;

    public PowerAdaptor(CN220VInterface cn220VInterface) {
        this.cn220VInterface = cn220VInterface;
    }

    @Override
    public void connect() {
        cn220VInterface.connect();
    }
}
