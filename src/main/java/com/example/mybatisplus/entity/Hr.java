package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hr")
public class Hr {
    private Integer id;
    private String name;
    private String phone;
    private String telephone;
    private String address;
    private Integer enabled;
    private String username;
    private String password;
    private String userface;
    private String remark;

}
