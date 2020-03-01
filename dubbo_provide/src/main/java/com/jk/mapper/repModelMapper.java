package com.jk.mapper;

import com.jk.model.repModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface repModelMapper {
    int deleteByPrimaryKey(Integer repertoryid);

    int insert(repModel record);

    int insertSelective(repModel record);

    repModel selectByPrimaryKey(Integer repertoryid);

    int updateByPrimaryKeySelective(repModel record);

    int updateByPrimaryKey(repModel record);

    @Select("select * from t_repertory")
    List<repModel> queryRuKu();
}