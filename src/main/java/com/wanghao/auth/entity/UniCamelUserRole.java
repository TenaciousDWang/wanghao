package com.wanghao.auth.entity;

import java.io.Serializable;

public class UniCamelUserRole implements Serializable {
    private String roleId;

    private String userId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}