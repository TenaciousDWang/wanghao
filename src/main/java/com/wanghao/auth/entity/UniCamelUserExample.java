package com.wanghao.auth.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UniCamelUserExample {
    protected String pk_name = "user_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UniCamelUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmallIsNull() {
            addCriterion("emall is null");
            return (Criteria) this;
        }

        public Criteria andEmallIsNotNull() {
            addCriterion("emall is not null");
            return (Criteria) this;
        }

        public Criteria andEmallEqualTo(String value) {
            addCriterion("emall =", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallNotEqualTo(String value) {
            addCriterion("emall <>", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallGreaterThan(String value) {
            addCriterion("emall >", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallGreaterThanOrEqualTo(String value) {
            addCriterion("emall >=", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallLessThan(String value) {
            addCriterion("emall <", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallLessThanOrEqualTo(String value) {
            addCriterion("emall <=", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallLike(String value) {
            addCriterion("emall like", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallNotLike(String value) {
            addCriterion("emall not like", value, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallIn(List<String> values) {
            addCriterion("emall in", values, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallNotIn(List<String> values) {
            addCriterion("emall not in", values, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallBetween(String value1, String value2) {
            addCriterion("emall between", value1, value2, "emall");
            return (Criteria) this;
        }

        public Criteria andEmallNotBetween(String value1, String value2) {
            addCriterion("emall not between", value1, value2, "emall");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andPasswordDateIsNull() {
            addCriterion("password_date is null");
            return (Criteria) this;
        }

        public Criteria andPasswordDateIsNotNull() {
            addCriterion("password_date is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordDateEqualTo(Date value) {
            addCriterion("password_date =", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateNotEqualTo(Date value) {
            addCriterion("password_date <>", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateGreaterThan(Date value) {
            addCriterion("password_date >", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("password_date >=", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateLessThan(Date value) {
            addCriterion("password_date <", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateLessThanOrEqualTo(Date value) {
            addCriterion("password_date <=", value, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateIn(List<Date> values) {
            addCriterion("password_date in", values, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateNotIn(List<Date> values) {
            addCriterion("password_date not in", values, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateBetween(Date value1, Date value2) {
            addCriterion("password_date between", value1, value2, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andPasswordDateNotBetween(Date value1, Date value2) {
            addCriterion("password_date not between", value1, value2, "passwordDate");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNull() {
            addCriterion("user_position is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNotNull() {
            addCriterion("user_position is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionEqualTo(String value) {
            addCriterion("user_position =", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotEqualTo(String value) {
            addCriterion("user_position <>", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThan(String value) {
            addCriterion("user_position >", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThanOrEqualTo(String value) {
            addCriterion("user_position >=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThan(String value) {
            addCriterion("user_position <", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThanOrEqualTo(String value) {
            addCriterion("user_position <=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLike(String value) {
            addCriterion("user_position like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotLike(String value) {
            addCriterion("user_position not like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionIn(List<String> values) {
            addCriterion("user_position in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotIn(List<String> values) {
            addCriterion("user_position not in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionBetween(String value1, String value2) {
            addCriterion("user_position between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotBetween(String value1, String value2) {
            addCriterion("user_position not between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
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

        public Criteria andLockDateIsNull() {
            addCriterion("lock_date is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("lock_date is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("lock_date =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("lock_date <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("lock_date >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lock_date >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("lock_date <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("lock_date <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("lock_date in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("lock_date not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("lock_date between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("lock_date not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesIsNull() {
            addCriterion("lock_login_times is null");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesIsNotNull() {
            addCriterion("lock_login_times is not null");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesEqualTo(Integer value) {
            addCriterion("lock_login_times =", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesNotEqualTo(Integer value) {
            addCriterion("lock_login_times <>", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesGreaterThan(Integer value) {
            addCriterion("lock_login_times >", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_login_times >=", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesLessThan(Integer value) {
            addCriterion("lock_login_times <", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesLessThanOrEqualTo(Integer value) {
            addCriterion("lock_login_times <=", value, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesIn(List<Integer> values) {
            addCriterion("lock_login_times in", values, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesNotIn(List<Integer> values) {
            addCriterion("lock_login_times not in", values, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesBetween(Integer value1, Integer value2) {
            addCriterion("lock_login_times between", value1, value2, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andLockLoginTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_login_times not between", value1, value2, "lockLoginTimes");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNull() {
            addCriterion("pwd_update_date is null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNotNull() {
            addCriterion("pwd_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateEqualTo(Date value) {
            addCriterion("pwd_update_date =", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotEqualTo(Date value) {
            addCriterion("pwd_update_date <>", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThan(Date value) {
            addCriterion("pwd_update_date >", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pwd_update_date >=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThan(Date value) {
            addCriterion("pwd_update_date <", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("pwd_update_date <=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIn(List<Date> values) {
            addCriterion("pwd_update_date in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotIn(List<Date> values) {
            addCriterion("pwd_update_date not in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateBetween(Date value1, Date value2) {
            addCriterion("pwd_update_date between", value1, value2, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("pwd_update_date not between", value1, value2, "pwdUpdateDate");
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

        public Criteria andSkinIsNull() {
            addCriterion("skin is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("skin is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("skin =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("skin <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("skin >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("skin >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("skin <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("skin <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("skin like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("skin not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("skin in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("skin not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("skin between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("skin not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumIsNull() {
            addCriterion("tel_agent_num is null");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumIsNotNull() {
            addCriterion("tel_agent_num is not null");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumEqualTo(String value) {
            addCriterion("tel_agent_num =", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumNotEqualTo(String value) {
            addCriterion("tel_agent_num <>", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumGreaterThan(String value) {
            addCriterion("tel_agent_num >", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumGreaterThanOrEqualTo(String value) {
            addCriterion("tel_agent_num >=", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumLessThan(String value) {
            addCriterion("tel_agent_num <", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumLessThanOrEqualTo(String value) {
            addCriterion("tel_agent_num <=", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumLike(String value) {
            addCriterion("tel_agent_num like", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumNotLike(String value) {
            addCriterion("tel_agent_num not like", value, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumIn(List<String> values) {
            addCriterion("tel_agent_num in", values, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumNotIn(List<String> values) {
            addCriterion("tel_agent_num not in", values, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumBetween(String value1, String value2) {
            addCriterion("tel_agent_num between", value1, value2, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andTelAgentNumNotBetween(String value1, String value2) {
            addCriterion("tel_agent_num not between", value1, value2, "telAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumIsNull() {
            addCriterion("im_agent_num is null");
            return (Criteria) this;
        }

        public Criteria andImAgentNumIsNotNull() {
            addCriterion("im_agent_num is not null");
            return (Criteria) this;
        }

        public Criteria andImAgentNumEqualTo(String value) {
            addCriterion("im_agent_num =", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumNotEqualTo(String value) {
            addCriterion("im_agent_num <>", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumGreaterThan(String value) {
            addCriterion("im_agent_num >", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumGreaterThanOrEqualTo(String value) {
            addCriterion("im_agent_num >=", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumLessThan(String value) {
            addCriterion("im_agent_num <", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumLessThanOrEqualTo(String value) {
            addCriterion("im_agent_num <=", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumLike(String value) {
            addCriterion("im_agent_num like", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumNotLike(String value) {
            addCriterion("im_agent_num not like", value, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumIn(List<String> values) {
            addCriterion("im_agent_num in", values, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumNotIn(List<String> values) {
            addCriterion("im_agent_num not in", values, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumBetween(String value1, String value2) {
            addCriterion("im_agent_num between", value1, value2, "imAgentNum");
            return (Criteria) this;
        }

        public Criteria andImAgentNumNotBetween(String value1, String value2) {
            addCriterion("im_agent_num not between", value1, value2, "imAgentNum");
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