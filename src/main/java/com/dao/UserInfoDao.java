package com.dao;

import com.pojo.UserInfo;

import java.util.List;

public interface UserInfoDao {
    UserInfo findById(String sid);

    void changeGroup(String groupID, String SID);

    List<UserInfo> selectAll();

    void changePassword(String SID, String password);

    void addStudent(UserInfo userInfo);
}
