package com.pojo;

import java.util.Objects;

public class GroupInfo {
    private String groupId;

    private String projectPre1;

    private String projectPre2;

    private String projectPre3;

    private String submitTime;

    private String allocatedResult;

    public GroupInfo() {

    }

    public GroupInfo(String groupId, String projectPre1, String projectPre2, String projectPre3, String submitTime,
                     String allocatedResult) {
        this.groupId = groupId;
        this.projectPre1 = projectPre1;
        this.projectPre2 = projectPre2;
        this.projectPre3 = projectPre3;
        this.submitTime = submitTime;
        this.allocatedResult = allocatedResult;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getProjectPre1() {
        return projectPre1;
    }

    public void setProjectPre1(String projectPre1) {
        this.projectPre1 = projectPre1;
    }

    public String getProjectPre2() {
        return projectPre2;
    }

    public void setProjectPre2(String projectPre2) {
        this.projectPre2 = projectPre2;
    }

    public String getProjectPre3() {
        return projectPre3;
    }

    public void setProjectPre3(String projectPre3) {
        this.projectPre3 = projectPre3;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getAllocatedResult() {
        return allocatedResult;
    }

    public void setAllocatedResult(String allocatedResult) {
        this.allocatedResult = allocatedResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupInfo groupInfo = (GroupInfo) o;
        return Objects.equals(groupId, groupInfo.groupId) && Objects.equals(projectPre1, groupInfo.projectPre1) && Objects.equals(projectPre2, groupInfo.projectPre2) && Objects.equals(projectPre3, groupInfo.projectPre3) && Objects.equals(submitTime, groupInfo.submitTime) && Objects.equals(allocatedResult, groupInfo.allocatedResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, projectPre1, projectPre2, projectPre3, submitTime, allocatedResult);
    }
}
