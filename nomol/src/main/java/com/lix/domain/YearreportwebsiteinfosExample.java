package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportwebsiteinfosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportwebsiteinfosExample() {
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

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andWebsitnameIsNull() {
            addCriterion("websitname is null");
            return (Criteria) this;
        }

        public Criteria andWebsitnameIsNotNull() {
            addCriterion("websitname is not null");
            return (Criteria) this;
        }

        public Criteria andWebsitnameEqualTo(String value) {
            addCriterion("websitname =", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameNotEqualTo(String value) {
            addCriterion("websitname <>", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameGreaterThan(String value) {
            addCriterion("websitname >", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameGreaterThanOrEqualTo(String value) {
            addCriterion("websitname >=", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameLessThan(String value) {
            addCriterion("websitname <", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameLessThanOrEqualTo(String value) {
            addCriterion("websitname <=", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameLike(String value) {
            addCriterion("websitname like", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameNotLike(String value) {
            addCriterion("websitname not like", value, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameIn(List<String> values) {
            addCriterion("websitname in", values, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameNotIn(List<String> values) {
            addCriterion("websitname not in", values, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameBetween(String value1, String value2) {
            addCriterion("websitname between", value1, value2, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebsitnameNotBetween(String value1, String value2) {
            addCriterion("websitname not between", value1, value2, "websitname");
            return (Criteria) this;
        }

        public Criteria andWebtypeIsNull() {
            addCriterion("webtype is null");
            return (Criteria) this;
        }

        public Criteria andWebtypeIsNotNull() {
            addCriterion("webtype is not null");
            return (Criteria) this;
        }

        public Criteria andWebtypeEqualTo(String value) {
            addCriterion("webtype =", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeNotEqualTo(String value) {
            addCriterion("webtype <>", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeGreaterThan(String value) {
            addCriterion("webtype >", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeGreaterThanOrEqualTo(String value) {
            addCriterion("webtype >=", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeLessThan(String value) {
            addCriterion("webtype <", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeLessThanOrEqualTo(String value) {
            addCriterion("webtype <=", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeLike(String value) {
            addCriterion("webtype like", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeNotLike(String value) {
            addCriterion("webtype not like", value, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeIn(List<String> values) {
            addCriterion("webtype in", values, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeNotIn(List<String> values) {
            addCriterion("webtype not in", values, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeBetween(String value1, String value2) {
            addCriterion("webtype between", value1, value2, "webtype");
            return (Criteria) this;
        }

        public Criteria andWebtypeNotBetween(String value1, String value2) {
            addCriterion("webtype not between", value1, value2, "webtype");
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