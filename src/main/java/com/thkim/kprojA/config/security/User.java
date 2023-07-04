package com.thkim.kprojA.config.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


@Data
public class User {
    String email;
    String password;
    String roles;

    public UserAuthenticationToken makeAuthentication() {
        List<GrantedAuthority> roles = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(this.roles, ",");
        while (st.hasMoreTokens()) {
            roles.add(new SimpleGrantedAuthority(st.nextToken()));
        }

        return new UserAuthenticationToken(email, password, roles);
    }
}
