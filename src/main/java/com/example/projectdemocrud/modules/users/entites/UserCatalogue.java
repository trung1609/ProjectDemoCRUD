package com.example.projectdemocrud.modules.users.entites;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users_catalogues")
public class UserCatalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "create_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;

    @OneToMany(mappedBy = "user_catalogue_id")
    private Set<User> users;
}
