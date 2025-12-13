package com.example.projectdemocrud.modules.users.controllers;

import com.example.projectdemocrud.modules.users.request.LoginRequest;
import com.example.projectdemocrud.modules.users.dtos.response.LoginResponse;
import com.example.projectdemocrud.modules.users.services.interfaces.UserServiceInterface;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private final UserServiceInterface userService;
    public AuthController(UserServiceInterface userService) {
        this.userService = userService;
    }
    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request){
        LoginResponse auth = userService.login(request);
        return ResponseEntity.ok(auth);
    }


}
