package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {

    // =====================================
    // Methods
    // =====================================

    @Override
    public void saludar() {
        System.out.println("¡Hola Mundo!, desde mi componente dos.");
    }
}
