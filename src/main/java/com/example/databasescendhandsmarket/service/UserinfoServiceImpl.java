/**
 * 功能：
 * 作者：yixiangxi
 * 日期：2023/11/9 21:38
 **/
package com.example.databasescendhandsmarket.service;

import com.example.databasescendhandsmarket.entity.Userinfo;
import com.example.databasescendhandsmarket.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//将此接口注入到Spring容器中，让Spring来管理
public class UserinfoServiceImpl implements UserinfoService{
    @Autowired//将此对象注入到这个接口实现类中
    UserinfoMapper userinfoMapper;

    public void insertUser(Userinfo userinfo) {
        userinfoMapper.insertUserinfo(userinfo);
    }
}
