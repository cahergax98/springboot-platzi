package com.platzi.platizimarket.domain.dto;

public class AuthenticationResponse {

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
