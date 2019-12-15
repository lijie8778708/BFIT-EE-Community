package com.bfit.bfitee.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
