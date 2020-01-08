package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDAO {

    User getUserByAccount(String account);
    void insertUser(User user);
    boolean selectUser(String account);
    void updateUserName(String account, String name);
    void updateUserPassword(String account, String password);
}
