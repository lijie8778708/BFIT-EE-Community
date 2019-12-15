package com.bfit.bfitee.mapper;

import com.bfit.bfitee.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * create by jie
 */

@Mapper
public interface UserMapper {

    @Insert("insert into user (userName,account_id,token,gmt_create,gmt_modified, avatar_url) values (#{userName}, #{accountId}, #{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Long id);
}
