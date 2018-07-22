package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word14;
import com.yhc.quick.pojo.Word14Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word14Mapper {
    int countByExample(Word14Example example);

    int deleteByExample(Word14Example example);

    int insert(Word14 record);

    int insertSelective(Word14 record);

    List<Word14> selectByExample(Word14Example example);

    int updateByExampleSelective(@Param("record") Word14 record, @Param("example") Word14Example example);

    int updateByExample(@Param("record") Word14 record, @Param("example") Word14Example example);
}