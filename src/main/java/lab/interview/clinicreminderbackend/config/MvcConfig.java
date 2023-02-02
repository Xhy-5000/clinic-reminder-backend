package lab.interview.clinicreminderbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //解决跨域问题

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域 使用这种方法就不能在interceptor中再配置header了
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")
                .allowedHeaders("*")
                .maxAge(3600);
    }
}

