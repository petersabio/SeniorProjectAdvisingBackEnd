package com.seniorproject.Backend.Controllers;

import com.seniorproject.Backend.entities.User;
import com.seniorproject.Backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("login")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        System.out.println(userData);
        User user =userRepository.findByusername(userData.getUsername());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);

        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }



    @GetMapping("Users")
    public List<User> getUsers() {return this.userRepository.findAll();}



}

