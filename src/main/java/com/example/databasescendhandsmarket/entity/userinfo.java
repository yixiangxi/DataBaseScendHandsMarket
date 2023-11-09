/**
 * 功能：
 * 作者：yixiangxi
 * 日期：2023/11/9 21:31
 **/
package com.example.databasescendhandsmarket.entity;

import lombok.Data;

@Data
public class userinfo  {
    private String user_id;
    private String user_name;
    private String user_password;
    private String user_phone;
    private String user_email;
    private String user_type;
}
