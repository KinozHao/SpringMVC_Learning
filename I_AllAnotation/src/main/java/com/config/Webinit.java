package com.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author kinoz
 * @Date 2022/10/8 20:23
 * @apiNote 此类用于代替web.xml
 */
public class Webinit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //指定spring配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    //指定springMVC配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    //指定DispatchServlet映射规则,即url-pattern
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    //注册过滤器
    protected Filter[] getServletFilters() {
       CharacterEncodingFilter codeFilter = new CharacterEncodingFilter();
       codeFilter.setEncoding("UTF-8");
       codeFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{codeFilter,methodFilter};
    }
}
