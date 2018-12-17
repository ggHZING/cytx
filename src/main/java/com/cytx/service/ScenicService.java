package com.cytx.service;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Scenic;
import com.cytx.utils.Page;

public interface ScenicService {
    Page<Scenic> selectPageByQueryVo(QueryVo vo);

    void deleteById(Integer id);

    void addScenic(Scenic scenic);

    Scenic getScenicById(Integer id);

    void updateScenic(Scenic scenic);
}
