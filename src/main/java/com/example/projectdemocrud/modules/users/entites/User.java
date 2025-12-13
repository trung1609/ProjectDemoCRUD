package com.example.projectdemocrud.modules.users.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long user_catalogue_id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "image")
    private String image;

    @Column(name = "create_at")
    private LocalDate created_at;
    @Column(name = "updated_at")
    private LocalDate updated_at;

    @PrePersist
    protected void onCreate() {
        created_at = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated_at = LocalDate.now();
    }


    public Long getUser_catalogue_id() {
        return user_catalogue_id;
    }

    public void setUser_catalogue_id(Long user_catalogue_id) {
        this.user_catalogue_id = user_catalogue_id;
    }
}
