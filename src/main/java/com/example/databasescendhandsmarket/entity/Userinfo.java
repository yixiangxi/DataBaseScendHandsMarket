/**
 * 功能：
 * 作者：yixiangxi
 * 日期：2023/11/9 21:31
 **/
package com.example.databasescendhandsmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Userinfo {
    private String UserID;
    private String Username;
    private String Password;
    private String Email;
    private String Phone;
    private String UserType;
}
