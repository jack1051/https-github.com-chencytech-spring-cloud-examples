package com.chaytech.api.fallback;

import com.chaytech.api.user.UserApi;
import com.chaytech.model.user.UserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaytech@163.com
 * @date 2019/07/28 17:00
 */
@Component
public class UserFallBack implements UserApi {
    @Override
    public boolean createUser(UserEntity user) {
        return false;
    }

    @Override
    public UserEntity getUser(Integer id) {
        UserEntity userEntity = new UserEntity("系统繁忙，请稍后再试！");
        return userEntity;
    }

    @Override
    public List<UserEntity> listUser() {
        return null;
    }
}
