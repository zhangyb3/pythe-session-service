package com.pythe.mapper;

import com.pythe.pojo.TblTeacherAccount;
import com.pythe.pojo.TblTeacherAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblTeacherAccountMapper {
    int countByExample(TblTeacherAccountExample example);

    int deleteByExample(TblTeacherAccountExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TblTeacherAccount record);

    int insertSelective(TblTeacherAccount record);

    List<TblTeacherAccount> selectByExample(TblTeacherAccountExample example);

    TblTeacherAccount selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TblTeacherAccount record, @Param("example") TblTeacherAccountExample example);

    int updateByExample(@Param("record") TblTeacherAccount record, @Param("example") TblTeacherAccountExample example);

    int updateByPrimaryKeySelective(TblTeacherAccount record);

    int updateByPrimaryKey(TblTeacherAccount record);
}