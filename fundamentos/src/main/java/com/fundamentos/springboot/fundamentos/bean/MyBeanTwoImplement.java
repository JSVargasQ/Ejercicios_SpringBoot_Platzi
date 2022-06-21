package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean {

    // =====================================
    // Methods
    // =====================================

    @Override
    public void print() {
        System.out.println("Hola desde mi implementación 2 propia del bean 2");
    }
}
