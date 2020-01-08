package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.User;
import com.example.lilpocket.DAO.ConnectedMapDAO;
import com.example.lilpocket.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    private ConnectedMapDAO connetctedUserDAO;
    private UserDAO userDAO;
    private final int ACCOUNT_EXISTS = 1;
    private final int ACCOUNT_NOT_EXISTS = 0;

    // public method will be call by controller

    @Autowired
    public UserService(UserDAO userDAO, ConnectedMapDAO connetctedUserDAO) {
        this.userDAO = userDAO;
        this.connetctedUserDAO = connetctedUserDAO;
    }

    public User getUserMessageByAccount(String account) {
        User user = userDAO.getUserByAccount(account);
        return user;
    }

    public int signUp(User user) {

        if (judgeAccountExist(user.getAccount()) == ACCOUNT_EXISTS) {
            return 0;
        }
        userDAO.insertUser(user);
        return 1;
    }

    public int logIn(User user) {

        String passwordInput = user.getPassword();
        String accountInput = user.getAccount();
        if (judgeAccountExist(accountInput) == ACCOUNT_NOT_EXISTS) {
            return 0;
        }

        // account exist, judge if password is right.
        User trueUser = userDAO.getUserByAccount(accountInput);
        if(trueUser.getPassword().equals(passwordInput)) {
            return trueUser.getUid();
        } else {
            return 0;
        }
    }

    public int updateName(User user) {
        userDAO.updateUserName(user.getAccount(), user.getUser_name());
        return 1;
    }

    public int updatePassword(User user) {
        userDAO.updateUserPassword(user.getAccount(), user.getPassword());
        return 1;
    }

    public List<User> getConnectedUser(String account, String identify) {
        return null;
    }


    private int judgeAccountExist(String account) {
        User userToBeJudge = userDAO.getUserByAccount(account);
        if (userToBeJudge != null) {
            return ACCOUNT_EXISTS;
        } else {
             return ACCOUNT_NOT_EXISTS;
        }
    }

}
