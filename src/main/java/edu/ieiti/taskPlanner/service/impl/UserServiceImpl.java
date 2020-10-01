package edu.ieiti.taskPlanner.service.impl;

import edu.ieiti.taskPlanner.model.User;
import edu.ieiti.taskPlanner.repository.UserRepository;
import edu.ieiti.taskPlanner.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository repository){
        this.userRepository=repository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(String userId) {
        return userRepository.findById(userId).orElse(null);

    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User tempUser = userRepository.findById(user.getId()).orElse(null);
        if (tempUser != null){
            tempUser.builder()
                    .name(user.getName())
                    .email(user.getEmail())
                    .build();
        }
        return userRepository.save(tempUser);
    }

    @Override
    public void remove(String userId) {
        userRepository.deleteById(userId);
    }
}
