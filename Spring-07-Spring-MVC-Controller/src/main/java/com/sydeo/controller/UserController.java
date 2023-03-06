package com.sydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  @RequestMapping("/user")
   public  String user (){
     //  return "userInfo.html";    can not do it will go to static folder and we do not have it directly it should be
      //  /user/userInfo.html
      return "/user/userInfo.html";
   }
}
