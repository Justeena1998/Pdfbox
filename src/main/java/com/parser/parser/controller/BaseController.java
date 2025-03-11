package com.parser.parser.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/call")
public class BaseController{

@GetMapping("/")
 public String hello(){
    return  "hi world";
 }

 @PostMapping("/justeena")
 public String justeena(){
    return  "hi world, justeena";
 }
 @PutMapping("/justeena")
 public String gibcen(){
    return  "hi world, justeena";
 }
 @DeleteMapping("/justeena")
 public String gibcen2(){
    return  "hi world, justeena";
 }
}

