import Controller.HomePageController;
import Controller.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackageClasses = LoginController.class)
public class mvcConfig extends WebApplicationObjectSupport {

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("WEB-INF/view/",".jsp");
    }
    
}
