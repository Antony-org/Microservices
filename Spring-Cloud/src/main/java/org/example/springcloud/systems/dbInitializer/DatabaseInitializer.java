package org.example.springcloud.systems.dbInitializer;

import org.example.springcloud.models.User;
import org.example.springcloud.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    public DatabaseInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // Create some initial users
        User user1 = new User(null, "john_doe", "john@example.com");
        User user2 = new User(null, "jane_doe", "jane@example.com");
        User user3 = new User(null, "admin", "admin@example.com");

        // Save users to the database
        userRepository.saveAll(Arrays.asList(user1, user2, user3));

        System.out.println("Users have been initialized!");
    }
}