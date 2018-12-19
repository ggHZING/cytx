package com.cytx.service.Impl;

import com.cytx.dao.ApplicationMapper;
import com.cytx.pojo.Application;
import com.cytx.pojo.QueryVo;
import com.cytx.service.ApplicationService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationMapper applicationMapper;

    @Override
    public Page<Application> selectApplicationPageByQueryVo(QueryVo vo) {
        Page<Application> page = new Page<Application>();
        //每页数
        page.setSize(5);
        vo.setSize(5);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }
            if(null != vo.getName() && !"".equals(vo.getName().trim())){
                vo.setName(vo.getName().trim());
            }

            //总条数
            page.setTotal(applicationMapper.postCountByQueryVo(vo));
            page.setRows(applicationMapper.selectPostListByQueryVo(vo));
        }
        return page;
    }

    @Override
    public void pass(Integer id) {
        applicationMapper.pass(id);
    }

    @Override
    public void fail(Integer id) {
        applicationMapper.fail(id);
    }
}
