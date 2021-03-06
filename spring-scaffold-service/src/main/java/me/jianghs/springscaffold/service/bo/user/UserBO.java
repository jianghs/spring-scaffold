package me.jianghs.springscaffold.service.bo.user;

import lombok.Data;

import java.util.Date;

/**
 * @className: UserBO
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/8/14 16:18
 * @version: 1.0
 */
@Data
public class UserBO {
    private Long id;

    private String userCode;

    private String name;

    private String mobile;

    private String sex;

    private String email;

    private Date date;

    private String loginCode;

    private Date loginDate;

}
