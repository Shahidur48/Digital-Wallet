package com.optimagrowth.user.service;

import com.optimagrowth.user.model.User;
import com.optimagrowth.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User person){
        return userRepository.save(person);
    }

    public User userById(@PathVariable("id") Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }
//    public Boolean IsUser(@PathVariable("id") Long id) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            if(optionalUser.isPresent()){
//                return true;
//            }
//        }
//        return false;
//    }
}
