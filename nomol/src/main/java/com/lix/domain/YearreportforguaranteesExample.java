package com.lix.domain;

import java.util.ArrayList;
import java.util.List;

public class YearreportforguaranteesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearreportforguaranteesExample() {
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

        public Criteria andGatypeIsNull() {
            addCriterion("gatype is null");
            return (Criteria) this;
        }

        public Criteria andGatypeIsNotNull() {
            addCriterion("gatype is not null");
            return (Criteria) this;
        }

        public Criteria andGatypeEqualTo(String value) {
            addCriterion("gatype =", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeNotEqualTo(String value) {
            addCriterion("gatype <>", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeGreaterThan(String value) {
            addCriterion("gatype >", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeGreaterThanOrEqualTo(String value) {
            addCriterion("gatype >=", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeLessThan(String value) {
            addCriterion("gatype <", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeLessThanOrEqualTo(String value) {
            addCriterion("gatype <=", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeLike(String value) {
            addCriterion("gatype like", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeNotLike(String value) {
            addCriterion("gatype not like", value, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeIn(List<String> values) {
            addCriterion("gatype in", values, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeNotIn(List<String> values) {
            addCriterion("gatype not in", values, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeBetween(String value1, String value2) {
            addCriterion("gatype between", value1, value2, "gatype");
            return (Criteria) this;
        }

        public Criteria andGatypeNotBetween(String value1, String value2) {
            addCriterion("gatype not between", value1, value2, "gatype");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodIsNull() {
            addCriterion("guarapperiod is null");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodIsNotNull() {
            addCriterion("guarapperiod is not null");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodEqualTo(String value) {
            addCriterion("guarapperiod =", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodNotEqualTo(String value) {
            addCriterion("guarapperiod <>", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodGreaterThan(String value) {
            addCriterion("guarapperiod >", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodGreaterThanOrEqualTo(String value) {
            addCriterion("guarapperiod >=", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodLessThan(String value) {
            addCriterion("guarapperiod <", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodLessThanOrEqualTo(String value) {
            addCriterion("guarapperiod <=", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodLike(String value) {
            addCriterion("guarapperiod like", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodNotLike(String value) {
            addCriterion("guarapperiod not like", value, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodIn(List<String> values) {
            addCriterion("guarapperiod in", values, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodNotIn(List<String> values) {
            addCriterion("guarapperiod not in", values, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodBetween(String value1, String value2) {
            addCriterion("guarapperiod between", value1, value2, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andGuarapperiodNotBetween(String value1, String value2) {
            addCriterion("guarapperiod not between", value1, value2, "guarapperiod");
            return (Criteria) this;
        }

        public Criteria andMoreIsNull() {
            addCriterion("more is null");
            return (Criteria) this;
        }

        public Criteria andMoreIsNotNull() {
            addCriterion("more is not null");
            return (Criteria) this;
        }

        public Criteria andMoreEqualTo(String value) {
            addCriterion("more =", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotEqualTo(String value) {
            addCriterion("more <>", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThan(String value) {
            addCriterion("more >", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThanOrEqualTo(String value) {
            addCriterion("more >=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThan(String value) {
            addCriterion("more <", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThanOrEqualTo(String value) {
            addCriterion("more <=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLike(String value) {
            addCriterion("more like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotLike(String value) {
            addCriterion("more not like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreIn(List<String> values) {
            addCriterion("more in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotIn(List<String> values) {
            addCriterion("more not in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreBetween(String value1, String value2) {
            addCriterion("more between", value1, value2, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotBetween(String value1, String value2) {
            addCriterion("more not between", value1, value2, "more");
            return (Criteria) this;
        }

        public Criteria andMortgagorIsNull() {
            addCriterion("mortgagor is null");
            return (Criteria) this;
        }

        public Criteria andMortgagorIsNotNull() {
            addCriterion("mortgagor is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagorEqualTo(String value) {
            addCriterion("mortgagor =", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorNotEqualTo(String value) {
            addCriterion("mortgagor <>", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorGreaterThan(String value) {
            addCriterion("mortgagor >", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagor >=", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorLessThan(String value) {
            addCriterion("mortgagor <", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorLessThanOrEqualTo(String value) {
            addCriterion("mortgagor <=", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorLike(String value) {
            addCriterion("mortgagor like", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorNotLike(String value) {
            addCriterion("mortgagor not like", value, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorIn(List<String> values) {
            addCriterion("mortgagor in", values, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorNotIn(List<String> values) {
            addCriterion("mortgagor not in", values, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorBetween(String value1, String value2) {
            addCriterion("mortgagor between", value1, value2, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andMortgagorNotBetween(String value1, String value2) {
            addCriterion("mortgagor not between", value1, value2, "mortgagor");
            return (Criteria) this;
        }

        public Criteria andPefperformIsNull() {
            addCriterion("pefperform is null");
            return (Criteria) this;
        }

        public Criteria andPefperformIsNotNull() {
            addCriterion("pefperform is not null");
            return (Criteria) this;
        }

        public Criteria andPefperformEqualTo(String value) {
            addCriterion("pefperform =", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformNotEqualTo(String value) {
            addCriterion("pefperform <>", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformGreaterThan(String value) {
            addCriterion("pefperform >", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformGreaterThanOrEqualTo(String value) {
            addCriterion("pefperform >=", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformLessThan(String value) {
            addCriterion("pefperform <", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformLessThanOrEqualTo(String value) {
            addCriterion("pefperform <=", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformLike(String value) {
            addCriterion("pefperform like", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformNotLike(String value) {
            addCriterion("pefperform not like", value, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformIn(List<String> values) {
            addCriterion("pefperform in", values, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformNotIn(List<String> values) {
            addCriterion("pefperform not in", values, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformBetween(String value1, String value2) {
            addCriterion("pefperform between", value1, value2, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefperformNotBetween(String value1, String value2) {
            addCriterion("pefperform not between", value1, value2, "pefperform");
            return (Criteria) this;
        }

        public Criteria andPefpertoIsNull() {
            addCriterion("pefperto is null");
            return (Criteria) this;
        }

        public Criteria andPefpertoIsNotNull() {
            addCriterion("pefperto is not null");
            return (Criteria) this;
        }

        public Criteria andPefpertoEqualTo(String value) {
            addCriterion("pefperto =", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoNotEqualTo(String value) {
            addCriterion("pefperto <>", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoGreaterThan(String value) {
            addCriterion("pefperto >", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoGreaterThanOrEqualTo(String value) {
            addCriterion("pefperto >=", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoLessThan(String value) {
            addCriterion("pefperto <", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoLessThanOrEqualTo(String value) {
            addCriterion("pefperto <=", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoLike(String value) {
            addCriterion("pefperto like", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoNotLike(String value) {
            addCriterion("pefperto not like", value, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoIn(List<String> values) {
            addCriterion("pefperto in", values, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoNotIn(List<String> values) {
            addCriterion("pefperto not in", values, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoBetween(String value1, String value2) {
            addCriterion("pefperto between", value1, value2, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPefpertoNotBetween(String value1, String value2) {
            addCriterion("pefperto not between", value1, value2, "pefperto");
            return (Criteria) this;
        }

        public Criteria andPriclasecamIsNull() {
            addCriterion("priclasecam is null");
            return (Criteria) this;
        }

        public Criteria andPriclasecamIsNotNull() {
            addCriterion("priclasecam is not null");
            return (Criteria) this;
        }

        public Criteria andPriclasecamEqualTo(String value) {
            addCriterion("priclasecam =", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamNotEqualTo(String value) {
            addCriterion("priclasecam <>", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamGreaterThan(String value) {
            addCriterion("priclasecam >", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamGreaterThanOrEqualTo(String value) {
            addCriterion("priclasecam >=", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamLessThan(String value) {
            addCriterion("priclasecam <", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamLessThanOrEqualTo(String value) {
            addCriterion("priclasecam <=", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamLike(String value) {
            addCriterion("priclasecam like", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamNotLike(String value) {
            addCriterion("priclasecam not like", value, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamIn(List<String> values) {
            addCriterion("priclasecam in", values, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamNotIn(List<String> values) {
            addCriterion("priclasecam not in", values, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamBetween(String value1, String value2) {
            addCriterion("priclasecam between", value1, value2, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclasecamNotBetween(String value1, String value2) {
            addCriterion("priclasecam not between", value1, value2, "priclasecam");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindIsNull() {
            addCriterion("priclaseckind is null");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindIsNotNull() {
            addCriterion("priclaseckind is not null");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindEqualTo(String value) {
            addCriterion("priclaseckind =", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindNotEqualTo(String value) {
            addCriterion("priclaseckind <>", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindGreaterThan(String value) {
            addCriterion("priclaseckind >", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindGreaterThanOrEqualTo(String value) {
            addCriterion("priclaseckind >=", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindLessThan(String value) {
            addCriterion("priclaseckind <", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindLessThanOrEqualTo(String value) {
            addCriterion("priclaseckind <=", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindLike(String value) {
            addCriterion("priclaseckind like", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindNotLike(String value) {
            addCriterion("priclaseckind not like", value, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindIn(List<String> values) {
            addCriterion("priclaseckind in", values, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindNotIn(List<String> values) {
            addCriterion("priclaseckind not in", values, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindBetween(String value1, String value2) {
            addCriterion("priclaseckind between", value1, value2, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andPriclaseckindNotBetween(String value1, String value2) {
            addCriterion("priclaseckind not between", value1, value2, "priclaseckind");
            return (Criteria) this;
        }

        public Criteria andRageIsNull() {
            addCriterion("rage is null");
            return (Criteria) this;
        }

        public Criteria andRageIsNotNull() {
            addCriterion("rage is not null");
            return (Criteria) this;
        }

        public Criteria andRageEqualTo(String value) {
            addCriterion("rage =", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageNotEqualTo(String value) {
            addCriterion("rage <>", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageGreaterThan(String value) {
            addCriterion("rage >", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageGreaterThanOrEqualTo(String value) {
            addCriterion("rage >=", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageLessThan(String value) {
            addCriterion("rage <", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageLessThanOrEqualTo(String value) {
            addCriterion("rage <=", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageLike(String value) {
            addCriterion("rage like", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageNotLike(String value) {
            addCriterion("rage not like", value, "rage");
            return (Criteria) this;
        }

        public Criteria andRageIn(List<String> values) {
            addCriterion("rage in", values, "rage");
            return (Criteria) this;
        }

        public Criteria andRageNotIn(List<String> values) {
            addCriterion("rage not in", values, "rage");
            return (Criteria) this;
        }

        public Criteria andRageBetween(String value1, String value2) {
            addCriterion("rage between", value1, value2, "rage");
            return (Criteria) this;
        }

        public Criteria andRageNotBetween(String value1, String value2) {
            addCriterion("rage not between", value1, value2, "rage");
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