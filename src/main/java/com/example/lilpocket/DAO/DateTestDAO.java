package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.DateTestBean;

import java.sql.Date;

public interface DateTestDAO {
    void insertDateTestBean(DateTestBean dateTestBean);
    DateTestBean getDateTestBeanByCode(int dateCode);
}
