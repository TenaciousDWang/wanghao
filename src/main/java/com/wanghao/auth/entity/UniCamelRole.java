package com.wanghao.auth.entity;

import java.io.Serializable;
import java.util.Date;

public class UniCamelRole implements Serializable {
    private String roleId;

    private String roleName;

    private String memo;

    private Integer ord;

    private Date createDate;

    private String createPersion;

    private Date updateDate;

    private String updatePersion;

    private String softPhoneBar;

    private String imListAuthority;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatePersion() {
        return createPersion;
    }

    public void setCreatePersion(String createPersion) {
        this.createPersion = createPersion;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdatePersion() {
        return updatePersion;
    }

    public void setUpdatePersion(String updatePersion) {
        this.updatePersion = updatePersion;
    }

    public String getSoftPhoneBar() {
        return softPhoneBar;
    }

    public void setSoftPhoneBar(String softPhoneBar) {
        this.softPhoneBar = softPhoneBar;
    }

    public String getImListAuthority() {
        return imListAuthority;
    }

    public void setImListAuthority(String imListAuthority) {
        this.imListAuthority = imListAuthority;
    }
}