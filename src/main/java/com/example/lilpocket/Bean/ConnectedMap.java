package com.example.lilpocket.Bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Alias(value = "connected_map")
@Component
public class ConnectedMap {
    private String parentName;
    private String parentAccount;
    private String childName;
    private String childAccount;

    public ConnectedMap(String parentName, String parentAccount, String childName, String childAccount) {
        this.parentName = parentName;
        this.parentAccount = parentAccount;
        this.childName = childName;
        this.childAccount = childAccount;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildAccount() {
        return childAccount;
    }

    public void setChildAccount(String childAccount) {
        this.childAccount = childAccount;
    }
}
