package edu.ieiti.taskPlanner;

import edu.ieiti.taskPlanner.model.Task;
import edu.ieiti.taskPlanner.model.User;
import edu.ieiti.taskPlanner.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            repository.save(new User("abc","Bilbo Baggins", "bilbo@mail.com","ieti2020",new ArrayList<Task>() ));
        };
    }
}
