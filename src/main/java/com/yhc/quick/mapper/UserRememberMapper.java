package com.yhc.quick.mapper;

import com.yhc.quick.pojo.UserRemember;
import com.yhc.quick.pojo.UserRememberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRememberMapper {
    int countByExample(UserRememberExample example);

    int deleteByExample(UserRememberExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserRemember record);

    int insertSelective(UserRemember record);

    List<UserRemember> selectByExample(UserRememberExample example);

    UserRemember selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserRemember record, @Param("example") UserRememberExample example);

    int updateByExample(@Param("record") UserRemember record, @Param("example") UserRememberExample example);

    int updateByPrimaryKeySelective(UserRemember record);

    int updateByPrimaryKey(UserRemember record);
}