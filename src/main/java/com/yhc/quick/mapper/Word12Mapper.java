package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word12;
import com.yhc.quick.pojo.Word12Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word12Mapper {
    int countByExample(Word12Example example);

    int deleteByExample(Word12Example example);

    int insert(Word12 record);

    int insertSelective(Word12 record);

    List<Word12> selectByExample(Word12Example example);

    int updateByExampleSelective(@Param("record") Word12 record, @Param("example") Word12Example example);

    int updateByExample(@Param("record") Word12 record, @Param("example") Word12Example example);
}