package com.chaytech.provider.user.service;

import com.chaytech.model.user.UserEntity;

import java.util.List;

/**
 * UserService
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:49
 */
public interface IUserService {

    public boolean createUser(UserEntity user);

    public UserEntity getUser(Integer id);

    public List<UserEntity> listUser();
}
