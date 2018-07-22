package com.yhc.quick.mapper;

import com.yhc.quick.pojo.UserUnremember;
import com.yhc.quick.pojo.UserUnrememberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserUnrememberMapper {
    int countByExample(UserUnrememberExample example);

    int deleteByExample(UserUnrememberExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserUnremember record);

    int insertSelective(UserUnremember record);

    List<UserUnremember> selectByExample(UserUnrememberExample example);

    UserUnremember selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserUnremember record, @Param("example") UserUnrememberExample example);

    int updateByExample(@Param("record") UserUnremember record, @Param("example") UserUnrememberExample example);

    int updateByPrimaryKeySelective(UserUnremember record);

    int updateByPrimaryKey(UserUnremember record);
}