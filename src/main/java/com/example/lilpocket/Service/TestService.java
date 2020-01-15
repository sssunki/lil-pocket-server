package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.DateTestBean;
import com.example.lilpocket.DAO.DateTestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private DateTestDAO dateTestDAO;

    @Autowired
    public TestService(DateTestDAO dateTestDAO) {
        this.dateTestDAO = dateTestDAO;
    }

    public DateTestBean getDateTestBeanByCode(int dateCode) {
        return dateTestDAO.getDateTestBeanByCode(dateCode);
    }

    public int addDateTestBean(DateTestBean dateTestBean) {
        int resultNumber = 1;
        System.out.println(dateTestBean.getDateCode());
        System.out.println(dateTestBean.getDateTest());
        dateTestDAO.insertDateTestBean(dateTestBean);
        return resultNumber;
    }
}
