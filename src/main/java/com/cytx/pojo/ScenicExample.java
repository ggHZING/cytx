package com.cytx.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("\"scenic _id\" is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("\"scenic _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("\"scenic _id\" =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("\"scenic _id\" <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("\"scenic _id\" >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"scenic _id\" >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("\"scenic _id\" <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"scenic _id\" <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("\"scenic _id\" in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("\"scenic _id\" not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("\"scenic _id\" between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"scenic _id\" not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIsNull() {
            addCriterion("scenic_addr is null");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIsNotNull() {
            addCriterion("scenic_addr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicAddrEqualTo(String value) {
            addCriterion("scenic_addr =", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotEqualTo(String value) {
            addCriterion("scenic_addr <>", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrGreaterThan(String value) {
            addCriterion("scenic_addr >", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_addr >=", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLessThan(String value) {
            addCriterion("scenic_addr <", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLessThanOrEqualTo(String value) {
            addCriterion("scenic_addr <=", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLike(String value) {
            addCriterion("scenic_addr like", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotLike(String value) {
            addCriterion("scenic_addr not like", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIn(List<String> values) {
            addCriterion("scenic_addr in", values, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotIn(List<String> values) {
            addCriterion("scenic_addr not in", values, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrBetween(String value1, String value2) {
            addCriterion("scenic_addr between", value1, value2, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotBetween(String value1, String value2) {
            addCriterion("scenic_addr not between", value1, value2, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicLinkIsNull() {
            addCriterion("scenic_link is null");
            return (Criteria) this;
        }

        public Criteria andScenicLinkIsNotNull() {
            addCriterion("scenic_link is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLinkEqualTo(String value) {
            addCriterion("scenic_link =", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkNotEqualTo(String value) {
            addCriterion("scenic_link <>", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkGreaterThan(String value) {
            addCriterion("scenic_link >", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_link >=", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkLessThan(String value) {
            addCriterion("scenic_link <", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkLessThanOrEqualTo(String value) {
            addCriterion("scenic_link <=", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkLike(String value) {
            addCriterion("scenic_link like", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkNotLike(String value) {
            addCriterion("scenic_link not like", value, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkIn(List<String> values) {
            addCriterion("scenic_link in", values, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkNotIn(List<String> values) {
            addCriterion("scenic_link not in", values, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkBetween(String value1, String value2) {
            addCriterion("scenic_link between", value1, value2, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicLinkNotBetween(String value1, String value2) {
            addCriterion("scenic_link not between", value1, value2, "scenicLink");
            return (Criteria) this;
        }

        public Criteria andScenicTelIsNull() {
            addCriterion("scenic_tel is null");
            return (Criteria) this;
        }

        public Criteria andScenicTelIsNotNull() {
            addCriterion("scenic_tel is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTelEqualTo(String value) {
            addCriterion("scenic_tel =", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotEqualTo(String value) {
            addCriterion("scenic_tel <>", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelGreaterThan(String value) {
            addCriterion("scenic_tel >", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_tel >=", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLessThan(String value) {
            addCriterion("scenic_tel <", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLessThanOrEqualTo(String value) {
            addCriterion("scenic_tel <=", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLike(String value) {
            addCriterion("scenic_tel like", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotLike(String value) {
            addCriterion("scenic_tel not like", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelIn(List<String> values) {
            addCriterion("scenic_tel in", values, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotIn(List<String> values) {
            addCriterion("scenic_tel not in", values, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelBetween(String value1, String value2) {
            addCriterion("scenic_tel between", value1, value2, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotBetween(String value1, String value2) {
            addCriterion("scenic_tel not between", value1, value2, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTicketIsNull() {
            addCriterion("scenic_ticket is null");
            return (Criteria) this;
        }

        public Criteria andScenicTicketIsNotNull() {
            addCriterion("scenic_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTicketEqualTo(String value) {
            addCriterion("scenic_ticket =", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketNotEqualTo(String value) {
            addCriterion("scenic_ticket <>", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketGreaterThan(String value) {
            addCriterion("scenic_ticket >", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_ticket >=", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketLessThan(String value) {
            addCriterion("scenic_ticket <", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketLessThanOrEqualTo(String value) {
            addCriterion("scenic_ticket <=", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketLike(String value) {
            addCriterion("scenic_ticket like", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketNotLike(String value) {
            addCriterion("scenic_ticket not like", value, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketIn(List<String> values) {
            addCriterion("scenic_ticket in", values, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketNotIn(List<String> values) {
            addCriterion("scenic_ticket not in", values, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketBetween(String value1, String value2) {
            addCriterion("scenic_ticket between", value1, value2, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicTicketNotBetween(String value1, String value2) {
            addCriterion("scenic_ticket not between", value1, value2, "scenicTicket");
            return (Criteria) this;
        }

        public Criteria andScenicChargeIsNull() {
            addCriterion("scenic_charge is null");
            return (Criteria) this;
        }

        public Criteria andScenicChargeIsNotNull() {
            addCriterion("scenic_charge is not null");
            return (Criteria) this;
        }

        public Criteria andScenicChargeEqualTo(Double value) {
            addCriterion("scenic_charge =", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeNotEqualTo(Double value) {
            addCriterion("scenic_charge <>", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeGreaterThan(Double value) {
            addCriterion("scenic_charge >", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_charge >=", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeLessThan(Double value) {
            addCriterion("scenic_charge <", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeLessThanOrEqualTo(Double value) {
            addCriterion("scenic_charge <=", value, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeIn(List<Double> values) {
            addCriterion("scenic_charge in", values, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeNotIn(List<Double> values) {
            addCriterion("scenic_charge not in", values, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeBetween(Double value1, Double value2) {
            addCriterion("scenic_charge between", value1, value2, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicChargeNotBetween(Double value1, Double value2) {
            addCriterion("scenic_charge not between", value1, value2, "scenicCharge");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIsNull() {
            addCriterion("scenic_picture is null");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIsNotNull() {
            addCriterion("scenic_picture is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPictureEqualTo(String value) {
            addCriterion("scenic_picture =", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotEqualTo(String value) {
            addCriterion("scenic_picture <>", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureGreaterThan(String value) {
            addCriterion("scenic_picture >", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_picture >=", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLessThan(String value) {
            addCriterion("scenic_picture <", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLessThanOrEqualTo(String value) {
            addCriterion("scenic_picture <=", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLike(String value) {
            addCriterion("scenic_picture like", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotLike(String value) {
            addCriterion("scenic_picture not like", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIn(List<String> values) {
            addCriterion("scenic_picture in", values, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotIn(List<String> values) {
            addCriterion("scenic_picture not in", values, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureBetween(String value1, String value2) {
            addCriterion("scenic_picture between", value1, value2, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotBetween(String value1, String value2) {
            addCriterion("scenic_picture not between", value1, value2, "scenicPicture");
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