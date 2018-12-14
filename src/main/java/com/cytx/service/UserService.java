package com.cytx.service;

import com.cytx.pojo.User;

public interface UserService {
    public User confirmUser(User user);
    public Boolean phoneIsExist(String phone);

    int checkPhone(String userPhone);

    int userRegister(User user);

    int checkUsernane(String userName);
}
