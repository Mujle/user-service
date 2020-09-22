package com.example.userservice.vo;

import java.util.Set;

public class UserVO {

    private String userName;

    private String password;

    private Set<RoleVO> roles;

    public UserVO() {
    }

    public UserVO(String userName, String password, Set<RoleVO> roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleVO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleVO> roles) {
        this.roles = roles;
    }
}
