package com.example.databasescendhandsmarket.mapper;

import com.example.databasescendhandsmarket.entity.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper//
public interface UserinfoMapper {

    @Insert("insert into `userinfo`(UserID,Username,Password,Email,Phone,UserType)"+
            "values (#{UserID}, #{Username}, #{Password}, #{Email}, #{Phone}, #{UserType})")
    void insertUserinfo(Userinfo userinfo);

    @Update("update userinfo set user_password=#{user_password},user_phone=#{user_phone}," +
            "user_email=#{user_email},user_type=#{user_type} where user_id=#{user_id}")
    void updateUserinfo(Userinfo userinfo);

    @Delete("delete from userinfo where user_id=#{user_id}")
    void deleteUserinfo(String user_id);

    @Select("select * from userinfo where user_id=#{user_id} order by user_id desc")
    List<Userinfo> selectUserinfo(String user_id);


}
