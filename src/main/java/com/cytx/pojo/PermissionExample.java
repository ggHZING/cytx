package com.cytx.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Integer value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Integer value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Integer value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Integer value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Integer> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Integer> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdIsNull() {
            addCriterion("\"permission_ user_id\" is null");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdIsNotNull() {
            addCriterion("\"permission_ user_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdEqualTo(Integer value) {
            addCriterion("\"permission_ user_id\" =", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdNotEqualTo(Integer value) {
            addCriterion("\"permission_ user_id\" <>", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdGreaterThan(Integer value) {
            addCriterion("\"permission_ user_id\" >", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"permission_ user_id\" >=", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdLessThan(Integer value) {
            addCriterion("\"permission_ user_id\" <", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"permission_ user_id\" <=", value, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdIn(List<Integer> values) {
            addCriterion("\"permission_ user_id\" in", values, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdNotIn(List<Integer> values) {
            addCriterion("\"permission_ user_id\" not in", values, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdBetween(Integer value1, Integer value2) {
            addCriterion("\"permission_ user_id\" between", value1, value2, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"permission_ user_id\" not between", value1, value2, "permissionUserId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIsNull() {
            addCriterion("permission_role is null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIsNotNull() {
            addCriterion("permission_role is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleEqualTo(Integer value) {
            addCriterion("permission_role =", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotEqualTo(Integer value) {
            addCriterion("permission_role <>", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleGreaterThan(Integer value) {
            addCriterion("permission_role >", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_role >=", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleLessThan(Integer value) {
            addCriterion("permission_role <", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleLessThanOrEqualTo(Integer value) {
            addCriterion("permission_role <=", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIn(List<Integer> values) {
            addCriterion("permission_role in", values, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotIn(List<Integer> values) {
            addCriterion("permission_role not in", values, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleBetween(Integer value1, Integer value2) {
            addCriterion("permission_role between", value1, value2, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_role not between", value1, value2, "permissionRole");
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