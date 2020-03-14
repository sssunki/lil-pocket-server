package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Alias(value = "MemorySummary")
@Component
public class MemorySummary {

    private String sendAccount;
    private String receiveAccount;
    private String title;
    private String timestampSend;
    private String memoryId;
    private Timestamp memoryTimestamp;

    public MemorySummary() { }

    public MemorySummary(@Param("sendAccount") String sendAccount,
                         @Param("receiveAccount") String receiveAccount,
                         @Param("title") String title,
                         @Param("memoryId") String memoryId,
                         @Param("memoryTimestamp") Timestamp memoryTimestamp
                         ) {
        this.sendAccount = sendAccount;
        this.receiveAccount = receiveAccount;
        this.title = title;
        this.memoryId = memoryId;
        this.memoryTimestamp = memoryTimestamp;
    }

    public static MemorySummary createFromMemoryDetail(MemoryDetail memoryDetail) {
        return new MemorySummary(
                memoryDetail.getSendAccount(),
                memoryDetail.getReceiveAccount(),
                memoryDetail.getTitle(),
                memoryDetail.getMemoryId(),
                memoryDetail.getMemoryTimestamp()
        );
    }

    public String getSendAccount() {
        return sendAccount;
    }

    public void setSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
    }

    public String getReceiveAccount() {
        return receiveAccount;
    }

    public void setReceiveAccount(String receiveAccount) {
        this.receiveAccount = receiveAccount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimestampSend() {
        return timestampSend;
    }

    public void setTimestampSend(String timestampSend) {
        this.timestampSend = timestampSend;
    }

    public String getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(String memoryId) {
        this.memoryId = memoryId;
    }

    public Timestamp getMemoryTimestamp() {
        return memoryTimestamp;
    }

    public void setMemoryTimestamp(Timestamp memoryTimestamp) {
        this.memoryTimestamp = memoryTimestamp;
    }
}
