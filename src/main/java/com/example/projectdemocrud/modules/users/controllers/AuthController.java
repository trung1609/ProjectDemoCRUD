package com.example.projectdemocrud.modules.users.controllers;

import com.example.projectdemocrud.modules.users.dtos.request.LoginRequest;
import com.example.projectdemocrud.modules.users.dtos.response.LoginResponse;
import com.example.projectdemocrud.modules.users.services.impl.UserService;
import com.example.projectdemocrud.modules.users.services.interfaces.UserServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/auth")
public class AuthController {
    private final UserServiceInterface userService;
    public AuthController(UserServiceInterface userService) {
        this.userService = userService;
    }
    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse auth = userService.login(request);
        return ResponseEntity.ok(auth);
    }
}
