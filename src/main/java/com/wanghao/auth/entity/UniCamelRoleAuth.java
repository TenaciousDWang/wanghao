package com.wanghao.auth.entity;

import java.io.Serializable;

public class UniCamelRoleAuth implements Serializable {
    private String roleId;

    private String resourcesId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(String resourcesId) {
        this.resourcesId = resourcesId;
    }
}