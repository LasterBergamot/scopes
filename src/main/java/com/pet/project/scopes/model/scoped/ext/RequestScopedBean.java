package com.pet.project.scopes.model.scoped.ext;

import com.pet.project.scopes.model.scoped.ScopedBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/*
    The bean exists till the request exists.
 */
@Component
@RequestScope
public class RequestScopedBean extends ScopedBean {}
