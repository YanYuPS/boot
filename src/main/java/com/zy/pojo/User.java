package com.zy.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="tb_user")
public class User {
    @Id //主键
    @KeySql(useGeneratedKeys = true) //主键自动回填
    private Long id;

    private String username;

}
