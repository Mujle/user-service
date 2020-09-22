package com.example.userservice.services;

import com.example.userservice.vo.UserVO;

public interface UserService {

    UserVO getUserByUsername(String username);
}
