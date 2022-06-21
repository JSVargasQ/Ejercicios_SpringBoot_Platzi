package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    // =====================================
    // Attributes
    // =====================================

    private ComponentDependency componentDependency;

    private MyBean myBean;

    private MyBeanWithDependency myBeanWithDependency;

    // =====================================
    // Constructor
    // =====================================

    /*
     * ComponentDependency - Parametro para la inyeccion de componentes
     * Qualifer - Nombre del componente a utilizar
     */
    public FundamentosApplication(
            @Qualifier("componentTwoImplement") ComponentDependency componentDependency,
            MyBean myBean,
            MyBeanWithDependency myBeanWithDependency
    ) {

        // Inyeccion de componentes
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
    }

    // =====================================
    // Flujo de procesos
    // =====================================

    @Override
    public void run(String... args) {
        // Call of the 'saludar' method
        componentDependency.saludar();

        // Call 'print' of Bean
        myBean.print();

        // Call 'print with dependency' on bean with dependency
        myBeanWithDependency.printWithDependency();
    }

    // =====================================
    // Main
    // =====================================

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }
}
