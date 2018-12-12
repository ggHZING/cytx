package com.cytx.dao;

import com.cytx.pojo.Way;
import com.cytx.pojo.WayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WayMapper {
    long countByExample(WayExample example);

    int deleteByExample(WayExample example);

    int deleteByPrimaryKey(Integer wayId);

    int insert(Way record);

    int insertSelective(Way record);

    List<Way> selectByExampleWithBLOBs(WayExample example);

    List<Way> selectByExample(WayExample example);

    Way selectByPrimaryKey(Integer wayId);

    int updateByExampleSelective(@Param("record") Way record, @Param("example") WayExample example);

    int updateByExampleWithBLOBs(@Param("record") Way record, @Param("example") WayExample example);

    int updateByExample(@Param("record") Way record, @Param("example") WayExample example);

    int updateByPrimaryKeySelective(Way record);

    int updateByPrimaryKeyWithBLOBs(Way record);

    int updateByPrimaryKey(Way record);
}