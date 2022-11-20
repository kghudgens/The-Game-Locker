package controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JacksonInject;

import entities.UserEntity;
import service.UserServiceImpl;

@Controller
public class UserController {

    @Inject
    private UserServiceImpl userServiceImpl;

    @GetMapping()
    public List<UserEntity> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

}
