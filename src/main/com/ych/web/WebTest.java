package com.ych.web;

import com.ych.pojo.User;
import com.ych.service.IUserService;
import com.ych.service.UserServiceImpl;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebTest {
    IUserService service = new UserServiceImpl();
    @RequestMapping("/a.do")
    public String web(Model m){
        List<User> userList = service.lists();
        m.addAttribute("userlist",userList);
        System.out.println(userList);
        return "a";

    }
    @RequestMapping("/b.do")
    public String test(String user,String pwd){
        System.out.println(user+"  " + pwd);
        return "";
    }
}
