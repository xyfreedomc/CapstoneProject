package com.dao;

import com.pojo.GroupInfo;

import java.util.List;

public interface GroupInfoDao {
    List<GroupInfo> findAll();

    void changePre(GroupInfo groupInfo);
}
