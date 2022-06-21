package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    // =====================================
    // Attributes
    // =====================================

    private MyOperation myOperation;

    // =====================================
    // Constructor
    // =====================================

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    // =====================================
    // Methods
    // =====================================

    @Override
    public void printWithDependency() {
        // Do a operation and print
        int numero = 1;
        int response = myOperation.sum(numero);
        System.out.println(response);

        // Print message
        System.out.println("Hola desde la implementación de un bean con dependencia"
        );
    }
}
