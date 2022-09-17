package com.project.ShoppingMall.domain;


import lombok.Data;


@Data
public class Member {

    private Long    id;
    private String  eMail;
    private String  password;
    private String  name;
    private String  location;

    public Member(String eMail, String password, String name, String location) {
        this.eMail = eMail;
        this.password = password;
        this.name = name;
        this.location = location;
    }
}


