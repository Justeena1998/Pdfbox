package com.parser.parser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.parser.parser.dto.LoginRequest;







@RestController
@RequestMapping("/login")
public class latestcontroller {

    @GetMapping("")
    public String hello(@RequestBody LoginRequest request) {
        String username = "user";
        String password = "password1234";
        if(request.getUsername().equals(username) && request.getPassword().equals("password1234")){
           return "success";
        }
        else{
            return "failed";
        }
        }
}
       // return "hai";
   // }
//}