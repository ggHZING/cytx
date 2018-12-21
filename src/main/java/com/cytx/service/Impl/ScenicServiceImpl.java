package com.cytx.service.Impl;

import com.cytx.dao.ScenicMapper;
import com.cytx.pojo.*;
import com.cytx.service.ScenicService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicServiceImpl implements ScenicService {
    @Autowired
    ScenicMapper scenicMapper;

    /**
     * 后台获取分页数据
     * @param vo
     * @return
     */
    @Override
    public Page<Scenic> selectPageByQueryVo(QueryVo vo) {
        Page<Scenic> page = new Page<Scenic>();
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
            ScenicExample example = new ScenicExample();
            int count =(int) scenicMapper.countByExample(example);
            page.setTotal(count);

            ScenicExample example1 = new ScenicExample();
            ScenicExample.Criteria criteria = example1.createCriteria();
            criteria.andScenicNameLike("%"+vo.getName()+"%");
            example1.setOrderByClause("scenic_id asc");
            example1.setStart(vo.getStartRow());
            example1.setCount(vo.getSize());
            List<Scenic> list = scenicMapper.selectByExample(example1);

            page.setRows(list);
        }
        return page;
    }

    @Override
    public void deleteById(Integer id) {
        scenicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addScenic(Scenic scenic) {
        scenicMapper.insert(scenic);
    }

    @Override
    public Scenic getScenicById(Integer id) {
        Scenic scenic = scenicMapper.selectByPrimaryKey(id);
        return scenic;
    }

    @Override
    public void updateScenic(Scenic scenic) {
        scenicMapper.updateByPrimaryKey(scenic);
    }

    @Override
    public List<Scenic> selectScenicList() {
        ScenicExample example = new ScenicExample();
        example.setOrderByClause("scenic_id desc");
        example.setStart(0);
        example.setCount(1000);
        List<Scenic> scenics = scenicMapper.selectByExample(example);
        return scenics;
    }

    @Override
    public List<Scenic> selectScenicListAsc() {
        ScenicExample example = new ScenicExample();
        example.setOrderByClause("scenic_id asc");
        example.setStart(0);
        example.setCount(1000);
        List<Scenic> scenics = scenicMapper.selectByExample(example);
        return scenics;
    }

    @Override
    public List<Scenic> selectScenicListByPrice() {
        ScenicExample example = new ScenicExample();
        example.setOrderByClause("scenic_charge asc");
        example.setStart(0);
        example.setCount(1000);
        List<Scenic> scenics = scenicMapper.selectByExample(example);
        return scenics;
    }

    @Override
    public Page<Scenic> selectPageByQuery(QueryVo vo) {
        Page<Scenic> page = new Page<Scenic>();
        //每页数
        page.setSize(4);
        vo.setSize(4);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }


            //总条数
            ScenicExample example = new ScenicExample();
            int count =(int) scenicMapper.countByExample(example);
            page.setTotal(count);

            ScenicExample example1 = new ScenicExample();
            example1.setOrderByClause("scenic_id asc");
            example1.setStart(vo.getStartRow());
            example1.setCount(vo.getSize());
            List<Scenic> list = scenicMapper.selectByExample(example1);

            page.setRows(list);
        }
        return page;
    }
}
