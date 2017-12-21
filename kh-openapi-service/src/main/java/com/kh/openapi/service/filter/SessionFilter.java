package com.kh.openapi.service.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 所在的包名: com.kh.openapi.service.filter
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 15:30 2017/12/10
 */
public class SessionFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
        System.out.println("111111111111111111111111");
    }

    @Override
    public void destroy() {

    }
}
