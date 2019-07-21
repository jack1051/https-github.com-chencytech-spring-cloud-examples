package com.chaytech.provider.user.service.impl;

import com.chaytech.model.user.UserEntity;
import com.chaytech.provider.user.dao.UserDao;
import com.chaytech.provider.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:50
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean createUser(UserEntity user) {
        return userDao.insert(user);
    }

    @Override
    public UserEntity getUser(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<UserEntity> listUser() {
        return userDao.findAll();
    }
}
