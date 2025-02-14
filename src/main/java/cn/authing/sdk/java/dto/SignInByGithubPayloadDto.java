package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SignInByGithubPayloadDto {
    /**
     * Github 移动端社会化登录获取到的授权码 `code`
     */
    @JsonProperty("code")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}