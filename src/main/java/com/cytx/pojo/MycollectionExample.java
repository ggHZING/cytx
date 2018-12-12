package com.cytx.pojo;

import java.util.ArrayList;
import java.util.List;

public class MycollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MycollectionExample() {
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

        public Criteria andMycollectionIdIsNull() {
            addCriterion("mycollection_id is null");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdIsNotNull() {
            addCriterion("mycollection_id is not null");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdEqualTo(Integer value) {
            addCriterion("mycollection_id =", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdNotEqualTo(Integer value) {
            addCriterion("mycollection_id <>", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdGreaterThan(Integer value) {
            addCriterion("mycollection_id >", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mycollection_id >=", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdLessThan(Integer value) {
            addCriterion("mycollection_id <", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mycollection_id <=", value, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdIn(List<Integer> values) {
            addCriterion("mycollection_id in", values, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdNotIn(List<Integer> values) {
            addCriterion("mycollection_id not in", values, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("mycollection_id between", value1, value2, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mycollection_id not between", value1, value2, "mycollectionId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdIsNull() {
            addCriterion("\"mycollection_scenic _id\" is null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdIsNotNull() {
            addCriterion("\"mycollection_scenic _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdEqualTo(Integer value) {
            addCriterion("\"mycollection_scenic _id\" =", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdNotEqualTo(Integer value) {
            addCriterion("\"mycollection_scenic _id\" <>", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdGreaterThan(Integer value) {
            addCriterion("\"mycollection_scenic _id\" >", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"mycollection_scenic _id\" >=", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdLessThan(Integer value) {
            addCriterion("\"mycollection_scenic _id\" <", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"mycollection_scenic _id\" <=", value, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdIn(List<Integer> values) {
            addCriterion("\"mycollection_scenic _id\" in", values, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdNotIn(List<Integer> values) {
            addCriterion("\"mycollection_scenic _id\" not in", values, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("\"mycollection_scenic _id\" between", value1, value2, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"mycollection_scenic _id\" not between", value1, value2, "mycollectionScenicId");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameIsNull() {
            addCriterion("\"mycollection_ scenic_name\" is null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameIsNotNull() {
            addCriterion("\"mycollection_ scenic_name\" is not null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_name\" =", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameNotEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_name\" <>", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameGreaterThan(String value) {
            addCriterion("\"mycollection_ scenic_name\" >", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_name\" >=", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameLessThan(String value) {
            addCriterion("\"mycollection_ scenic_name\" <", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameLessThanOrEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_name\" <=", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameLike(String value) {
            addCriterion("\"mycollection_ scenic_name\" like", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameNotLike(String value) {
            addCriterion("\"mycollection_ scenic_name\" not like", value, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameIn(List<String> values) {
            addCriterion("\"mycollection_ scenic_name\" in", values, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameNotIn(List<String> values) {
            addCriterion("\"mycollection_ scenic_name\" not in", values, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameBetween(String value1, String value2) {
            addCriterion("\"mycollection_ scenic_name\" between", value1, value2, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicNameNotBetween(String value1, String value2) {
            addCriterion("\"mycollection_ scenic_name\" not between", value1, value2, "mycollectionScenicName");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureIsNull() {
            addCriterion("\"mycollection_ scenic_picture\" is null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureIsNotNull() {
            addCriterion("\"mycollection_ scenic_picture\" is not null");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_picture\" =", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureNotEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_picture\" <>", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureGreaterThan(String value) {
            addCriterion("\"mycollection_ scenic_picture\" >", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureGreaterThanOrEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_picture\" >=", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureLessThan(String value) {
            addCriterion("\"mycollection_ scenic_picture\" <", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureLessThanOrEqualTo(String value) {
            addCriterion("\"mycollection_ scenic_picture\" <=", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureLike(String value) {
            addCriterion("\"mycollection_ scenic_picture\" like", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureNotLike(String value) {
            addCriterion("\"mycollection_ scenic_picture\" not like", value, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureIn(List<String> values) {
            addCriterion("\"mycollection_ scenic_picture\" in", values, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureNotIn(List<String> values) {
            addCriterion("\"mycollection_ scenic_picture\" not in", values, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureBetween(String value1, String value2) {
            addCriterion("\"mycollection_ scenic_picture\" between", value1, value2, "mycollectionScenicPicture");
            return (Criteria) this;
        }

        public Criteria andMycollectionScenicPictureNotBetween(String value1, String value2) {
            addCriterion("\"mycollection_ scenic_picture\" not between", value1, value2, "mycollectionScenicPicture");
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