package service;

import java.util.List;

import javax.inject.Inject;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import daos.UserEntityDAOImpl;
import entities.UserEntity;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    UserEntityDAOImpl userEntityDAOImpl;

    @Override
    public List<UserEntity> getAllUsers() {
        return userEntityDAOImpl.getAllUsers();
    }

}
