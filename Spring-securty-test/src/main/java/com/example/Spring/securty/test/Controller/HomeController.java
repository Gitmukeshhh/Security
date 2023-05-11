package com.example.Spring.securty.test.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {


    @PreAuthorize("hasRole('NORMAL')")
    @GetMapping("/normal")
    public ResponseEntity<String> normalUsers(){
        return  ResponseEntity.ok("Yes i am normal users");
    }





    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){
        return  ResponseEntity.ok("Yes i am admin users");
    }






    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return  ResponseEntity.ok("Yes i am public users");
    }





}
