package com.miko.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

//@EnableWebMvc//会禁用自己的配置
@Configuration//配置类，放一个webmvcconfigurer就可以手动自动双配置
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //保留以前不要改
        WebMvcConfigurer.super.addResourceHandlers(registry);

        //自己写的配置
        registry.addResourceHandler("/static/**")
                .addResourceLocations("Classpath:/a/a", "Classpath:/b/b")
                .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
    }
}

//配置拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        WebMvcConfigurer.super.addInterceptors(registry);
//        registry.addInterceptor(new ).addPathPatterns("//").excludePathPatterns("//")
//    }
//}
//也可以直接new一个webmvcconfigurer类
//public class Myconfig {
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer(){
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            //保留以前不要改
//            WebMvcConfigurer.super.addResourceHandlers(registry);
//
//            //自己写的配置
//            registry.addResourceHandler("/static/**")
//                    .addResourceLocations("Classpath:/a/a","Classpath:/b/b")
//                    .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
//        }
//    }
//}