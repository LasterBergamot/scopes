package com.pet.project.scopes.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    Used to perform operations...
     - ...before sending the request to the controller
     - ...before sending the response to the client
 */

@Component
public class RandomInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomInterceptor.class);

    /*
        Used to perform operations before sending the request to the controller.
        This method should return true to return the response to the client.

        Will be called after handler method invocation but before the view being rendered.
        So, you can add more model objects to the view but you can not change the HttpServletResponse since it's already committed.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // just the /scopes paths work
        if (request.getRequestURI().equals("/profiles/random")) {
            response.sendError(404);
        }

        LOGGER.info("preHandle() method is calling!");

        return true;
    }

    /*
        Used to perform operations before sending the response to the client.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if (request.getRequestURI().equals("/scopes/request")) {
            response.sendRedirect("/scopes/session");
        }

        LOGGER.info("postHandle() method is calling!");
    }

    /*
        Used to perform operations after completing the request and response.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOGGER.info("The request and response is completed! Status: {}", response.getStatus());
    }
}
