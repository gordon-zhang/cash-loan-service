package cn.agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.agency.domain.User;
import cn.agency.repo.UserRepository;

/**
 * Created by gordon on 17/12/25.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }
}
