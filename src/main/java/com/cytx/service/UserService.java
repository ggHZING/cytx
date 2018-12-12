package com.cytx.service;

import com.cytx.pojo.User;
import com.cytx.pojo.UserExample;

import java.util.List;

public interface UserService {
    public User confirmUser(User user);
    public Boolean phoneIsExist(String phone);
}
