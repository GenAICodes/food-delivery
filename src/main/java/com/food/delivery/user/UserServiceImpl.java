
package com.food.delivery.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerUser(String name, String email, String password) {
        User user = new User(name, email, passwordEncoder.encode(password), false);
        return userRepository.save(user);
    }

    @Override
    public boolean verifyUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            user.setVerified(true);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
