package com.dianrong.common.uniauth.server.data.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample extends PageParam {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueExtIsNull() {
            addCriterion("value_ext is null");
            return (Criteria) this;
        }

        public Criteria andValueExtIsNotNull() {
            addCriterion("value_ext is not null");
            return (Criteria) this;
        }

        public Criteria andValueExtEqualTo(String value) {
            addCriterion("value_ext =", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtNotEqualTo(String value) {
            addCriterion("value_ext <>", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtGreaterThan(String value) {
            addCriterion("value_ext >", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtGreaterThanOrEqualTo(String value) {
            addCriterion("value_ext >=", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtLessThan(String value) {
            addCriterion("value_ext <", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtLessThanOrEqualTo(String value) {
            addCriterion("value_ext <=", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtLike(String value) {
            addCriterion("value_ext like", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtNotLike(String value) {
            addCriterion("value_ext not like", value, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtIn(List<String> values) {
            addCriterion("value_ext in", values, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtNotIn(List<String> values) {
            addCriterion("value_ext not in", values, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtBetween(String value1, String value2) {
            addCriterion("value_ext between", value1, value2, "valueExt");
            return (Criteria) this;
        }

        public Criteria andValueExtNotBetween(String value1, String value2) {
            addCriterion("value_ext not between", value1, value2, "valueExt");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdIsNull() {
            addCriterion("perm_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdIsNotNull() {
            addCriterion("perm_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdEqualTo(Integer value) {
            addCriterion("perm_type_id =", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdNotEqualTo(Integer value) {
            addCriterion("perm_type_id <>", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdGreaterThan(Integer value) {
            addCriterion("perm_type_id >", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("perm_type_id >=", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdLessThan(Integer value) {
            addCriterion("perm_type_id <", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("perm_type_id <=", value, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdIn(List<Integer> values) {
            addCriterion("perm_type_id in", values, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdNotIn(List<Integer> values) {
            addCriterion("perm_type_id not in", values, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("perm_type_id between", value1, value2, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andPermTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("perm_type_id not between", value1, value2, "permTypeId");
            return (Criteria) this;
        }

        public Criteria andDomainIdIsNull() {
            addCriterion("domain_id is null");
            return (Criteria) this;
        }

        public Criteria andDomainIdIsNotNull() {
            addCriterion("domain_id is not null");
            return (Criteria) this;
        }

        public Criteria andDomainIdEqualTo(Integer value) {
            addCriterion("domain_id =", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotEqualTo(Integer value) {
            addCriterion("domain_id <>", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdGreaterThan(Integer value) {
            addCriterion("domain_id >", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("domain_id >=", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdLessThan(Integer value) {
            addCriterion("domain_id <", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdLessThanOrEqualTo(Integer value) {
            addCriterion("domain_id <=", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdIn(List<Integer> values) {
            addCriterion("domain_id in", values, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotIn(List<Integer> values) {
            addCriterion("domain_id not in", values, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdBetween(Integer value1, Integer value2) {
            addCriterion("domain_id between", value1, value2, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("domain_id not between", value1, value2, "domainId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdIsNull() {
            addCriterion("tenancy_id is null");
            return (Criteria) this;
        }

        public Criteria andTenancyIdIsNotNull() {
            addCriterion("tenancy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenancyIdEqualTo(Long value) {
            addCriterion("tenancy_id =", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdNotEqualTo(Long value) {
            addCriterion("tenancy_id <>", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdGreaterThan(Long value) {
            addCriterion("tenancy_id >", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenancy_id >=", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdLessThan(Long value) {
            addCriterion("tenancy_id <", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdLessThanOrEqualTo(Long value) {
            addCriterion("tenancy_id <=", value, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdIn(List<Long> values) {
            addCriterion("tenancy_id in", values, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdNotIn(List<Long> values) {
            addCriterion("tenancy_id not in", values, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdBetween(Long value1, Long value2) {
            addCriterion("tenancy_id between", value1, value2, "tenancyId");
            return (Criteria) this;
        }

        public Criteria andTenancyIdNotBetween(Long value1, Long value2) {
            addCriterion("tenancy_id not between", value1, value2, "tenancyId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * permission
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 27 11:53:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * permission
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
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
