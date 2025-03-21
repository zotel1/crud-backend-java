package com.backend.crud.service;

import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtTokenService {

    private final String apisecret = "TExBVkVfTVVZX1NFQ1JFVEzE3Zmxu7BSGSJx72BSBXM";

    private static final long ACCESS_TOKEN_VALIDITY = 1000 * 60 * 15; // 15 minutos
    private static final long REFRESH_TOKEN_VALIDITY = 1000 * 60 * 60 * 24; // 24 horas

 //   public String generateToken(UserDetails)
}
