package com.example.lilpocket.Bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Alias(value = "memory")
@Component
public class Memory {
    private String sendAccount;
    private String receiveAccount;
    private String description;
    private String pictureUrl;
    private String videoUrl;

    // time
}
