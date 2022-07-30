package com.linkus.prototype;

import lombok.Data;

@Data
public class Book implements Cloneable{
    private String title;
    private String img;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showBook(){
        System.out.println("---:"+title);
    }
}
