//package com.kevin.configs;
//
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.boot.web.servlet.ErrorPage;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * Created by kevin on 2017/6/1.
// */
//@Configuration
//@EnableWebMvc
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/signin").setViewName("signin");
//        registry.addViewController("/error/404.html").setViewName("404");
//        registry.addViewController("/error/500.html").setViewName("505");
//    }
//
//    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html");
//                ErrorPage error505Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html");
//
//                container.addErrorPages(error404Page, error505Page);
//            }
//        };
//    }
//}
