package com.cytx.service;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Way;
import com.cytx.utils.Page;

import java.util.List;

public interface WayService {
    Page<Way> selectPageByQueryVo(QueryVo vo);

    void addWay(Way way);

    void deleteById(Integer id);

    Way getWayById(Integer id);

    void updateWay(Way way);

    List<Way> selectWayList();

    Page<Way> selectPageByQuery(QueryVo queryVo);
}
