package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word13;
import com.yhc.quick.pojo.Word13Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word13Mapper {
    int countByExample(Word13Example example);

    int deleteByExample(Word13Example example);

    int insert(Word13 record);

    int insertSelective(Word13 record);

    List<Word13> selectByExample(Word13Example example);

    int updateByExampleSelective(@Param("record") Word13 record, @Param("example") Word13Example example);

    int updateByExample(@Param("record") Word13 record, @Param("example") Word13Example example);
}