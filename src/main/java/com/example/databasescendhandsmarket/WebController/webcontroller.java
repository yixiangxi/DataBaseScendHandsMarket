/**
 * 功能：
 * 作者：yixiangxi
 * 日期：2023/11/9 20:16
 **/
package com.example.databasescendhandsmarket.WebController;

import com.example.databasescendhandsmarket.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webcontroller {
    @RequestMapping("/hello")
    public Result hello() {
        return Result.success("Hello");
    }

}
