package com.wanghao.auth.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UniCamelRoleExample {
    protected String pk_name = "role_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UniCamelRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name = pk_name;
    }

    public String getPk_name() {
        return pk_name;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOrdIsNull() {
            addCriterion("ord is null");
            return (Criteria) this;
        }

        public Criteria andOrdIsNotNull() {
            addCriterion("ord is not null");
            return (Criteria) this;
        }

        public Criteria andOrdEqualTo(Integer value) {
            addCriterion("ord =", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotEqualTo(Integer value) {
            addCriterion("ord <>", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThan(Integer value) {
            addCriterion("ord >", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord >=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThan(Integer value) {
            addCriterion("ord <", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThanOrEqualTo(Integer value) {
            addCriterion("ord <=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdIn(List<Integer> values) {
            addCriterion("ord in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotIn(List<Integer> values) {
            addCriterion("ord not in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdBetween(Integer value1, Integer value2) {
            addCriterion("ord between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("ord not between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreatePersionIsNull() {
            addCriterion("create_persion is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersionIsNotNull() {
            addCriterion("create_persion is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersionEqualTo(String value) {
            addCriterion("create_persion =", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionNotEqualTo(String value) {
            addCriterion("create_persion <>", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionGreaterThan(String value) {
            addCriterion("create_persion >", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionGreaterThanOrEqualTo(String value) {
            addCriterion("create_persion >=", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionLessThan(String value) {
            addCriterion("create_persion <", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionLessThanOrEqualTo(String value) {
            addCriterion("create_persion <=", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionLike(String value) {
            addCriterion("create_persion like", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionNotLike(String value) {
            addCriterion("create_persion not like", value, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionIn(List<String> values) {
            addCriterion("create_persion in", values, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionNotIn(List<String> values) {
            addCriterion("create_persion not in", values, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionBetween(String value1, String value2) {
            addCriterion("create_persion between", value1, value2, "createPersion");
            return (Criteria) this;
        }

        public Criteria andCreatePersionNotBetween(String value1, String value2) {
            addCriterion("create_persion not between", value1, value2, "createPersion");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionIsNull() {
            addCriterion("update_persion is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionIsNotNull() {
            addCriterion("update_persion is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionEqualTo(String value) {
            addCriterion("update_persion =", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotEqualTo(String value) {
            addCriterion("update_persion <>", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionGreaterThan(String value) {
            addCriterion("update_persion >", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionGreaterThanOrEqualTo(String value) {
            addCriterion("update_persion >=", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLessThan(String value) {
            addCriterion("update_persion <", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLessThanOrEqualTo(String value) {
            addCriterion("update_persion <=", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLike(String value) {
            addCriterion("update_persion like", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotLike(String value) {
            addCriterion("update_persion not like", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionIn(List<String> values) {
            addCriterion("update_persion in", values, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotIn(List<String> values) {
            addCriterion("update_persion not in", values, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionBetween(String value1, String value2) {
            addCriterion("update_persion between", value1, value2, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotBetween(String value1, String value2) {
            addCriterion("update_persion not between", value1, value2, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarIsNull() {
            addCriterion("soft_phone_bar is null");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarIsNotNull() {
            addCriterion("soft_phone_bar is not null");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarEqualTo(String value) {
            addCriterion("soft_phone_bar =", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarNotEqualTo(String value) {
            addCriterion("soft_phone_bar <>", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarGreaterThan(String value) {
            addCriterion("soft_phone_bar >", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarGreaterThanOrEqualTo(String value) {
            addCriterion("soft_phone_bar >=", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarLessThan(String value) {
            addCriterion("soft_phone_bar <", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarLessThanOrEqualTo(String value) {
            addCriterion("soft_phone_bar <=", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarLike(String value) {
            addCriterion("soft_phone_bar like", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarNotLike(String value) {
            addCriterion("soft_phone_bar not like", value, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarIn(List<String> values) {
            addCriterion("soft_phone_bar in", values, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarNotIn(List<String> values) {
            addCriterion("soft_phone_bar not in", values, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarBetween(String value1, String value2) {
            addCriterion("soft_phone_bar between", value1, value2, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andSoftPhoneBarNotBetween(String value1, String value2) {
            addCriterion("soft_phone_bar not between", value1, value2, "softPhoneBar");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityIsNull() {
            addCriterion("im_list_authority is null");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityIsNotNull() {
            addCriterion("im_list_authority is not null");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityEqualTo(String value) {
            addCriterion("im_list_authority =", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityNotEqualTo(String value) {
            addCriterion("im_list_authority <>", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityGreaterThan(String value) {
            addCriterion("im_list_authority >", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("im_list_authority >=", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityLessThan(String value) {
            addCriterion("im_list_authority <", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityLessThanOrEqualTo(String value) {
            addCriterion("im_list_authority <=", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityLike(String value) {
            addCriterion("im_list_authority like", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityNotLike(String value) {
            addCriterion("im_list_authority not like", value, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityIn(List<String> values) {
            addCriterion("im_list_authority in", values, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityNotIn(List<String> values) {
            addCriterion("im_list_authority not in", values, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityBetween(String value1, String value2) {
            addCriterion("im_list_authority between", value1, value2, "imListAuthority");
            return (Criteria) this;
        }

        public Criteria andImListAuthorityNotBetween(String value1, String value2) {
            addCriterion("im_list_authority not between", value1, value2, "imListAuthority");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}