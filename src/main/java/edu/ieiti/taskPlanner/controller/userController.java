package edu.ieiti.taskPlanner.controller;


import edu.ieiti.taskPlanner.model.User;
import edu.ieiti.taskPlanner.repository.UserRepository;
import edu.ieiti.taskPlanner.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    private final UserService userService;

    public userController(UserService service){
        this.userService=service;
    }

    @GetMapping("/users")
    List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    User getById(@PathVariable String id) {
        return userService.getById(id);
    }

    @PostMapping("/users")
    User createUser(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping("/users")
    User updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable String id){
        userService.remove(id);
    }

}
