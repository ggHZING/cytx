package com.cytx.dao;

import com.cytx.pojo.Way;
import com.cytx.pojo.WayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WayMapper {
    long countByExample(WayExample example);

    int deleteByExample(WayExample example);

    int deleteByPrimaryKey(Integer wayId);

    int insert(Way record);

    int insertSelective(Way record);

    List<Way> selectByExample(WayExample example);

    Way selectByPrimaryKey(Integer wayId);

    int updateByExampleSelective(@Param("record") Way record, @Param("example") WayExample example);

    int updateByExample(@Param("record") Way record, @Param("example") WayExample example);

    int updateByPrimaryKeySelective(Way record);

    int updateByPrimaryKey(Way record);
}