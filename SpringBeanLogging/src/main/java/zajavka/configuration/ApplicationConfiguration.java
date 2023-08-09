package zajavka.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zajavka.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ApplicationConfiguration {
}
