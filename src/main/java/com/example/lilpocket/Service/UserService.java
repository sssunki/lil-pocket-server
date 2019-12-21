package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.User;
import com.example.lilpocket.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private UserDAO userDAO;
    private final int ACCOUNT_EXISTS = 1;
    private final int ACCOUNT_NOT_EXISTS = 0;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


//    public boolean logIn (String account, String password) {
//        return true;
//    }
//
//    /**
//     * test period method
//     * @param user
//     */
//    public void insertUser(User user) {
//        userDAO.insertUser(user);
//    }
//
//    /**
//     * test period method
//     * @param account
//     * @return
//     */
//    public User getUser(String account) {
//        User user = userDAO.getUser(account);
//        return user;
//    }
    public User getUserMessageByAccount(String account) {
        User user = userDAO.getUserByAccount(account);
        return user;
    }

    /**
     *
     * @param user : the user to be signed
     * @return  0 : account has existed, sign up fail;
     *          1 : sign up succeed;
     */
    public int signUp(User user) {

        if (judgeAccountExist(user.getAccount()) == ACCOUNT_EXISTS) {
            return 0;
        }
        userDAO.insertUser(user);
        return 1;
//        String accountToBeSignedUp = user.getAccount();
//        User userToBeSignedUp = userDAO.getUser(accountToBeSignedUp);
//        if (userToBeSignedUp != null) {
//            return 1;
//        }
//        // insert the user to the database
//        userDAO.insertUser(userToBeSignedUp);
//        return 0;
    }

    /**
     *
     * @param   user: use the account and password that the client post to the server to create, used to judge
     *              if the logging in will be succeed or not.
     * @return  0 : account not exist or password is wrong;
     *          uid : log in succeed;
     */
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

    private int judgeAccountExist(String account) {
        User userToBeJudge = userDAO.getUserByAccount(account);
        if (userToBeJudge != null) {
            return ACCOUNT_EXISTS;
        } else {
            return ACCOUNT_NOT_EXISTS;
        }
    }


}
