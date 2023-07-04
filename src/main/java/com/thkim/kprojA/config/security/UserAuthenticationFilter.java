package com.thkim.kprojA.config.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.util.Objects.isNull;

@Component
public class UserAuthenticationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("LOGIN_USER");

        if (!isNull(user)) {
            SecurityContextHolder.getContext().setAuthentication(user.makeAuthentication());
        }

        filterChain.doFilter(request, response);
    }
}
