package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class AppDto {
    /**
     * App ID
     */
    @JsonProperty("getAppId")
    private String appId;
    /**
     * App 名称
     */
    @JsonProperty("getAppName")
    private String appName;
    /**
     * App Logo
     */
    @JsonProperty("getAppLogo")
    private String appLogo;
    /**
     * App 登录地址
     */
    @JsonProperty("getAppLoginUrl")
    private String appLoginUrl;
    /**
     * App 默认的登录策略
     */
    @JsonProperty("getAppDefaultLoginStrategy")
    private AppDefaultLoginStrategy appDefaultLoginStrategy;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLogo() {
        return appLogo;
    }
    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getAppLoginUrl() {
        return appLoginUrl;
    }
    public void setAppLoginUrl(String appLoginUrl) {
        this.appLoginUrl = appLoginUrl;
    }

    public AppDefaultLoginStrategy getAppDefaultLoginStrategy() {
        return appDefaultLoginStrategy;
    }
    public void setAppDefaultLoginStrategy(AppDefaultLoginStrategy appDefaultLoginStrategy) {
        this.appDefaultLoginStrategy = appDefaultLoginStrategy;
    }


    /**
     * App 默认的登录策略
     */
    public static enum AppDefaultLoginStrategy {
        ALLOW_ALL("ALLOW_ALL"),
        DENY_ALL("DENY_ALL"),
        ;

        private String value;

        AppDefaultLoginStrategy(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}