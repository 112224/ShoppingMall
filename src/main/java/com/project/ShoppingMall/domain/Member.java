package com.project.ShoppingMall.domain;


import lombok.Data;


@Data
public class Member {

    private Long    id;
    private String  eMail;
    private String  password;
    private String  name;
    private String  location;

}


