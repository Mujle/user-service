package com.example.userservice.services;

import com.example.userservice.domain.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.vo.RoleVO;
import com.example.userservice.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserVO getUserByUsername(String username) {
        User user = userRepository.findByUserName(username).orElse(new User());

        Set<RoleVO> roleVOS = user.getRoles().stream()
                .map(role -> new RoleVO(role.getRole()))
                .collect(Collectors.toSet());

        return new UserVO(user.getUserName(), user.getPassword(), roleVOS);
    }
}
