package com.pet.project.scopes.controller;

import com.pet.project.scopes.model.scoped.ext.RequestScopedBean;
import com.pet.project.scopes.model.scoped.ext.SessionScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScopesController {

    private RequestScopedBean requestScopedBean;

    private SessionScopedBean sessionScopedBean;

    @Autowired
    public ScopesController(RequestScopedBean requestScopedBean, SessionScopedBean sessionScopedBean) {
        this.requestScopedBean = requestScopedBean;
        this.sessionScopedBean = sessionScopedBean;
    }

    /*
        For each request, the bean will be created.
        It doesn't matter, if we set the message to something different, if the request is done, the bean won't exist anymore.
        If the request is created, the bean will be created, hence making the message null again.
     */
    @GetMapping("/scopes/request")
    public String getRequestScopedMessage() {
        System.out.println();
        System.out.println("Request scoped bean");
        System.out.println("Default message: " + requestScopedBean.getHelloMessageGenerator().getMessage());
        System.out.println("Setting message to 'Hello, World!'");
        requestScopedBean.getHelloMessageGenerator().setMessage("Hello, World!");
        System.out.println("Message after setting: " + requestScopedBean.getHelloMessageGenerator().getMessage());

        return "index";
    }

    /*
        After the session is created, the bean will exist as well, as long as the session exists.
        If we set the message to something different, then create a new request, we'll see the message we set before, while being in a new request.
        This is because of the session which has been created for the bean.
     */
    @GetMapping("/scopes/session")
    public String getSessionScopedMessage() {
        System.out.println();
        System.out.println("Session scoped bean");
        System.out.println("Default message: " + sessionScopedBean.getHelloMessageGenerator().getMessage());
        System.out.println("Setting message to 'Hello, World!'");
        sessionScopedBean.getHelloMessageGenerator().setMessage("Hello, World!");
        System.out.println("Message after setting: " + sessionScopedBean.getHelloMessageGenerator().getMessage());

        return "index";
    }
}
