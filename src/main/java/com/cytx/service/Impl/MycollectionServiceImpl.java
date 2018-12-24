package com.cytx.service.Impl;

import com.cytx.dao.MycollectionMapper;
import com.cytx.pojo.Mycollection;
import com.cytx.pojo.QueryVo;
import com.cytx.service.MycollectionService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MycollectionServiceImpl implements MycollectionService {
    @Autowired
    MycollectionMapper mycollectionMapper;

    @Override
    public void addCollection(Mycollection mycollection) {
        mycollectionMapper.addCollection(mycollection);
    }

    @Override
    public Page<Mycollection> selectCollectionPage(QueryVo vo) {
        Page<Mycollection> page = new Page<Mycollection>();
        //每页数
        page.setSize(1);
        vo.setSize(1);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }


            //总条数
            page.setTotal(mycollectionMapper.postCountByQueryVo(vo));
            page.setRows(mycollectionMapper.selectCollection(vo));

        }
        return page;

    }
}
