package com.jk.mapper;

import com.jk.model.FacModel;
import com.jk.model.countModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FacModelMapper {
    int deleteByPrimaryKey(Integer facilityid);

    int insert(FacModel record);

    int insertSelective(FacModel record);

    FacModel selectByPrimaryKey(Integer facilityid);

    int updateByPrimaryKeySelective(FacModel record);

    int updateByPrimaryKey(FacModel record);

    @Select("select * from t_facility")
    List<FacModel> toFacility();

    @Insert("INSERT INTO t_facility(facilityname,facilitybaoxiu,facilitybeizhu) VALUES(#{facilityname},#{facilitybaoxiu},#{facilitybeizhu})")
    void addfacility(countModel countmodel);
}