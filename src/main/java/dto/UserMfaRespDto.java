package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UserMfaRespDto {
    /**
     * 是否绑定了 TOTP，可选值 enabled, disabled
     */
    @JsonProperty("getTotpStatus")
    private Boolean totpStatus;
    /**
     * 是否绑定了人脸 MFA，可选值 enabled, disabled
     */
    @JsonProperty("getFaceMfaStatus")
    private Boolean faceMfaStatus;

    public Boolean getTotpStatus() {
        return totpStatus;
    }
    public void setTotpStatus(Boolean totpStatus) {
        this.totpStatus = totpStatus;
    }

    public Boolean getFaceMfaStatus() {
        return faceMfaStatus;
    }
    public void setFaceMfaStatus(Boolean faceMfaStatus) {
        this.faceMfaStatus = faceMfaStatus;
    }



}