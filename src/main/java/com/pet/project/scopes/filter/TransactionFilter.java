package com.pet.project.scopes.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
public class TransactionFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        LOGGER.info("Starting a transaction for request: {}", httpServletRequest.getRequestURI());

        filterChain.doFilter(servletRequest, servletResponse);

        LOGGER.info("Committing a transaction for request: {}", httpServletRequest.getRequestURI());
    }

    @Override
    public void destroy() {

    }
}
