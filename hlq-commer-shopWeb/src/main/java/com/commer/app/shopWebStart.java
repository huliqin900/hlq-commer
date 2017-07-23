package com.commer.app;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;

/**
 * 博客內容展示站點
 */
@SpringBootApplication
@ImportResource(locations={"classpath:dubbo-shopConsumer.xml"})
public class shopWebStart 
{	
	
    public static void main( String[] args )
    {
        ApplicationContext tc = SpringApplication.run(shopWebStart.class, args);
        UserService userService = tc.getBean(UserService.class);
        System.out.println(userService.selectByPrimaryKey(1).getUsername());
    }
    
    /*@Configuration
    static class WebMvcConfigurer extends WebMvcConfigurerAdapter {

        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new HandlerInterceptorAdapter() {

                @Override
                public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                         Object handler) throws Exception {
                	User userVo = (User) new HttpSession().getAttribute("user");
                	String uVo = request.getSession().getId();
                    request.getContextPath();
                    System.out.println("interceptor====");
                    return true;
                }
            }).addPathPatterns("/*");
        }
    }*/
    
    /*@Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

       return (container -> {
            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

            container.addErrorPages(error401Page, error404Page, error500Page);
       });
    }*/
}
