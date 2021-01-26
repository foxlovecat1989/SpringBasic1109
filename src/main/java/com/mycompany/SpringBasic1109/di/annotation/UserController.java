package com.mycompany.springbasic1109.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = "prototype")
public class UserController {
    @Autowired
    private UserService userService;
    
    public Users getAll(){
        return userService.findAllUser();
    }
    
    public Boolean isExistByName(String name){
        return userService.isExistByName(name);
    }
}
