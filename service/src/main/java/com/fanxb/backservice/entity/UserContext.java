package com.fanxb.backservice.entity;

import lombok.Data;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/1 14:26
 */
@Data
public class UserContext {

    private User user;
    private String jwt;
    private String sessionId;
}
