package com.wanghao.auth.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UniCamelResourcesExample {
    protected String pk_name = "resources_id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UniCamelResourcesExample() {
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

        public Criteria andResourcesIdIsNull() {
            addCriterion("resources_id is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIsNotNull() {
            addCriterion("resources_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdEqualTo(String value) {
            addCriterion("resources_id =", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotEqualTo(String value) {
            addCriterion("resources_id <>", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThan(String value) {
            addCriterion("resources_id >", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThanOrEqualTo(String value) {
            addCriterion("resources_id >=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThan(String value) {
            addCriterion("resources_id <", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThanOrEqualTo(String value) {
            addCriterion("resources_id <=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLike(String value) {
            addCriterion("resources_id like", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotLike(String value) {
            addCriterion("resources_id not like", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIn(List<String> values) {
            addCriterion("resources_id in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotIn(List<String> values) {
            addCriterion("resources_id not in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdBetween(String value1, String value2) {
            addCriterion("resources_id between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotBetween(String value1, String value2) {
            addCriterion("resources_id not between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdIsNull() {
            addCriterion("app_system_id is null");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdIsNotNull() {
            addCriterion("app_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdEqualTo(String value) {
            addCriterion("app_system_id =", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdNotEqualTo(String value) {
            addCriterion("app_system_id <>", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdGreaterThan(String value) {
            addCriterion("app_system_id >", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_system_id >=", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdLessThan(String value) {
            addCriterion("app_system_id <", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdLessThanOrEqualTo(String value) {
            addCriterion("app_system_id <=", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdLike(String value) {
            addCriterion("app_system_id like", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdNotLike(String value) {
            addCriterion("app_system_id not like", value, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdIn(List<String> values) {
            addCriterion("app_system_id in", values, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdNotIn(List<String> values) {
            addCriterion("app_system_id not in", values, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdBetween(String value1, String value2) {
            addCriterion("app_system_id between", value1, value2, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andAppSystemIdNotBetween(String value1, String value2) {
            addCriterion("app_system_id not between", value1, value2, "appSystemId");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeIsNull() {
            addCriterion("resources_type is null");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeIsNotNull() {
            addCriterion("resources_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeEqualTo(String value) {
            addCriterion("resources_type =", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeNotEqualTo(String value) {
            addCriterion("resources_type <>", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeGreaterThan(String value) {
            addCriterion("resources_type >", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resources_type >=", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeLessThan(String value) {
            addCriterion("resources_type <", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeLessThanOrEqualTo(String value) {
            addCriterion("resources_type <=", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeLike(String value) {
            addCriterion("resources_type like", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeNotLike(String value) {
            addCriterion("resources_type not like", value, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeIn(List<String> values) {
            addCriterion("resources_type in", values, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeNotIn(List<String> values) {
            addCriterion("resources_type not in", values, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeBetween(String value1, String value2) {
            addCriterion("resources_type between", value1, value2, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andResourcesTypeNotBetween(String value1, String value2) {
            addCriterion("resources_type not between", value1, value2, "resourcesType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(String value) {
            addCriterion("open_type =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(String value) {
            addCriterion("open_type <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(String value) {
            addCriterion("open_type >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("open_type >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(String value) {
            addCriterion("open_type <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(String value) {
            addCriterion("open_type <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLike(String value) {
            addCriterion("open_type like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotLike(String value) {
            addCriterion("open_type not like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<String> values) {
            addCriterion("open_type in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<String> values) {
            addCriterion("open_type not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(String value1, String value2) {
            addCriterion("open_type between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(String value1, String value2) {
            addCriterion("open_type not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNull() {
            addCriterion("resources_name is null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNotNull() {
            addCriterion("resources_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameEqualTo(String value) {
            addCriterion("resources_name =", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotEqualTo(String value) {
            addCriterion("resources_name <>", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThan(String value) {
            addCriterion("resources_name >", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThanOrEqualTo(String value) {
            addCriterion("resources_name >=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThan(String value) {
            addCriterion("resources_name <", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThanOrEqualTo(String value) {
            addCriterion("resources_name <=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLike(String value) {
            addCriterion("resources_name like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotLike(String value) {
            addCriterion("resources_name not like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIn(List<String> values) {
            addCriterion("resources_name in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotIn(List<String> values) {
            addCriterion("resources_name not in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameBetween(String value1, String value2) {
            addCriterion("resources_name between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotBetween(String value1, String value2) {
            addCriterion("resources_name not between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andResourcesIconIsNull() {
            addCriterion("resources_icon is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIconIsNotNull() {
            addCriterion("resources_icon is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesIconEqualTo(String value) {
            addCriterion("resources_icon =", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconNotEqualTo(String value) {
            addCriterion("resources_icon <>", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconGreaterThan(String value) {
            addCriterion("resources_icon >", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconGreaterThanOrEqualTo(String value) {
            addCriterion("resources_icon >=", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconLessThan(String value) {
            addCriterion("resources_icon <", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconLessThanOrEqualTo(String value) {
            addCriterion("resources_icon <=", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconLike(String value) {
            addCriterion("resources_icon like", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconNotLike(String value) {
            addCriterion("resources_icon not like", value, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconIn(List<String> values) {
            addCriterion("resources_icon in", values, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconNotIn(List<String> values) {
            addCriterion("resources_icon not in", values, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconBetween(String value1, String value2) {
            addCriterion("resources_icon between", value1, value2, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andResourcesIconNotBetween(String value1, String value2) {
            addCriterion("resources_icon not between", value1, value2, "resourcesIcon");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
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

        public Criteria andPathIsNull() {
            addCriterion("`path` is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("`path` is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("`path` =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("`path` <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("`path` >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("`path` >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("`path` <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("`path` <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("`path` like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("`path` not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("`path` in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("`path` not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("`path` between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("`path` not between", value1, value2, "path");
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