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
        example.or().andUserPhoneEqualTo(phone);
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public int checkPhone(String userPhone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(userPhone);
        int count =(int) userMapper.countByExample(example);

        return count;
    }

    @Override
    public int userRegister(User user) {

        user.setUserName(user.getUserName());
        user.setUserPassword(user.getUserPassword());
        user.setUserEmail(user.getUserEmail());
        user.setUserPhone(user.getUserPhone());

        int i = userMapper.insert(user);

        return i;
    }

    @Override
    public int checkUsernane(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        int count =(int) userMapper.countByExample(example);

        return count;
    }


}
