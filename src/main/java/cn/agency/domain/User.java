package cn.agency.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

import lombok.Data;


@Document(collection = "user")
@Data
public class User implements Serializable {
    // id
    private String id;
    // 手机号
    private String mobile;
    // qq
    private String qq;
}
