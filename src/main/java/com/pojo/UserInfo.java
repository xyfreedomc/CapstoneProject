package com.pojo;

import java.util.Objects;

public class UserInfo {
    private String SID;

    private String password;

    private String userType;

    private String groupID;

    private String firstName;

    private String lastName;

    public UserInfo() {

    }

    public UserInfo(String SID, String password, String userType, String groupID, String firstName, String lastName) {
        this.SID = SID;
        this.password = password;
        this.userType = userType;
        this.groupID = groupID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(SID, userInfo.SID) && Objects.equals(password, userInfo.password) && Objects.equals(userType, userInfo.userType) && Objects.equals(groupID, userInfo.groupID) && Objects.equals(firstName, userInfo.firstName) && Objects.equals(lastName, userInfo.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SID, password, userType, groupID, firstName, lastName);
    }
}
