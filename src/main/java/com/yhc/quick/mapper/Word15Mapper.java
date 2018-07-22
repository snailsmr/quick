package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word15;
import com.yhc.quick.pojo.Word15Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word15Mapper {
    int countByExample(Word15Example example);

    int deleteByExample(Word15Example example);

    int insert(Word15 record);

    int insertSelective(Word15 record);

    List<Word15> selectByExample(Word15Example example);

    int updateByExampleSelective(@Param("record") Word15 record, @Param("example") Word15Example example);

    int updateByExample(@Param("record") Word15 record, @Param("example") Word15Example example);
}