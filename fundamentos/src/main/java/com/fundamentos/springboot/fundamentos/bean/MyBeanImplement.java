package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {

    // =====================================
    // Methods
    // =====================================

    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean");
    }
}
