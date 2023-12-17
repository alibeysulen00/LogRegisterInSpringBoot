package com.example.crudlogsproject.controller;

import com.example.crudlogsproject.model.entity.Users;
import com.example.crudlogsproject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    private UserService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping("/userAdd")
    public ResponseEntity<String> userAddMethod(@RequestBody Users users) {
        try {
            ResponseEntity<String> responseEntity = service.userAddServiceMethod(users);
            logger.info("Kullanıcı başarıyla eklendi - HTTP Status: {}", responseEntity.getStatusCode());
            return responseEntity;
        } catch (Exception e) {
            logger.error("Kullanıcı ekleme işleminde genel bir hata oluştu", e);
            return new ResponseEntity<>("Kullanıcı eklenirken genel bir hata oluştu", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}