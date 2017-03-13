package com.edu.nju.wel.controller;

import com.edu.nju.wel.model.User;
import com.edu.nju.wel.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zs on 2017/3/2.
 */

@Controller
public class UserController {
    @Resource(name = "UserService")
    UserService userService;

    @RequestMapping(value = "/users" , method= RequestMethod.GET)
	@ResponseBody
    public List<User> getUsers(){
        List<User> list = userService.DAOManager.userDao.findAll();
        return list;
    }
	
	@RequestMapping(value = "/user/{id}" , method= RequestMethod.GET)
	@ResponseBody
    public User getUserById(@RequestParam("id") String id){
        User user = userService.DAOManager.userDao.findById(id);
        return user;
    }
	
	@RequestMapping(value = "/update" , method= RequestMethod.POST)
	@ResponseBody
    public void updateUser(@RequestParam("user") User user){
        return userService.DAOManager.userDao.update(user);
    }
	
	@RequestMapping(value = "/insert" , method= RequestMethod.POST)
	@ResponseBody
    public void insertUser(@RequestParam("user") User user){
        return userService.DAOManager.userDao.insert(user);
    }
	
	@RequestMapping(value = "/delete" , method= RequestMethod.POST)
	@ResponseBody
    public void deleteUser(@RequestParam("user") User user){
        return userService.DAOManager.userDao.delete(user);
    }
}
