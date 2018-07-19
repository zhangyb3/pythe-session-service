package com.pythe.mapper;

import com.pythe.pojo.TblSalt;
import com.pythe.pojo.TblSaltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSaltMapper {
    int countByExample(TblSaltExample example);

    int deleteByExample(TblSaltExample example);

    int deleteByPrimaryKey(String id);

    int insert(TblSalt record);

    int insertSelective(TblSalt record);

    List<TblSalt> selectByExample(TblSaltExample example);

    TblSalt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TblSalt record, @Param("example") TblSaltExample example);

    int updateByExample(@Param("record") TblSalt record, @Param("example") TblSaltExample example);

    int updateByPrimaryKeySelective(TblSalt record);

    int updateByPrimaryKey(TblSalt record);
}