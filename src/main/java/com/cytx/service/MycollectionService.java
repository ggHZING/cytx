package com.cytx.service;

import com.cytx.pojo.Mycollection;
import com.cytx.pojo.QueryVo;
import com.cytx.utils.Page;

import java.util.List;

public interface MycollectionService {
    void addCollection(Mycollection mycollection);

    Page<Mycollection> selectCollectionPage(QueryVo vo);
}
