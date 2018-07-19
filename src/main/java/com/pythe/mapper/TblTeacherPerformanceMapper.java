package com.pythe.mapper;

import com.pythe.pojo.TblTeacherPerformance;
import com.pythe.pojo.TblTeacherPerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblTeacherPerformanceMapper {
    int countByExample(TblTeacherPerformanceExample example);

    int deleteByExample(TblTeacherPerformanceExample example);

    int deleteByPrimaryKey(Long teacherId);

    int insert(TblTeacherPerformance record);

    int insertSelective(TblTeacherPerformance record);

    List<TblTeacherPerformance> selectByExampleWithBLOBs(TblTeacherPerformanceExample example);

    List<TblTeacherPerformance> selectByExample(TblTeacherPerformanceExample example);

    TblTeacherPerformance selectByPrimaryKey(Long teacherId);

    int updateByExampleSelective(@Param("record") TblTeacherPerformance record, @Param("example") TblTeacherPerformanceExample example);

    int updateByExampleWithBLOBs(@Param("record") TblTeacherPerformance record, @Param("example") TblTeacherPerformanceExample example);

    int updateByExample(@Param("record") TblTeacherPerformance record, @Param("example") TblTeacherPerformanceExample example);

    int updateByPrimaryKeySelective(TblTeacherPerformance record);

    int updateByPrimaryKeyWithBLOBs(TblTeacherPerformance record);

    int updateByPrimaryKey(TblTeacherPerformance record);
}