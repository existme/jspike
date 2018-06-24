package com.existme.spike.Feign.Oidc;

import java.util.*;

public class WellknownEntity {

    public String issuer;
    public String authorization_endpoint;
    public String token_endpoint;
    public String userinfo_endpoint;
    public String mfa_challenge_endpoint;
    public String jwks_uri;
    public String registration_endpoint;
    public String revocation_endpoint;

    public ArrayList<String> scopes_supported;
    public ArrayList<String> response_types_supported;
    public ArrayList<String> response_modes_supported;
    public ArrayList<String> subject_types_supported;
    public ArrayList<String> id_token_signing_alg_values_supported;
    public ArrayList<String> token_endpoint_auth_methods_supported;
    public ArrayList<String> claims_supported;

    public boolean request_uri_parameter_supported;

    @Override
    public String toString() {
        return "WellknownEntity{" +
                "issuer='" + issuer + '\'' +
                ", authorization_endpoint='" + authorization_endpoint + '\'' +
                ", token_endpoint='" + token_endpoint + '\'' +
                ", userinfo_endpoint='" + userinfo_endpoint + '\'' +
                ", mfa_challenge_endpoint='" + mfa_challenge_endpoint + '\'' +
                ", jwks_uri='" + jwks_uri + '\'' +
                ", registration_endpoint='" + registration_endpoint + '\'' +
                ", revocation_endpoint='" + revocation_endpoint + '\'' +
                ", scopes_supported=" + scopes_supported +
                ", response_types_supported=" + response_types_supported +
                ", response_modes_supported=" + response_modes_supported +
                ", subject_types_supported=" + subject_types_supported +
                ", id_token_signing_alg_values_supported=" + id_token_signing_alg_values_supported +
                ", token_endpoint_auth_methods_supported=" + token_endpoint_auth_methods_supported +
                ", claims_supported=" + claims_supported +
                ", request_uri_parameter_supported=" + request_uri_parameter_supported +
                '}';
    }
}