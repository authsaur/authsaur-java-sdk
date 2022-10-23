package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TriggerSyncRiskOperationsDataDto {
    /**
     * 成功执行的风险操作任务
     */
    @JsonProperty("successList")
    private List<Integer> successList;
    /**
     * 执行失败的风险操作任务
     */
    @JsonProperty("faildList")
    private List<Integer> faildList;

    public List<Integer> getSuccessList() {
        return successList;
    }
    public void setSuccessList(List<Integer> successList) {
        this.successList = successList;
    }

    public List<Integer> getFaildList() {
        return faildList;
    }
    public void setFaildList(List<Integer> faildList) {
        this.faildList = faildList;
    }



}