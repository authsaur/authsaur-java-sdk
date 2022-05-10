package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DepartmentDto {
    /**
     * 部门 ID
     */
    @JsonProperty("getDepartmentId")
    private String departmentId;
    /**
     * 父部门 id
     */
    @JsonProperty("getParentDepartmentId")
    private String parentDepartmentId;
    /**
     * 部门名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 部门描述
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 部门识别码
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("getLeaderUserId")
    private String leaderUserId;
    /**
     * 部门人数
     */
    @JsonProperty("getMembersCount")
    private Integer membersCount;
    /**
     * 是否包含子部门
     */
    @JsonProperty("getHasChildren")
    private Boolean hasChildren;

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }



}