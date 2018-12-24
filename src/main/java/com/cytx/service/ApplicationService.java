package com.cytx.service;

import com.cytx.pojo.Application;
import com.cytx.pojo.QueryVo;
import com.cytx.utils.Page;

public interface ApplicationService {
    Page<Application> selectApplicationPageByQueryVo(QueryVo vo);

    void pass(Integer id);

    void fail(Integer id);

    Application selectById(Integer id);

    void insertApplication(Application application);
}
