package com.pet.project.scopes.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class URLFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(URLFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        LOGGER.info("Logging inside URLFilter - method: {}, path: {}", httpServletRequest.getMethod(), httpServletRequest.getRequestURI());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
