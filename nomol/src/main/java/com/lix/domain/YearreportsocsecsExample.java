package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportsocsecsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportsocsecsExample() {
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

        public Criteria andSo110IsNull() {
            addCriterion("so110 is null");
            return (Criteria) this;
        }

        public Criteria andSo110IsNotNull() {
            addCriterion("so110 is not null");
            return (Criteria) this;
        }

        public Criteria andSo110EqualTo(String value) {
            addCriterion("so110 =", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110NotEqualTo(String value) {
            addCriterion("so110 <>", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110GreaterThan(String value) {
            addCriterion("so110 >", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110GreaterThanOrEqualTo(String value) {
            addCriterion("so110 >=", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110LessThan(String value) {
            addCriterion("so110 <", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110LessThanOrEqualTo(String value) {
            addCriterion("so110 <=", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110Like(String value) {
            addCriterion("so110 like", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110NotLike(String value) {
            addCriterion("so110 not like", value, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110In(List<String> values) {
            addCriterion("so110 in", values, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110NotIn(List<String> values) {
            addCriterion("so110 not in", values, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110Between(String value1, String value2) {
            addCriterion("so110 between", value1, value2, "so110");
            return (Criteria) this;
        }

        public Criteria andSo110NotBetween(String value1, String value2) {
            addCriterion("so110 not between", value1, value2, "so110");
            return (Criteria) this;
        }

        public Criteria andSo210IsNull() {
            addCriterion("so210 is null");
            return (Criteria) this;
        }

        public Criteria andSo210IsNotNull() {
            addCriterion("so210 is not null");
            return (Criteria) this;
        }

        public Criteria andSo210EqualTo(String value) {
            addCriterion("so210 =", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210NotEqualTo(String value) {
            addCriterion("so210 <>", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210GreaterThan(String value) {
            addCriterion("so210 >", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210GreaterThanOrEqualTo(String value) {
            addCriterion("so210 >=", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210LessThan(String value) {
            addCriterion("so210 <", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210LessThanOrEqualTo(String value) {
            addCriterion("so210 <=", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210Like(String value) {
            addCriterion("so210 like", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210NotLike(String value) {
            addCriterion("so210 not like", value, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210In(List<String> values) {
            addCriterion("so210 in", values, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210NotIn(List<String> values) {
            addCriterion("so210 not in", values, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210Between(String value1, String value2) {
            addCriterion("so210 between", value1, value2, "so210");
            return (Criteria) this;
        }

        public Criteria andSo210NotBetween(String value1, String value2) {
            addCriterion("so210 not between", value1, value2, "so210");
            return (Criteria) this;
        }

        public Criteria andSo310IsNull() {
            addCriterion("so310 is null");
            return (Criteria) this;
        }

        public Criteria andSo310IsNotNull() {
            addCriterion("so310 is not null");
            return (Criteria) this;
        }

        public Criteria andSo310EqualTo(String value) {
            addCriterion("so310 =", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310NotEqualTo(String value) {
            addCriterion("so310 <>", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310GreaterThan(String value) {
            addCriterion("so310 >", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310GreaterThanOrEqualTo(String value) {
            addCriterion("so310 >=", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310LessThan(String value) {
            addCriterion("so310 <", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310LessThanOrEqualTo(String value) {
            addCriterion("so310 <=", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310Like(String value) {
            addCriterion("so310 like", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310NotLike(String value) {
            addCriterion("so310 not like", value, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310In(List<String> values) {
            addCriterion("so310 in", values, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310NotIn(List<String> values) {
            addCriterion("so310 not in", values, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310Between(String value1, String value2) {
            addCriterion("so310 between", value1, value2, "so310");
            return (Criteria) this;
        }

        public Criteria andSo310NotBetween(String value1, String value2) {
            addCriterion("so310 not between", value1, value2, "so310");
            return (Criteria) this;
        }

        public Criteria andSo410IsNull() {
            addCriterion("so410 is null");
            return (Criteria) this;
        }

        public Criteria andSo410IsNotNull() {
            addCriterion("so410 is not null");
            return (Criteria) this;
        }

        public Criteria andSo410EqualTo(String value) {
            addCriterion("so410 =", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410NotEqualTo(String value) {
            addCriterion("so410 <>", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410GreaterThan(String value) {
            addCriterion("so410 >", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410GreaterThanOrEqualTo(String value) {
            addCriterion("so410 >=", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410LessThan(String value) {
            addCriterion("so410 <", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410LessThanOrEqualTo(String value) {
            addCriterion("so410 <=", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410Like(String value) {
            addCriterion("so410 like", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410NotLike(String value) {
            addCriterion("so410 not like", value, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410In(List<String> values) {
            addCriterion("so410 in", values, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410NotIn(List<String> values) {
            addCriterion("so410 not in", values, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410Between(String value1, String value2) {
            addCriterion("so410 between", value1, value2, "so410");
            return (Criteria) this;
        }

        public Criteria andSo410NotBetween(String value1, String value2) {
            addCriterion("so410 not between", value1, value2, "so410");
            return (Criteria) this;
        }

        public Criteria andSo510IsNull() {
            addCriterion("so510 is null");
            return (Criteria) this;
        }

        public Criteria andSo510IsNotNull() {
            addCriterion("so510 is not null");
            return (Criteria) this;
        }

        public Criteria andSo510EqualTo(String value) {
            addCriterion("so510 =", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510NotEqualTo(String value) {
            addCriterion("so510 <>", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510GreaterThan(String value) {
            addCriterion("so510 >", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510GreaterThanOrEqualTo(String value) {
            addCriterion("so510 >=", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510LessThan(String value) {
            addCriterion("so510 <", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510LessThanOrEqualTo(String value) {
            addCriterion("so510 <=", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510Like(String value) {
            addCriterion("so510 like", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510NotLike(String value) {
            addCriterion("so510 not like", value, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510In(List<String> values) {
            addCriterion("so510 in", values, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510NotIn(List<String> values) {
            addCriterion("so510 not in", values, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510Between(String value1, String value2) {
            addCriterion("so510 between", value1, value2, "so510");
            return (Criteria) this;
        }

        public Criteria andSo510NotBetween(String value1, String value2) {
            addCriterion("so510 not between", value1, value2, "so510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110IsNull() {
            addCriterion("totalpaymentso110 is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110IsNotNull() {
            addCriterion("totalpaymentso110 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110EqualTo(String value) {
            addCriterion("totalpaymentso110 =", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110NotEqualTo(String value) {
            addCriterion("totalpaymentso110 <>", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110GreaterThan(String value) {
            addCriterion("totalpaymentso110 >", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110GreaterThanOrEqualTo(String value) {
            addCriterion("totalpaymentso110 >=", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110LessThan(String value) {
            addCriterion("totalpaymentso110 <", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110LessThanOrEqualTo(String value) {
            addCriterion("totalpaymentso110 <=", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110Like(String value) {
            addCriterion("totalpaymentso110 like", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110NotLike(String value) {
            addCriterion("totalpaymentso110 not like", value, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110In(List<String> values) {
            addCriterion("totalpaymentso110 in", values, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110NotIn(List<String> values) {
            addCriterion("totalpaymentso110 not in", values, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110Between(String value1, String value2) {
            addCriterion("totalpaymentso110 between", value1, value2, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso110NotBetween(String value1, String value2) {
            addCriterion("totalpaymentso110 not between", value1, value2, "totalpaymentso110");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210IsNull() {
            addCriterion("totalpaymentso210 is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210IsNotNull() {
            addCriterion("totalpaymentso210 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210EqualTo(String value) {
            addCriterion("totalpaymentso210 =", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210NotEqualTo(String value) {
            addCriterion("totalpaymentso210 <>", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210GreaterThan(String value) {
            addCriterion("totalpaymentso210 >", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210GreaterThanOrEqualTo(String value) {
            addCriterion("totalpaymentso210 >=", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210LessThan(String value) {
            addCriterion("totalpaymentso210 <", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210LessThanOrEqualTo(String value) {
            addCriterion("totalpaymentso210 <=", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210Like(String value) {
            addCriterion("totalpaymentso210 like", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210NotLike(String value) {
            addCriterion("totalpaymentso210 not like", value, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210In(List<String> values) {
            addCriterion("totalpaymentso210 in", values, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210NotIn(List<String> values) {
            addCriterion("totalpaymentso210 not in", values, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210Between(String value1, String value2) {
            addCriterion("totalpaymentso210 between", value1, value2, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso210NotBetween(String value1, String value2) {
            addCriterion("totalpaymentso210 not between", value1, value2, "totalpaymentso210");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310IsNull() {
            addCriterion("totalpaymentso310 is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310IsNotNull() {
            addCriterion("totalpaymentso310 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310EqualTo(String value) {
            addCriterion("totalpaymentso310 =", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310NotEqualTo(String value) {
            addCriterion("totalpaymentso310 <>", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310GreaterThan(String value) {
            addCriterion("totalpaymentso310 >", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310GreaterThanOrEqualTo(String value) {
            addCriterion("totalpaymentso310 >=", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310LessThan(String value) {
            addCriterion("totalpaymentso310 <", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310LessThanOrEqualTo(String value) {
            addCriterion("totalpaymentso310 <=", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310Like(String value) {
            addCriterion("totalpaymentso310 like", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310NotLike(String value) {
            addCriterion("totalpaymentso310 not like", value, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310In(List<String> values) {
            addCriterion("totalpaymentso310 in", values, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310NotIn(List<String> values) {
            addCriterion("totalpaymentso310 not in", values, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310Between(String value1, String value2) {
            addCriterion("totalpaymentso310 between", value1, value2, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso310NotBetween(String value1, String value2) {
            addCriterion("totalpaymentso310 not between", value1, value2, "totalpaymentso310");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410IsNull() {
            addCriterion("totalpaymentso410 is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410IsNotNull() {
            addCriterion("totalpaymentso410 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410EqualTo(String value) {
            addCriterion("totalpaymentso410 =", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410NotEqualTo(String value) {
            addCriterion("totalpaymentso410 <>", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410GreaterThan(String value) {
            addCriterion("totalpaymentso410 >", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410GreaterThanOrEqualTo(String value) {
            addCriterion("totalpaymentso410 >=", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410LessThan(String value) {
            addCriterion("totalpaymentso410 <", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410LessThanOrEqualTo(String value) {
            addCriterion("totalpaymentso410 <=", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410Like(String value) {
            addCriterion("totalpaymentso410 like", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410NotLike(String value) {
            addCriterion("totalpaymentso410 not like", value, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410In(List<String> values) {
            addCriterion("totalpaymentso410 in", values, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410NotIn(List<String> values) {
            addCriterion("totalpaymentso410 not in", values, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410Between(String value1, String value2) {
            addCriterion("totalpaymentso410 between", value1, value2, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso410NotBetween(String value1, String value2) {
            addCriterion("totalpaymentso410 not between", value1, value2, "totalpaymentso410");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510IsNull() {
            addCriterion("totalpaymentso510 is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510IsNotNull() {
            addCriterion("totalpaymentso510 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510EqualTo(String value) {
            addCriterion("totalpaymentso510 =", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510NotEqualTo(String value) {
            addCriterion("totalpaymentso510 <>", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510GreaterThan(String value) {
            addCriterion("totalpaymentso510 >", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510GreaterThanOrEqualTo(String value) {
            addCriterion("totalpaymentso510 >=", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510LessThan(String value) {
            addCriterion("totalpaymentso510 <", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510LessThanOrEqualTo(String value) {
            addCriterion("totalpaymentso510 <=", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510Like(String value) {
            addCriterion("totalpaymentso510 like", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510NotLike(String value) {
            addCriterion("totalpaymentso510 not like", value, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510In(List<String> values) {
            addCriterion("totalpaymentso510 in", values, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510NotIn(List<String> values) {
            addCriterion("totalpaymentso510 not in", values, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510Between(String value1, String value2) {
            addCriterion("totalpaymentso510 between", value1, value2, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentso510NotBetween(String value1, String value2) {
            addCriterion("totalpaymentso510 not between", value1, value2, "totalpaymentso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110IsNull() {
            addCriterion("totalwagesso110 is null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110IsNotNull() {
            addCriterion("totalwagesso110 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110EqualTo(String value) {
            addCriterion("totalwagesso110 =", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110NotEqualTo(String value) {
            addCriterion("totalwagesso110 <>", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110GreaterThan(String value) {
            addCriterion("totalwagesso110 >", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110GreaterThanOrEqualTo(String value) {
            addCriterion("totalwagesso110 >=", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110LessThan(String value) {
            addCriterion("totalwagesso110 <", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110LessThanOrEqualTo(String value) {
            addCriterion("totalwagesso110 <=", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110Like(String value) {
            addCriterion("totalwagesso110 like", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110NotLike(String value) {
            addCriterion("totalwagesso110 not like", value, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110In(List<String> values) {
            addCriterion("totalwagesso110 in", values, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110NotIn(List<String> values) {
            addCriterion("totalwagesso110 not in", values, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110Between(String value1, String value2) {
            addCriterion("totalwagesso110 between", value1, value2, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso110NotBetween(String value1, String value2) {
            addCriterion("totalwagesso110 not between", value1, value2, "totalwagesso110");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210IsNull() {
            addCriterion("totalwagesso210 is null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210IsNotNull() {
            addCriterion("totalwagesso210 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210EqualTo(String value) {
            addCriterion("totalwagesso210 =", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210NotEqualTo(String value) {
            addCriterion("totalwagesso210 <>", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210GreaterThan(String value) {
            addCriterion("totalwagesso210 >", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210GreaterThanOrEqualTo(String value) {
            addCriterion("totalwagesso210 >=", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210LessThan(String value) {
            addCriterion("totalwagesso210 <", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210LessThanOrEqualTo(String value) {
            addCriterion("totalwagesso210 <=", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210Like(String value) {
            addCriterion("totalwagesso210 like", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210NotLike(String value) {
            addCriterion("totalwagesso210 not like", value, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210In(List<String> values) {
            addCriterion("totalwagesso210 in", values, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210NotIn(List<String> values) {
            addCriterion("totalwagesso210 not in", values, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210Between(String value1, String value2) {
            addCriterion("totalwagesso210 between", value1, value2, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso210NotBetween(String value1, String value2) {
            addCriterion("totalwagesso210 not between", value1, value2, "totalwagesso210");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310IsNull() {
            addCriterion("totalwagesso310 is null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310IsNotNull() {
            addCriterion("totalwagesso310 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310EqualTo(String value) {
            addCriterion("totalwagesso310 =", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310NotEqualTo(String value) {
            addCriterion("totalwagesso310 <>", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310GreaterThan(String value) {
            addCriterion("totalwagesso310 >", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310GreaterThanOrEqualTo(String value) {
            addCriterion("totalwagesso310 >=", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310LessThan(String value) {
            addCriterion("totalwagesso310 <", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310LessThanOrEqualTo(String value) {
            addCriterion("totalwagesso310 <=", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310Like(String value) {
            addCriterion("totalwagesso310 like", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310NotLike(String value) {
            addCriterion("totalwagesso310 not like", value, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310In(List<String> values) {
            addCriterion("totalwagesso310 in", values, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310NotIn(List<String> values) {
            addCriterion("totalwagesso310 not in", values, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310Between(String value1, String value2) {
            addCriterion("totalwagesso310 between", value1, value2, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso310NotBetween(String value1, String value2) {
            addCriterion("totalwagesso310 not between", value1, value2, "totalwagesso310");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410IsNull() {
            addCriterion("totalwagesso410 is null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410IsNotNull() {
            addCriterion("totalwagesso410 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410EqualTo(String value) {
            addCriterion("totalwagesso410 =", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410NotEqualTo(String value) {
            addCriterion("totalwagesso410 <>", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410GreaterThan(String value) {
            addCriterion("totalwagesso410 >", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410GreaterThanOrEqualTo(String value) {
            addCriterion("totalwagesso410 >=", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410LessThan(String value) {
            addCriterion("totalwagesso410 <", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410LessThanOrEqualTo(String value) {
            addCriterion("totalwagesso410 <=", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410Like(String value) {
            addCriterion("totalwagesso410 like", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410NotLike(String value) {
            addCriterion("totalwagesso410 not like", value, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410In(List<String> values) {
            addCriterion("totalwagesso410 in", values, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410NotIn(List<String> values) {
            addCriterion("totalwagesso410 not in", values, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410Between(String value1, String value2) {
            addCriterion("totalwagesso410 between", value1, value2, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso410NotBetween(String value1, String value2) {
            addCriterion("totalwagesso410 not between", value1, value2, "totalwagesso410");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510IsNull() {
            addCriterion("totalwagesso510 is null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510IsNotNull() {
            addCriterion("totalwagesso510 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510EqualTo(String value) {
            addCriterion("totalwagesso510 =", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510NotEqualTo(String value) {
            addCriterion("totalwagesso510 <>", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510GreaterThan(String value) {
            addCriterion("totalwagesso510 >", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510GreaterThanOrEqualTo(String value) {
            addCriterion("totalwagesso510 >=", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510LessThan(String value) {
            addCriterion("totalwagesso510 <", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510LessThanOrEqualTo(String value) {
            addCriterion("totalwagesso510 <=", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510Like(String value) {
            addCriterion("totalwagesso510 like", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510NotLike(String value) {
            addCriterion("totalwagesso510 not like", value, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510In(List<String> values) {
            addCriterion("totalwagesso510 in", values, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510NotIn(List<String> values) {
            addCriterion("totalwagesso510 not in", values, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510Between(String value1, String value2) {
            addCriterion("totalwagesso510 between", value1, value2, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andTotalwagesso510NotBetween(String value1, String value2) {
            addCriterion("totalwagesso510 not between", value1, value2, "totalwagesso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110IsNull() {
            addCriterion("unpaidsocialinsso110 is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110IsNotNull() {
            addCriterion("unpaidsocialinsso110 is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110EqualTo(String value) {
            addCriterion("unpaidsocialinsso110 =", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110NotEqualTo(String value) {
            addCriterion("unpaidsocialinsso110 <>", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110GreaterThan(String value) {
            addCriterion("unpaidsocialinsso110 >", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110GreaterThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso110 >=", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110LessThan(String value) {
            addCriterion("unpaidsocialinsso110 <", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110LessThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso110 <=", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110Like(String value) {
            addCriterion("unpaidsocialinsso110 like", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110NotLike(String value) {
            addCriterion("unpaidsocialinsso110 not like", value, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110In(List<String> values) {
            addCriterion("unpaidsocialinsso110 in", values, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110NotIn(List<String> values) {
            addCriterion("unpaidsocialinsso110 not in", values, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110Between(String value1, String value2) {
            addCriterion("unpaidsocialinsso110 between", value1, value2, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso110NotBetween(String value1, String value2) {
            addCriterion("unpaidsocialinsso110 not between", value1, value2, "unpaidsocialinsso110");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210IsNull() {
            addCriterion("unpaidsocialinsso210 is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210IsNotNull() {
            addCriterion("unpaidsocialinsso210 is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210EqualTo(String value) {
            addCriterion("unpaidsocialinsso210 =", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210NotEqualTo(String value) {
            addCriterion("unpaidsocialinsso210 <>", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210GreaterThan(String value) {
            addCriterion("unpaidsocialinsso210 >", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210GreaterThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso210 >=", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210LessThan(String value) {
            addCriterion("unpaidsocialinsso210 <", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210LessThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso210 <=", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210Like(String value) {
            addCriterion("unpaidsocialinsso210 like", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210NotLike(String value) {
            addCriterion("unpaidsocialinsso210 not like", value, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210In(List<String> values) {
            addCriterion("unpaidsocialinsso210 in", values, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210NotIn(List<String> values) {
            addCriterion("unpaidsocialinsso210 not in", values, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210Between(String value1, String value2) {
            addCriterion("unpaidsocialinsso210 between", value1, value2, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso210NotBetween(String value1, String value2) {
            addCriterion("unpaidsocialinsso210 not between", value1, value2, "unpaidsocialinsso210");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310IsNull() {
            addCriterion("unpaidsocialinsso310 is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310IsNotNull() {
            addCriterion("unpaidsocialinsso310 is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310EqualTo(String value) {
            addCriterion("unpaidsocialinsso310 =", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310NotEqualTo(String value) {
            addCriterion("unpaidsocialinsso310 <>", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310GreaterThan(String value) {
            addCriterion("unpaidsocialinsso310 >", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310GreaterThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso310 >=", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310LessThan(String value) {
            addCriterion("unpaidsocialinsso310 <", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310LessThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso310 <=", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310Like(String value) {
            addCriterion("unpaidsocialinsso310 like", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310NotLike(String value) {
            addCriterion("unpaidsocialinsso310 not like", value, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310In(List<String> values) {
            addCriterion("unpaidsocialinsso310 in", values, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310NotIn(List<String> values) {
            addCriterion("unpaidsocialinsso310 not in", values, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310Between(String value1, String value2) {
            addCriterion("unpaidsocialinsso310 between", value1, value2, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso310NotBetween(String value1, String value2) {
            addCriterion("unpaidsocialinsso310 not between", value1, value2, "unpaidsocialinsso310");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410IsNull() {
            addCriterion("unpaidsocialinsso410 is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410IsNotNull() {
            addCriterion("unpaidsocialinsso410 is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410EqualTo(String value) {
            addCriterion("unpaidsocialinsso410 =", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410NotEqualTo(String value) {
            addCriterion("unpaidsocialinsso410 <>", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410GreaterThan(String value) {
            addCriterion("unpaidsocialinsso410 >", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410GreaterThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso410 >=", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410LessThan(String value) {
            addCriterion("unpaidsocialinsso410 <", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410LessThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso410 <=", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410Like(String value) {
            addCriterion("unpaidsocialinsso410 like", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410NotLike(String value) {
            addCriterion("unpaidsocialinsso410 not like", value, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410In(List<String> values) {
            addCriterion("unpaidsocialinsso410 in", values, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410NotIn(List<String> values) {
            addCriterion("unpaidsocialinsso410 not in", values, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410Between(String value1, String value2) {
            addCriterion("unpaidsocialinsso410 between", value1, value2, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso410NotBetween(String value1, String value2) {
            addCriterion("unpaidsocialinsso410 not between", value1, value2, "unpaidsocialinsso410");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510IsNull() {
            addCriterion("unpaidsocialinsso510 is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510IsNotNull() {
            addCriterion("unpaidsocialinsso510 is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510EqualTo(String value) {
            addCriterion("unpaidsocialinsso510 =", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510NotEqualTo(String value) {
            addCriterion("unpaidsocialinsso510 <>", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510GreaterThan(String value) {
            addCriterion("unpaidsocialinsso510 >", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510GreaterThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso510 >=", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510LessThan(String value) {
            addCriterion("unpaidsocialinsso510 <", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510LessThanOrEqualTo(String value) {
            addCriterion("unpaidsocialinsso510 <=", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510Like(String value) {
            addCriterion("unpaidsocialinsso510 like", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510NotLike(String value) {
            addCriterion("unpaidsocialinsso510 not like", value, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510In(List<String> values) {
            addCriterion("unpaidsocialinsso510 in", values, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510NotIn(List<String> values) {
            addCriterion("unpaidsocialinsso510 not in", values, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510Between(String value1, String value2) {
            addCriterion("unpaidsocialinsso510 between", value1, value2, "unpaidsocialinsso510");
            return (Criteria) this;
        }

        public Criteria andUnpaidsocialinsso510NotBetween(String value1, String value2) {
            addCriterion("unpaidsocialinsso510 not between", value1, value2, "unpaidsocialinsso510");
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