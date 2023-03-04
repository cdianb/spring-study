package com.mei.dao;

import com.mei.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author mql
 * @date 2023年03月03日 17:11
 */
public class UserMapperImpl implements UserMapper{
    //之前所有操作都是用sqlSession来执行，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }


    public List<User> getUsers() {
//        List<User> users2 =sqlSession.selectList("com.mei.dao.UserMapper.getUsers");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        return users;
    }
}
