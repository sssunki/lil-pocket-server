package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Time;
import java.sql.Timestamp;

@Alias(value = "memory")
@Component
public class Memory {
    private String sendAccount;
    private String receiveAccount;
    private String description;
    private String pictureUrl;
    private String videoUrl;
    private String voiceUrl;
    private String timestampSend;
    private Timestamp memoryTimestamp;
    // time

    public Memory() {

    }

    public Memory(@Param("sendAccount") String sendAccount,
                  @Param("receiveAccount") String receiveAccount,
                  @Param("description") String description,
                  @Param("pictureUrl") String pictureUrl,
                  @Param("videoUrl") String videoUrl,
                  @Param("voiceUrl") String voiceUrl,
                  @Param("memoryTimestamp") Timestamp memoryTimestamp) {
        this.sendAccount = sendAccount;
        this.receiveAccount = receiveAccount;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.videoUrl = videoUrl;
        this.voiceUrl = voiceUrl;
        this.memoryTimestamp = memoryTimestamp;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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
