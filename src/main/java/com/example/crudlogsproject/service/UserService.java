package com.example.crudlogsproject.service;

import com.example.crudlogsproject.model.entity.Users;
import com.example.crudlogsproject.model.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;




    public ResponseEntity<String> userAddServiceMethod(Users users){
        try{
            Users newUsers = new Users();
            newUsers.setName(users.getName());
            newUsers.setSurname(users.getSurname());
            userRepo.save(newUsers);
            return new ResponseEntity<>("Kullanıcı Başarıyla Eklendi",HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>("Kullanıcı eklenirken hata meydana geldi",HttpStatus.INTERNAL_SERVER_ERROR );
        }


    }
}
