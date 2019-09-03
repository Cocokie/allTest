package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportsubcapitalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportsubcapitalsExample() {
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

        public Criteria andAncheidIsNull() {
            addCriterion("ancheid is null");
            return (Criteria) this;
        }

        public Criteria andAncheidIsNotNull() {
            addCriterion("ancheid is not null");
            return (Criteria) this;
        }

        public Criteria andAncheidEqualTo(String value) {
            addCriterion("ancheid =", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotEqualTo(String value) {
            addCriterion("ancheid <>", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidGreaterThan(String value) {
            addCriterion("ancheid >", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidGreaterThanOrEqualTo(String value) {
            addCriterion("ancheid >=", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLessThan(String value) {
            addCriterion("ancheid <", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLessThanOrEqualTo(String value) {
            addCriterion("ancheid <=", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidLike(String value) {
            addCriterion("ancheid like", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotLike(String value) {
            addCriterion("ancheid not like", value, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidIn(List<String> values) {
            addCriterion("ancheid in", values, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotIn(List<String> values) {
            addCriterion("ancheid not in", values, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidBetween(String value1, String value2) {
            addCriterion("ancheid between", value1, value2, "ancheid");
            return (Criteria) this;
        }

        public Criteria andAncheidNotBetween(String value1, String value2) {
            addCriterion("ancheid not between", value1, value2, "ancheid");
            return (Criteria) this;
        }

        public Criteria andCondateIsNull() {
            addCriterion("condate is null");
            return (Criteria) this;
        }

        public Criteria andCondateIsNotNull() {
            addCriterion("condate is not null");
            return (Criteria) this;
        }

        public Criteria andCondateEqualTo(String value) {
            addCriterion("condate =", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateNotEqualTo(String value) {
            addCriterion("condate <>", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateGreaterThan(String value) {
            addCriterion("condate >", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateGreaterThanOrEqualTo(String value) {
            addCriterion("condate >=", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateLessThan(String value) {
            addCriterion("condate <", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateLessThanOrEqualTo(String value) {
            addCriterion("condate <=", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateLike(String value) {
            addCriterion("condate like", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateNotLike(String value) {
            addCriterion("condate not like", value, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateIn(List<String> values) {
            addCriterion("condate in", values, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateNotIn(List<String> values) {
            addCriterion("condate not in", values, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateBetween(String value1, String value2) {
            addCriterion("condate between", value1, value2, "condate");
            return (Criteria) this;
        }

        public Criteria andCondateNotBetween(String value1, String value2) {
            addCriterion("condate not between", value1, value2, "condate");
            return (Criteria) this;
        }

        public Criteria andConformIsNull() {
            addCriterion("conform is null");
            return (Criteria) this;
        }

        public Criteria andConformIsNotNull() {
            addCriterion("conform is not null");
            return (Criteria) this;
        }

        public Criteria andConformEqualTo(String value) {
            addCriterion("conform =", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformNotEqualTo(String value) {
            addCriterion("conform <>", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformGreaterThan(String value) {
            addCriterion("conform >", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformGreaterThanOrEqualTo(String value) {
            addCriterion("conform >=", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformLessThan(String value) {
            addCriterion("conform <", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformLessThanOrEqualTo(String value) {
            addCriterion("conform <=", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformLike(String value) {
            addCriterion("conform like", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformNotLike(String value) {
            addCriterion("conform not like", value, "conform");
            return (Criteria) this;
        }

        public Criteria andConformIn(List<String> values) {
            addCriterion("conform in", values, "conform");
            return (Criteria) this;
        }

        public Criteria andConformNotIn(List<String> values) {
            addCriterion("conform not in", values, "conform");
            return (Criteria) this;
        }

        public Criteria andConformBetween(String value1, String value2) {
            addCriterion("conform between", value1, value2, "conform");
            return (Criteria) this;
        }

        public Criteria andConformNotBetween(String value1, String value2) {
            addCriterion("conform not between", value1, value2, "conform");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andInvIsNull() {
            addCriterion("inv is null");
            return (Criteria) this;
        }

        public Criteria andInvIsNotNull() {
            addCriterion("inv is not null");
            return (Criteria) this;
        }

        public Criteria andInvEqualTo(String value) {
            addCriterion("inv =", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotEqualTo(String value) {
            addCriterion("inv <>", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvGreaterThan(String value) {
            addCriterion("inv >", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvGreaterThanOrEqualTo(String value) {
            addCriterion("inv >=", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvLessThan(String value) {
            addCriterion("inv <", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvLessThanOrEqualTo(String value) {
            addCriterion("inv <=", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvLike(String value) {
            addCriterion("inv like", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotLike(String value) {
            addCriterion("inv not like", value, "inv");
            return (Criteria) this;
        }

        public Criteria andInvIn(List<String> values) {
            addCriterion("inv in", values, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotIn(List<String> values) {
            addCriterion("inv not in", values, "inv");
            return (Criteria) this;
        }

        public Criteria andInvBetween(String value1, String value2) {
            addCriterion("inv between", value1, value2, "inv");
            return (Criteria) this;
        }

        public Criteria andInvNotBetween(String value1, String value2) {
            addCriterion("inv not between", value1, value2, "inv");
            return (Criteria) this;
        }

        public Criteria andLisubconamIsNull() {
            addCriterion("lisubconam is null");
            return (Criteria) this;
        }

        public Criteria andLisubconamIsNotNull() {
            addCriterion("lisubconam is not null");
            return (Criteria) this;
        }

        public Criteria andLisubconamEqualTo(String value) {
            addCriterion("lisubconam =", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamNotEqualTo(String value) {
            addCriterion("lisubconam <>", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamGreaterThan(String value) {
            addCriterion("lisubconam >", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamGreaterThanOrEqualTo(String value) {
            addCriterion("lisubconam >=", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamLessThan(String value) {
            addCriterion("lisubconam <", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamLessThanOrEqualTo(String value) {
            addCriterion("lisubconam <=", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamLike(String value) {
            addCriterion("lisubconam like", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamNotLike(String value) {
            addCriterion("lisubconam not like", value, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamIn(List<String> values) {
            addCriterion("lisubconam in", values, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamNotIn(List<String> values) {
            addCriterion("lisubconam not in", values, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamBetween(String value1, String value2) {
            addCriterion("lisubconam between", value1, value2, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andLisubconamNotBetween(String value1, String value2) {
            addCriterion("lisubconam not between", value1, value2, "lisubconam");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
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