package com.example.userservice.serviceImplementations;

import com.example.userservice.domain.Role;
import com.example.userservice.domain.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.*;

class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserRepository userRepository;

    User user;
    Set<Role> roles;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
        user = new User(1, "User", "Marko", "Markovic", "marko123");

    }

    @Test
    void getUserByUsername() {

        String username = "User";
        Optional<User> optionalUser = Optional.of(user);

        when(userRepository.findByUserName(username)).thenReturn(optionalUser);
        userRepository.findByUserName(username);

        verify(userRepository, times(1)).findByUserName(username);

    }
}