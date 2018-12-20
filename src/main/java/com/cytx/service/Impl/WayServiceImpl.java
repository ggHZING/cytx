package com.cytx.service.Impl;

import com.cytx.dao.WayMapper;
import com.cytx.pojo.*;
import com.cytx.service.WayService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WayServiceImpl implements WayService {
    @Autowired
    WayMapper wayMapper;

    /**
     * 后台获取分页数据
     * @param vo
     * @return
     */
    @Override
    public Page<Way> selectPageByQueryVo(QueryVo vo) {
        Page<Way> page = new Page<Way>();
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
            WayExample example = new WayExample();
            int count =(int) wayMapper.countByExample(example);
            page.setTotal(count);

            WayExample example1 = new WayExample();
            WayExample.Criteria criteria = example1.createCriteria();
            criteria.andWayNameLike("%"+vo.getName()+"%");
            example1.setOrderByClause("way_id asc");
            example1.setStart(vo.getStartRow());
            example1.setCount(vo.getSize());
            List<Way> list = wayMapper.selectByExample(example1);

            page.setRows(list);
        }
        return page;
    }

    /**
     * 管理员添加攻略
     * @param way
     */
    @Override
    public void addWay(Way way) {
        wayMapper.insert(way);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        wayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Way getWayById(Integer id) {
        Way way = wayMapper.selectByPrimaryKey(id);
        return way;
    }

    @Override
    public void updateWay(Way way) {
        wayMapper.updateByPrimaryKey(way);
    }

    @Override
    public List<Way> selectWayList() {
        WayExample example = new WayExample();
        example.setOrderByClause("way_id desc");
        example.setStart(0);
        example.setCount(1000);
        List<Way> way = wayMapper.selectByExample(example);
        return way;
    }

    @Override
    public Page<Way> selectPageByQuery(QueryVo vo) {
        Page<Way> page = new Page<Way>();
        //每页数
        page.setSize(3);
        vo.setSize(3);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }


            //总条数
            WayExample example = new WayExample();
            int count =(int) wayMapper.countByExample(example);
            page.setTotal(count);

            WayExample example1 = new WayExample();
            example1.setOrderByClause("way_id asc");
            example1.setStart(vo.getStartRow());
            example1.setCount(vo.getSize());
            List<Way> list = wayMapper.selectByExample(example1);

            page.setRows(list);
        }
        return page;
        }


}
