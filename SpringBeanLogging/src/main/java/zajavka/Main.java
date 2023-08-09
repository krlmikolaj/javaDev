package zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zajavka.configuration.ApplicationConfiguration;
import zajavka.service.MainProcessor;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);
        mainProcessor.process();
    }
}
