package com.service;

import com.dao.UserInfoDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class test {
    public void test() throws IOException
    {

    }

    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession session = factory.openSession();
        UserInfoDao userInfoDaoMapper = session.getMapper(UserInfoDao.class);
        com.pojo.UserInfo userInfo = userInfoDaoMapper.findById("123456");
        System.out.println(userInfo.getFirstName());
    }
}
