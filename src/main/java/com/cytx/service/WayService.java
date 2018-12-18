package com.cytx.service;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Way;
import com.cytx.utils.Page;

public interface WayService {
    Page<Way> selectPageByQueryVo(QueryVo vo);

    void addWay(Way way);

    void deleteById(Integer id);

    Way getWayById(Integer id);

    void updateWay(Way way);
}
