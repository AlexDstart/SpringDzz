package Ts;

import Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("car", Car.class));
        System.out.println(context.getBean("bus", Bus.class));
        System.out.println(context.getBean("truck", Truck.class));

        System.out.println(context.getBean("driver1", Driver.class));
        System.out.println(context.getBean("driver2", Driver.class));
        System.out.println(context.getBean("driver3", Driver.class));

    }
}
