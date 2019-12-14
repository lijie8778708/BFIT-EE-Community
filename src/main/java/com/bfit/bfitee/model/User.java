package com.bfit.bfitee.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
