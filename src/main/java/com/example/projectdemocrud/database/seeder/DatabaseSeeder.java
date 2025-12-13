package com.example.projectdemocrud.database.seeder;

import com.example.projectdemocrud.modules.users.entites.User;
import com.example.projectdemocrud.modules.users.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

//        entityManager.createNativeQuery("INSERT into users(name,email,password, user_catalogue_id, phone,address) VALUES (?,? , ?, ?, ?, ?)")
//                .setParameter(1,"Test")
//                .setParameter(2,"test@gmail.com")
//                .setParameter(3, passwordEncode)
//                .setParameter(4, 1)
//                .setParameter(5, "0123456789")
//                .setParameter(6, "Test Address")
//                .executeUpdate();
//        if (isTableEmpty()) {
//            System.out.println("Password: " + passwordEncode);
//        }

//        User user = new User();
//        user.setName("Test");
//        user.setEmail("test@gmail.com");
//        user.setPassword(passwordEncode);
//        user.setPhone("0123456789");
//        user.setAddress("Test Address");
//        user.setUser_catalogue_id(1L);
//        entityManager.persist(user);

//        User user = new User();
//        user.setName("Test");
//        user.setEmail("test@gmail.com");
//        user.setPassword(passwordEncode);
//        user.setPhone("0123456789");
//        user.setAddress("Test Address");
//        user.setUser_catalogue_id(1L);
//        userRepository.save(user);

        if(isTableEmpty()) {
            String passwordEncode = passwordEncoder.encode("password");
            User user = new User();
            user.setName("Trung");
            user.setEmail("trung@gmail.com");
            user.setPassword(passwordEncode);
            user.setUser_catalogue_id(1L);
            user.setPhone("0123456789");
            user.setAddress("Ha Noi");
            userRepository.save(user);
        }
    }

    private boolean isTableEmpty() {
        Long count = (Long) entityManager.createQuery("SELECT count(id) from User ").getSingleResult();
        return count == 0;
    }
}
