package com.jk.mapper;

import com.jk.model.countModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface countModelMapper {
    int deleteByPrimaryKey(Integer counterid);

    int insert(countModel record);

    int insertSelective(countModel record);

    countModel selectByPrimaryKey(Integer counterid);

    int updateByPrimaryKeySelective(countModel record);

    int updateByPrimaryKey(countModel record);

    @Select("select * from t_counter")
    List<countModel> querySheBei();

}