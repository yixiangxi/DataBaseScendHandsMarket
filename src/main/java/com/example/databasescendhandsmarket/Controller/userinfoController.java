/**
 * 功能：与前端交互，调用数据.数据由前端传递到controller层，controller层调用service层，service层调用mapper层
 * 作者：yixiangxi
 * 日期：2023/11/9 21:33
 **/
package com.example.databasescendhandsmarket.Controller;

import com.example.databasescendhandsmarket.common.Result;
import com.example.databasescendhandsmarket.entity.Userinfo;
import com.example.databasescendhandsmarket.service.UserinfoServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
public class userinfoController {
    //注入Service，通过次方法获取UserinfoServiceImpl对象
    @Autowired
    UserinfoServiceImpl userinfoService;

    @PostMapping("/addUserinfo")
    public Result addUserinfo(@RequestBody Userinfo userinfo){
        //原本的形参列表(String username, String userpassword, String userphone, String useremail,String usertype,String userid)
        userinfoService.insertUser(userinfo);
        return Result.success("添加数据成功");
    }

}
