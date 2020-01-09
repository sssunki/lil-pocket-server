package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.ConnectedMap;
import com.example.lilpocket.Bean.User;
import com.example.lilpocket.Service.UserService;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * method: sign in, log in, get message, update message.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService = null;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/sign")
    public int signUp(@RequestBody User user) {
        return userService.signUp(user);
    }

    @PostMapping("/login")
    public int login(@RequestBody User user) {
        return userService.logIn(user);
    }

    @PostMapping("/msg")
    public User getUserMessage(@RequestBody String account) {
        return userService.getUserMessageByAccount(account);
    }

    @PostMapping("/update/name")
    public int updateUserMessage(@RequestBody User user) {
        return userService.updateName(user);
    }

    @PostMapping("/update/password")
    public int updateUserPassword(@RequestBody User user) {
        return userService.updatePassword(user);
    }

    public List<User> getConnectedMap(@RequestBody User user){
        String userAccount = user.getAccount();
        String userIdentify = user.getIdentify();
        return userService.getConnectedUser(userAccount, userIdentify);
    }

    public User searchUser(@RequestBody String searchAccount) {
        return userService.getUserMessageByAccount(searchAccount);
    }

    public int addConnection(@RequestBody ConnectedMap connectedMap) {

        return 0;
    }
    /**
     * test method, use to test the some behavior of spring
     * @return behavior return
     */
    @GetMapping("/test/getMsg")
    @ResponseBody
    public Date test() {
        return new Date(Time.now());
    }
//    @PostMapping("/signUp")
//    public int signUp(@RequestBody User user) {
//        return userService.signUp(user);
//    }
//
////    @PostMapping("/post/test")
//    @ResponseBody
//    public User signUpTest(@RequestBody User user) {
//        userService.insertUser(user);
//        return user;
//    }
//
//    @GetMapping("/get/test")
//    public User mysqlTest(HttpServletRequest httpServletRequest) {
//        User user = new User(1,"1","1","1","1",new HashMap<>());
//        userService.insertUser(user);
//        return user;
//    }
//
//    @PostMapping("test")
//    public User Test(@RequestBody String account) {
//        User user = userService.getUser(account);
//        System.out.println(account);
//        System.out.println(user == null);
//        user = new User();
//        return user;
//    }
}
