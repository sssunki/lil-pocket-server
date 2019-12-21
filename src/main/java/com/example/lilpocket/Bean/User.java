package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Alias(value = "user")
@Component
public class User {

    private int uid;
    private String user_name = null;
    private String identify = null;
    private String account = null;
    private String password = null;
    // private HashMap<String, String> familyMember = new HashMap<>();

    public User() {

    }

    public User(@Param("uid")int uid,
                @Param("userName") String userName,
                @Param("identify") String identify,
                @Param("account") String account,
                @Param("password") String password, HashMap<String, String> familyMember) {
        this.uid = uid;
        this.user_name = userName;
        this.identify = identify;
        this.account = account;
        this.password = password;
        // this.familyMember = familyMember;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public HashMap<String, String> getFamilyMember() {
//        return familyMember;
//    }
//
//    public void setFamilyMember(HashMap<String, String> familyMember) {
//        this.familyMember = familyMember;
//    }
}
