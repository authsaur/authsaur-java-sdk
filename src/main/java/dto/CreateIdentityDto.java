package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class CreateIdentityDto {
    /**
     * 外部身份源的 ID
     */
    @JsonProperty("getExtIdpId")
    private String extIdpId;
    /**
     * 外部身份源类型，如 lark, wechat
     */
    @JsonProperty("getProvider")
    private String provider;
    /**
     * Identity 类型，如 unionid, openid, primary
     */
    @JsonProperty("getType")
    private String type;
    /**
     * 在外部身份源的 id
     */
    @JsonProperty("getUserIdInIdp")
    private String userIdInIdp;

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUserIdInIdp() {
        return userIdInIdp;
    }
    public void setUserIdInIdp(String userIdInIdp) {
        this.userIdInIdp = userIdInIdp;
    }



}