package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.NamespaceDto;

public class NamespaceRespDto {
    /**
     * 权限分组详情
     */
    @JsonProperty("getData")
    private NamespaceDto data;

    public NamespaceDto getData() {
        return data;
    }
    public void setData(NamespaceDto data) {
        this.data = data;
    }



}