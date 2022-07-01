package com.bouquet.api.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefreshedTokenInfo {
    @JsonProperty("token_type")
    String tokenType;
    @JsonProperty("access_token")
    String accessToken;
    @JsonProperty("expires_in")
    int expiresIn;
    @JsonProperty(value = "refresh_token")
    String refreshToken;
}
