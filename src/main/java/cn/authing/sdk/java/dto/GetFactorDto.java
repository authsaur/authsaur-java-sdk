package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetFactorDto {
    /**
     * MFA Factor ID
     */
    @JsonProperty("factorId")
    private String factorId;

    public String getFactorId() {
        return factorId;
    }
    public void setFactorId(String factorId) {
        this.factorId = factorId;
    }



}