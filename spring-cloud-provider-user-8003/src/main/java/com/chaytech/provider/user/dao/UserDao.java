package com.chaytech.provider.user.dao;

import com.chaytech.model.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:46
 */
@Mapper
public interface UserDao {

    public boolean insert(UserEntity user);

    public UserEntity findById(Integer id);

    public List<UserEntity> findAll();
}
