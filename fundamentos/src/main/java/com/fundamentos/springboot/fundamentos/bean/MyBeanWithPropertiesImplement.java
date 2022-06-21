package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties {

    // =====================================
    // Atributes
    // =====================================

    private String name;
    private String lastname;

    // =====================================
    // Constructor
    // =====================================

    public MyBeanWithPropertiesImplement(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    // =====================================
    // Methods
    // =====================================

    @Override
    public String fuction() {
        return this.name + " - " + this.lastname;
    }

}
