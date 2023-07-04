package com.thkim.kprojA.config.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class UserAuthenticationToken implements Authentication {
    public UserAuthenticationToken(String emails, String password, List<GrantedAuthority> roles) {
    }

    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {}
    public boolean isAuthenticated() { return true; }
    public Object getPrincipal() { return null; }
    public Object getDetails() { return null; }
    public Object getCredentials() {return null; }
    public Collection<? extends GrantedAuthority> getAuthorities() {return null; }

    public boolean equals(Object another) { return true; }

    public String toString() { return null; }

    public int hashCode() { return 1; }

    public String getName() { return null; }

}
