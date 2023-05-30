package com.ezbytes.SpringbootSecuritydemo.controller;

import com.ezbytes.SpringbootSecuritydemo.entity.User;
import com.ezbytes.SpringbootSecuritydemo.utils.ExtractJwt;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class WelcomeController {

    private ExtractJwt extractJwt;


    @GetMapping("/users" )

    public List<User> getUsers(@RequestHeader("Authorization") String token) throws JsonProcessingException {

     // Extract the email from the claims
      String email = extractJwt.payloadJWTExtraction(token);

        // Print the email
       System.out.println("Email: " + email);
        List<User> users = new ArrayList<>();

        // Adding fake user data
        users.add(new User(1, "John Doe", "john.doe@example.com"));
        users.add(new User(2, "Jane Smith", "jane.smith@example.com"));

        return users;
    }

    // User class

}