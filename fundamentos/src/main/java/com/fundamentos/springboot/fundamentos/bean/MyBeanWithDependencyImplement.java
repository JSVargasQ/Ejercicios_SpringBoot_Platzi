package com.fundamentos.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    // =====================================
    // Attributes
    // =====================================

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

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
        LOGGER.info("Start function ::printWithDependency::");

        // Do a operation and print
        int numero = 1;
        LOGGER.debug("The number is " + numero);
        int response = myOperation.sum(numero);
        LOGGER.debug("The response about operation with number is " + response);
        System.out.println(response);

        // Print message
        System.out.println("Hola desde la implementación de un bean con dependencia"
        );

        LOGGER.info("End function ::printWithDependency::");
    }
}
