package com.example.projectdemocrud.modules.users.services.interfaces;

import com.example.projectdemocrud.modules.users.dtos.request.LoginRequest;
import com.example.projectdemocrud.modules.users.dtos.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceInterface {
    LoginResponse login(LoginRequest request);
}
