package com.example.projectdemocrud.modules.users.services.impl;

import com.example.projectdemocrud.modules.users.dtos.UserDTO;
import com.example.projectdemocrud.modules.users.dtos.request.LoginRequest;
import com.example.projectdemocrud.modules.users.dtos.response.LoginResponse;
import com.example.projectdemocrud.modules.users.entites.User;
import com.example.projectdemocrud.modules.users.services.interfaces.UserServiceInterface;
import com.example.projectdemocrud.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService implements UserServiceInterface {
    @Override
    public LoginResponse login(LoginRequest request) {
        try {
//            String email = request.getEmail();
//            String password = request.getPassword();
            String token = "random_token";
            UserDTO user = new UserDTO(1L, "trung8d2005@gmail.com");
            return new LoginResponse(token, user);
        } catch (Exception e) {
            throw new RuntimeException("Co van de xay ra");
        }
    }
}
