package com.yhc.quick.mapper;

import com.yhc.quick.pojo.Word141;
import com.yhc.quick.pojo.Word141Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Word141Mapper {
    int countByExample(Word141Example example);

    int deleteByExample(Word141Example example);

    int insert(Word141 record);

    int insertSelective(Word141 record);

    List<Word141> selectByExample(Word141Example example);

    int updateByExampleSelective(@Param("record") Word141 record, @Param("example") Word141Example example);

    int updateByExample(@Param("record") Word141 record, @Param("example") Word141Example example);
}