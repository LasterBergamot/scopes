package com.pet.project.scopes.model.scoped.ext;

import com.pet.project.scopes.model.scoped.ScopedBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/*
    The bean exists till the session exists.
 */
@Component
@SessionScope
public class SessionScopedBean extends ScopedBean {}
