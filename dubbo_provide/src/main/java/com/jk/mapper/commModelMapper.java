package com.jk.mapper;

import com.jk.model.commModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface commModelMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(commModel record);

    int insertSelective(commModel record);

    commModel selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(commModel record);

    int updateByPrimaryKey(commModel record);

    @Select("select * from t_commodity")
    List<commModel> ShangPinPanDian();
}