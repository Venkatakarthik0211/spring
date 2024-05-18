package testfire.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// Indicates that this is a Spring Boot application and triggers auto-configuration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args) initializes the Spring application context
        // ConfigurableApplicationContext is used to obtain the application context to get beans later
        ConfigurableApplicationContext c = SpringApplication.run(Application.class, args);

        // a bean is an object that is instantiated, assembled, and managed by a Spring IoC (Inversion of Control) container. Beans are the fundamental building blocks of a Spring application. 
        // They are used to represent various components of the application such as services, repositories, controllers, and configurations.
        // If your beans are placed in a package that is not a sub-package of the package where the @SpringBootApplication annotated class resides, they won't be scanned automatically.

        // Retrieve the bean named "defaulter" from the application context
        // Spring automatically creates a bean for Defaulter with the name "defaulter" (class name +with the first letter in lowercase)
        Defaulter d = (Defaulter) c.getBean("defaulter");

        // Call the printDefault method of the Defaulter bean and print its return value
        System.out.println(d.printDefault());
    }

}
