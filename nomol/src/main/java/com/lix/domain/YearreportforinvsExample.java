package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportforinvsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportforinvsExample() {
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

        public Criteria andCreditnoIsNull() {
            addCriterion("creditno is null");
            return (Criteria) this;
        }

        public Criteria andCreditnoIsNotNull() {
            addCriterion("creditno is not null");
            return (Criteria) this;
        }

        public Criteria andCreditnoEqualTo(String value) {
            addCriterion("creditno =", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotEqualTo(String value) {
            addCriterion("creditno <>", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoGreaterThan(String value) {
            addCriterion("creditno >", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoGreaterThanOrEqualTo(String value) {
            addCriterion("creditno >=", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLessThan(String value) {
            addCriterion("creditno <", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLessThanOrEqualTo(String value) {
            addCriterion("creditno <=", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoLike(String value) {
            addCriterion("creditno like", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotLike(String value) {
            addCriterion("creditno not like", value, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoIn(List<String> values) {
            addCriterion("creditno in", values, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotIn(List<String> values) {
            addCriterion("creditno not in", values, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoBetween(String value1, String value2) {
            addCriterion("creditno between", value1, value2, "creditno");
            return (Criteria) this;
        }

        public Criteria andCreditnoNotBetween(String value1, String value2) {
            addCriterion("creditno not between", value1, value2, "creditno");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("entname is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("entname is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("entname =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("entname <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("entname >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("entname >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("entname <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("entname <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("entname like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("entname not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("entname in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("entname not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("entname between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("entname not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNull() {
            addCriterion("regno is null");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNotNull() {
            addCriterion("regno is not null");
            return (Criteria) this;
        }

        public Criteria andRegnoEqualTo(String value) {
            addCriterion("regno =", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotEqualTo(String value) {
            addCriterion("regno <>", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThan(String value) {
            addCriterion("regno >", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThanOrEqualTo(String value) {
            addCriterion("regno >=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThan(String value) {
            addCriterion("regno <", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThanOrEqualTo(String value) {
            addCriterion("regno <=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLike(String value) {
            addCriterion("regno like", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotLike(String value) {
            addCriterion("regno not like", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoIn(List<String> values) {
            addCriterion("regno in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotIn(List<String> values) {
            addCriterion("regno not in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoBetween(String value1, String value2) {
            addCriterion("regno between", value1, value2, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotBetween(String value1, String value2) {
            addCriterion("regno not between", value1, value2, "regno");
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