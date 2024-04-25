package org.babel;

import org.babel.acomodadorApp.PuenteApp;
import org.babel.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PuenteApp application = context.getBean(PuenteApp.class);
        application.run();
    }
}