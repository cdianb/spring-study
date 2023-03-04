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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users2 =sqlSession.selectList("com.mei.dao.UserMapper.getUsers");
        User user = new User(1234, "徐伟亮", "12343253");
        addUser(user);
        deleteUser(1234);  
        List<User> users = mapper.getUsers();
        return users;
    }

    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
