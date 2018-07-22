package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word16;
import com.yhc.quick.pojo.Word16Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word16Mapper {
    int countByExample(Word16Example example);

    int deleteByExample(Word16Example example);

    int insert(Word16 record);

    int insertSelective(Word16 record);

    List<Word16> selectByExample(Word16Example example);

    int updateByExampleSelective(@Param("record") Word16 record, @Param("example") Word16Example example);

    int updateByExample(@Param("record") Word16 record, @Param("example") Word16Example example);
}