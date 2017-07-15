package com.tianle.controller;

import com.tianle.domain.Result;
import com.tianle.domain.User;
import com.tianle.repository.UserRepository;
import com.tianle.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.tianle.service.UserService;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
/**
 * Created by win7 on 2017/4/27.
 */
@Controller
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private UserService userService;

    /**
     * 查询用户信息
     * @return
     * */
    @GetMapping(value = "/users")
    public String  getUser(Model model){
        logger.info("查询所有用户");
        List<User> users = userRepository.findAll();
        model.addAttribute("users",users);
        model.addAttribute("pagepath","list/users");
        return "home";
    }
    /**
     * 添加用户
     * @param user
     * @param bindingResult
     * @return
     * */
    @PostMapping(value = "/users")
    @ResponseBody
    public Result<User> userAdd(@Valid User user, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return ResultUtil.error(0,bindingResult.getFieldError().getDefaultMessage());

        }

        return ResultUtil.success(userRepository.save(user));
    }

    @RequestMapping(value = "/users/{id}")
    @ResponseBody
    public User  getOne(@PathVariable("id") Integer id,Model model)
    {
        return userRepository.findOne(id);
    }

    @PutMapping(value ="/users/{id}")
    @ResponseBody
    public User userUpdate(@PathVariable("id") Integer id,
                            @RequestParam("password") String  password,
                            @RequestParam("mobileno") String  mobileno)
    {
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setMobileno(mobileno);
        return userRepository.save(user);
    }

    @DeleteMapping(value ="/users/{id}")
    @ResponseBody
    public void userDelete(@PathVariable("id") Integer id)
    {
        userRepository.delete(id);
    }


    @GetMapping(value = "/users/username/{username}")
    @ResponseBody
    public List<User> getUserByUsername(@PathVariable("username") String username)
    {
        return userRepository.findByUsername(username);
    }

    @GetMapping(value = "/users/getAge/{id}")
    @ResponseBody
    public void getAge(@PathVariable("id") Integer id) throws Exception
    {
         userService.getAge(id);
    }

    @RequestMapping("/")
    public String index(Model model)
    {
        List<User> users = userRepository.findAll();
        model.addAttribute("users",users);
        return "index";
    }

    @RequestMapping(value ="/users/register")
    public String register()
    {
        return "register";
    }

    @RequestMapping("/users/add")
    //public String add(String username,String password,String mobileno,String age)
    public String add(User user, Model model)
    {
        if(user != null && user.getUsername() != null)
        {
            userRepository.save(user);
        }
        List<User> users = userRepository.findAll();
        model.addAttribute("users",users);
        return "list/users";
    }



}
