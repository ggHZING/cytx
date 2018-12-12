package com.cytx.service.Impl;

import com.cytx.dao.UserMapper;
import com.cytx.pojo.User;
import com.cytx.pojo.UserExample;
import com.cytx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User confirmUser(User user) {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo(user.getUserName()).andUserPasswordEqualTo(user.getUserPassword());
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public Boolean phoneIsExist(String phone) {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo(phone);
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty()){
            return false;
        }else {
            return true;
        }

    }
}
