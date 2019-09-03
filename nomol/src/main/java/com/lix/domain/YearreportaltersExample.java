package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportaltersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportaltersExample() {
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

        public Criteria andAltitemIsNull() {
            addCriterion("altitem is null");
            return (Criteria) this;
        }

        public Criteria andAltitemIsNotNull() {
            addCriterion("altitem is not null");
            return (Criteria) this;
        }

        public Criteria andAltitemEqualTo(String value) {
            addCriterion("altitem =", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotEqualTo(String value) {
            addCriterion("altitem <>", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemGreaterThan(String value) {
            addCriterion("altitem >", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemGreaterThanOrEqualTo(String value) {
            addCriterion("altitem >=", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLessThan(String value) {
            addCriterion("altitem <", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLessThanOrEqualTo(String value) {
            addCriterion("altitem <=", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLike(String value) {
            addCriterion("altitem like", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotLike(String value) {
            addCriterion("altitem not like", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemIn(List<String> values) {
            addCriterion("altitem in", values, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotIn(List<String> values) {
            addCriterion("altitem not in", values, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemBetween(String value1, String value2) {
            addCriterion("altitem between", value1, value2, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotBetween(String value1, String value2) {
            addCriterion("altitem not between", value1, value2, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltafIsNull() {
            addCriterion("altaf is null");
            return (Criteria) this;
        }

        public Criteria andAltafIsNotNull() {
            addCriterion("altaf is not null");
            return (Criteria) this;
        }

        public Criteria andAltafEqualTo(String value) {
            addCriterion("altaf =", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafNotEqualTo(String value) {
            addCriterion("altaf <>", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafGreaterThan(String value) {
            addCriterion("altaf >", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafGreaterThanOrEqualTo(String value) {
            addCriterion("altaf >=", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafLessThan(String value) {
            addCriterion("altaf <", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafLessThanOrEqualTo(String value) {
            addCriterion("altaf <=", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafLike(String value) {
            addCriterion("altaf like", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafNotLike(String value) {
            addCriterion("altaf not like", value, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafIn(List<String> values) {
            addCriterion("altaf in", values, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafNotIn(List<String> values) {
            addCriterion("altaf not in", values, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafBetween(String value1, String value2) {
            addCriterion("altaf between", value1, value2, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltafNotBetween(String value1, String value2) {
            addCriterion("altaf not between", value1, value2, "altaf");
            return (Criteria) this;
        }

        public Criteria andAltbeIsNull() {
            addCriterion("altbe is null");
            return (Criteria) this;
        }

        public Criteria andAltbeIsNotNull() {
            addCriterion("altbe is not null");
            return (Criteria) this;
        }

        public Criteria andAltbeEqualTo(String value) {
            addCriterion("altbe =", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeNotEqualTo(String value) {
            addCriterion("altbe <>", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeGreaterThan(String value) {
            addCriterion("altbe >", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeGreaterThanOrEqualTo(String value) {
            addCriterion("altbe >=", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeLessThan(String value) {
            addCriterion("altbe <", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeLessThanOrEqualTo(String value) {
            addCriterion("altbe <=", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeLike(String value) {
            addCriterion("altbe like", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeNotLike(String value) {
            addCriterion("altbe not like", value, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeIn(List<String> values) {
            addCriterion("altbe in", values, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeNotIn(List<String> values) {
            addCriterion("altbe not in", values, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeBetween(String value1, String value2) {
            addCriterion("altbe between", value1, value2, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltbeNotBetween(String value1, String value2) {
            addCriterion("altbe not between", value1, value2, "altbe");
            return (Criteria) this;
        }

        public Criteria andAltdateIsNull() {
            addCriterion("altdate is null");
            return (Criteria) this;
        }

        public Criteria andAltdateIsNotNull() {
            addCriterion("altdate is not null");
            return (Criteria) this;
        }

        public Criteria andAltdateEqualTo(String value) {
            addCriterion("altdate =", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateNotEqualTo(String value) {
            addCriterion("altdate <>", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateGreaterThan(String value) {
            addCriterion("altdate >", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateGreaterThanOrEqualTo(String value) {
            addCriterion("altdate >=", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateLessThan(String value) {
            addCriterion("altdate <", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateLessThanOrEqualTo(String value) {
            addCriterion("altdate <=", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateLike(String value) {
            addCriterion("altdate like", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateNotLike(String value) {
            addCriterion("altdate not like", value, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateIn(List<String> values) {
            addCriterion("altdate in", values, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateNotIn(List<String> values) {
            addCriterion("altdate not in", values, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateBetween(String value1, String value2) {
            addCriterion("altdate between", value1, value2, "altdate");
            return (Criteria) this;
        }

        public Criteria andAltdateNotBetween(String value1, String value2) {
            addCriterion("altdate not between", value1, value2, "altdate");
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