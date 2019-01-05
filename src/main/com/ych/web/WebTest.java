package com.ych.web;

import com.ych.pojo.User;
import com.ych.service.IUserService;
import com.ych.service.UserServiceImpl;
import org.springframework.http.HttpRequest;
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
    public String test(){

        return "b";
    }

    @RequestMapping("/add.do")
    public String add(User user){
        service.insert(user);
        return "redirect:a.do";
    }
    @RequestMapping("/delete.do")
    public String delete(int id){
        service.delete(id);
        return "redirect:a.do";
    }
    @RequestMapping("/update.do")
    public String update(ModelMap map,int id){
        User u = service.getOne(id);
        map.addAttribute("u",u);
        return "update";
    }
    @RequestMapping("/doupdate.do")
    public String doupdate(User user){
        service.update(user);
        return "redirect:a.do";
    }

}
