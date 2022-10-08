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
    protected Class<?>[] getRootConfigClasses() {   //指定spring配置类
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {    //指定springMVC配置类
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {   //指定DispatchServlet映射规则,即url-pattern
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {    //注册过滤器
       CharacterEncodingFilter codeFilter = new CharacterEncodingFilter();
       codeFilter.setEncoding("UTF-8");
       codeFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{codeFilter,methodFilter};
    }
}
