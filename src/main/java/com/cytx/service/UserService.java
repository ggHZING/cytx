package com.cytx.service;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.User;
import com.cytx.utils.Page;

public interface UserService {
    public User confirmUser(User user);
    public Boolean phoneIsExist(String phone);

    int checkPhone(String userPhone);

    int userRegister(User user);

    int checkUsernane(String userName);


    void deleteById(Integer id);

    Page<User> selectPageByQueryVo(QueryVo vo);

    User getUserByPhone(String phone);

    void updatePerson(User user);
}
