package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Alias(value = "DateTestBean")
@Component
public class DateTestBean {

    private String dateTestSend;
    private Timestamp dateTest;
    private int dateCode;

    public DateTestBean() {

    }

    public DateTestBean(@Param("dateTest") Timestamp dateTest,
                        @Param("dateCode") int dateCode) {
        this.dateTest = dateTest;
        this.dateCode = dateCode;
    }

    public String getDateTestSend() {
        return dateTestSend;
    }

    public void setDateTestSend(String dateTestSend) {
        this.dateTestSend = dateTestSend;
    }

    public Timestamp getDateTest() {
        return dateTest;
    }

    public void setDateTest(Timestamp dateTest) {
        this.dateTest = dateTest;
    }

    public int getDateCode() {
        return dateCode;
    }

    public void setDateCode(int dateCode) {
        this.dateCode = dateCode;
    }
}
