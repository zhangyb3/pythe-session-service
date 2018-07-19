package com.pythe.mapper;

import com.pythe.pojo.TblVerification;
import com.pythe.pojo.TblVerificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;


public interface TblVerificationMapper {
    int countByExample(TblVerificationExample example);

    int deleteByExample(TblVerificationExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(TblVerification record);

    int insertSelective(TblVerification record);

    List<TblVerification> selectByExample(TblVerificationExample example);

    TblVerification selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") TblVerification record, @Param("example") TblVerificationExample example);

    int updateByExample(@Param("record") TblVerification record, @Param("example") TblVerificationExample example);

    int updateByPrimaryKeySelective(TblVerification record);

    int updateByPrimaryKey(TblVerification record);
}