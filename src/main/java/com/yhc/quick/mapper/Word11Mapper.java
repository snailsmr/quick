package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word11;
import com.yhc.quick.pojo.Word11Example;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Word11Mapper {
    int countByExample(Word11Example example);

    int deleteByExample(Word11Example example);

    int insert(Word11 record);

    int insertSelective(Word11 record);

    List<Word11> selectByExample(Word11Example example);

    int updateByExampleSelective(@Param("record") Word11 record, @Param("example") Word11Example example);

    int updateByExample(@Param("record") Word11 record, @Param("example") Word11Example example);

    @Select("select * from word_11 limit #{start},#{end}")
    List<Word11> selectWords(@Param("start") Integer start, @Param("end")Integer end);
}