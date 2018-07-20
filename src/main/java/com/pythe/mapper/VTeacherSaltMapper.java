package com.pythe.mapper;

import com.pythe.pojo.VTeacherSalt;
import com.pythe.pojo.VTeacherSaltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VTeacherSaltMapper {
    int countByExample(VTeacherSaltExample example);

    int deleteByExample(VTeacherSaltExample example);

    int insert(VTeacherSalt record);

    int insertSelective(VTeacherSalt record);

    List<VTeacherSalt> selectByExampleWithBLOBs(VTeacherSaltExample example);

    List<VTeacherSalt> selectByExample(VTeacherSaltExample example);

    int updateByExampleSelective(@Param("record") VTeacherSalt record, @Param("example") VTeacherSaltExample example);

    int updateByExampleWithBLOBs(@Param("record") VTeacherSalt record, @Param("example") VTeacherSaltExample example);

    int updateByExample(@Param("record") VTeacherSalt record, @Param("example") VTeacherSaltExample example);
}