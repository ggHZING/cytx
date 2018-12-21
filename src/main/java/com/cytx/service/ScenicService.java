package com.cytx.service;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Scenic;
import com.cytx.utils.Page;

import java.util.List;

public interface ScenicService {
    Page<Scenic> selectPageByQueryVo(QueryVo vo);

    void deleteById(Integer id);

    void addScenic(Scenic scenic);

    Scenic getScenicById(Integer id);

    void updateScenic(Scenic scenic);

    List<Scenic> selectScenicList();

    List<Scenic> selectScenicListAsc();

    List<Scenic> selectScenicListByPrice();

    Page<Scenic> selectPageByQuery(QueryVo queryVo);
}
