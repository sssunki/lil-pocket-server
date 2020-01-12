package com.example.lilpocket.Bean;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Alias(value = "DateTestBean")
@Component
public class DateTestBean {
    private Date date;
    private int dateCode;

    public DateTestBean() {

    }

    public DateTestBean(@Param("dateTest") Date date ,
                        @Param("dateCode") int dateCode) {
        this.date = date;
        this.dateCode = dateCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDateCode() {
        return dateCode;
    }

    public void setDateCode(int dateCode) {
        this.dateCode = dateCode;
    }
}
