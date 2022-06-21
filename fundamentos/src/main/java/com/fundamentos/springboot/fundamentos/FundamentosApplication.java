package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.pojo.UserPojo;
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

    private MyBeanWithProperties myBeanWithProperties;

    private UserPojo userPojo;

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
            MyBeanWithDependency myBeanWithDependency,
            MyBeanWithProperties myBeanWithProperties,
            UserPojo userPojo
    ) {

        // Inyeccion de componentes
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
        this.myBeanWithProperties = myBeanWithProperties;
        this.userPojo = userPojo;
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

        // Call my bean with properties
        System.out.println(myBeanWithProperties.fuction());

        System.out.println(userPojo.getEmail() + " - " + userPojo.getPassword());
    }

    // =====================================
    // Main
    // =====================================

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }
}
