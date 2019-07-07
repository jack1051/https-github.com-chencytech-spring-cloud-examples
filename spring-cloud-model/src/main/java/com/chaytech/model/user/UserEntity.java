package com.chaytech.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:24
 */
@NoArgsConstructor
@Data
public class UserEntity implements Serializable{

    private int id;
    private String username;
    private String  db_source; //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public UserEntity(String username){
        this.username = username;
    }
}
