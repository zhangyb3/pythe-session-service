package com.pythe.mapper;

import com.pythe.pojo.VTeacherPerformance;
import com.pythe.pojo.VTeacherPerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VTeacherPerformanceMapper {
    int countByExample(VTeacherPerformanceExample example);

    int deleteByExample(VTeacherPerformanceExample example);

    int insert(VTeacherPerformance record);

    int insertSelective(VTeacherPerformance record);

    List<VTeacherPerformance> selectByExampleWithBLOBs(VTeacherPerformanceExample example);

    List<VTeacherPerformance> selectByExample(VTeacherPerformanceExample example);

    int updateByExampleSelective(@Param("record") VTeacherPerformance record, @Param("example") VTeacherPerformanceExample example);

    int updateByExampleWithBLOBs(@Param("record") VTeacherPerformance record, @Param("example") VTeacherPerformanceExample example);

    int updateByExample(@Param("record") VTeacherPerformance record, @Param("example") VTeacherPerformanceExample example);
}