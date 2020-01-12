package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.DateTestBean;
import com.example.lilpocket.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private volatile String accounts;

    @Autowired
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/date/add")
    public int addDateTestBean(@RequestBody DateTestBean dateTestBean) {
        return testService.addDateTestBean(dateTestBean);
    }


    @PostMapping("/date/get")
    public DateTestBean getDateTestBeanByCode(@RequestBody int dateCode) {
        return testService.getDateTestBeanByCode(dateCode);
    }


    private class StringChange{
        String afterChange;

        public String getAfterChange() {
            return afterChange;
        }

        public void setAfterChange(String afterChange) {
            this.afterChange = afterChange;
        }
    }


    @PostMapping
    public List<String> doubleRequestBodyTest(@RequestBody String account) {
        List<String> testList = new LinkedList<>();
        String a = "parent";
        StringChange change = new StringChange();
        change.setAfterChange(account);
        System.out.println(account);
        testList.add(a);
        testList.add(change.getAfterChange());
        testList.add("good");
        System.out.println(testList);
        System.out.println(account.equals("ssski"));
        return testList;
    }

}
