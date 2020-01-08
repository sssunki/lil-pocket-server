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

}
