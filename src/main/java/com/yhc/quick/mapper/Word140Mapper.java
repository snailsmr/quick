package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word140;
import com.yhc.quick.pojo.Word140Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word140Mapper {
    int countByExample(Word140Example example);

    int deleteByExample(Word140Example example);

    int insert(Word140 record);

    int insertSelective(Word140 record);

    List<Word140> selectByExample(Word140Example example);

    int updateByExampleSelective(@Param("record") Word140 record, @Param("example") Word140Example example);

    int updateByExample(@Param("record") Word140 record, @Param("example") Word140Example example);
}