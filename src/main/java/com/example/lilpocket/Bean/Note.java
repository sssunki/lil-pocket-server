package com.example.lilpocket.Bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Alias(value = "note")
@Component
public class Note {
    private String sendAccount;
    private String receiveAccount;
    private String noteContent;
    // start time, finish time ( use date class ?)
}
