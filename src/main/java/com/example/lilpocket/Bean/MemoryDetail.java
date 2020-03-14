package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Time;
import java.sql.Timestamp;

@Alias(value = "MemoryDetail")
@Component
public class MemoryDetail {

    private String sendAccount;
    private String receiveAccount;
    private String timestampSend;
    private int fileCount;
    private Timestamp memoryTimestamp;
    private String content;
    private String title;
    private String memoryId;

    public MemoryDetail() {

    }

    public MemoryDetail(@Param("sendAccount") String sendAccount,
                        @Param("receiveAccount") String receiveAccount,
                        @Param("memoryTimestamp") Timestamp memoryTimestamp,
                        @Param("fileCount") int fileCount,
                        @Param("content") String content,
                        @Param("title") String title,
                        @Param("memoryId") String memoryId) {
        this.sendAccount = sendAccount;
        this.receiveAccount = receiveAccount;
        this.memoryTimestamp = memoryTimestamp;
        this.fileCount = fileCount;
        this.content = content;
        this.title = title;
        this.memoryId = memoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(String memoryId) {
        this.memoryId = memoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFileCount() {
        return fileCount;
    }

    public void setFileCount(int fileCount) {
        this.fileCount = fileCount;
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

    public String getTimestampSend() {
        return timestampSend;
    }

    public void setTimestampSend(String timestampSend) {
        this.timestampSend = timestampSend;
    }

    public Timestamp getMemoryTimestamp() {
        return memoryTimestamp;
    }

    public void setMemoryTimestamp(Timestamp memoryTimestamp) {
        this.memoryTimestamp = memoryTimestamp;
    }
}
