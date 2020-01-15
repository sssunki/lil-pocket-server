package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;

@Alias(value = "note")
@Component
public class Note {
    private String sendAccount;
    private String receiveAccount;
    private String noteContent;
    private String sendTimestampStr;
    private String noteTimestampStr;
    private Timestamp sendTimestamp;
    private Timestamp noteTimestamp;
    private boolean cycle;
    // start time, finish time ( use date class ?)

    public Note() {

    }

    public Note(@Param("sendAccount") String sendAccount,
                @Param("receiveAccount") String receiveAccount,
                @Param("noteContent") String noteContent,
                @Param("noteTimestamp") Timestamp noteTimestamp,
                @Param("sendTimestamp") Timestamp sendTimestamp,
                @Param("cycle") boolean cycle) {
        this.sendAccount = sendAccount;
        this.receiveAccount = receiveAccount;
        this.noteContent = noteContent;
        this.sendTimestamp = sendTimestamp;
        this.noteTimestamp = noteTimestamp;
        this.cycle = cycle;
    }

    public String getNoteTimestampStr() {
        return noteTimestampStr;
    }

    public void setNoteTimestampStr(String noteTimestampStr) {
        this.noteTimestampStr = noteTimestampStr;
    }

    public Timestamp getSendTimestamp() {
        return sendTimestamp;
    }

    public void setSendTimestamp(Timestamp sendTimestamp) {
        this.sendTimestamp = sendTimestamp;
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

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getSendTimestampStr() {
        return sendTimestampStr;
    }

    public void setSendTimestampStr(String sendTimestampStr) {
        this.sendTimestampStr = sendTimestampStr;
    }

    public Timestamp getNoteTimestamp() {
        return noteTimestamp;
    }

    public void setNoteTimestamp(Timestamp noteTimestamp) {
        this.noteTimestamp = noteTimestamp;
    }

    public boolean isCycle() {
        return cycle;
    }

    public void setCycle(boolean cycle) {
        this.cycle = cycle;
    }
}
