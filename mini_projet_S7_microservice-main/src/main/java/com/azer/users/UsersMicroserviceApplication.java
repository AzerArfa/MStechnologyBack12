package com.azer.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import com.azer.users.entities.Role;
import com.azer.users.entities.User;
import com.azer.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersMicroserviceApplication.class, args);
    }

    @Autowired
    UserService userService;

    @PostConstruct
    void init_users() {
    	 /*  // Ajouter les rôles
        userService.addRole(new Role(null, "ADMIN"));
        userService.addRole(new Role(null, "USER"));

        // Ajouter les users
        userService.saveUser(new User(null, "admin", "123", true, null));
        userService.saveUser(new User(null, "hanin", "123", true, null));
        userService.saveUser(new User(null, "tassnim", "123", true, null));

      // Ajouter les rôles aux users
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("hanin", "USER");
        userService.addRoleToUser("tassnim", "USER");*/
    }

    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }
 

}
