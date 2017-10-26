package com.zooweb.modle.entities.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClrCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClrCollectionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTnmIsNull() {
            addCriterion("TNM is null");
            return (Criteria) this;
        }

        public Criteria andTnmIsNotNull() {
            addCriterion("TNM is not null");
            return (Criteria) this;
        }

        public Criteria andTnmEqualTo(Integer value) {
            addCriterion("TNM =", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmNotEqualTo(Integer value) {
            addCriterion("TNM <>", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmGreaterThan(Integer value) {
            addCriterion("TNM >", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TNM >=", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmLessThan(Integer value) {
            addCriterion("TNM <", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmLessThanOrEqualTo(Integer value) {
            addCriterion("TNM <=", value, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmIn(List<Integer> values) {
            addCriterion("TNM in", values, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmNotIn(List<Integer> values) {
            addCriterion("TNM not in", values, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmBetween(Integer value1, Integer value2) {
            addCriterion("TNM between", value1, value2, "tnm");
            return (Criteria) this;
        }

        public Criteria andTnmNotBetween(Integer value1, Integer value2) {
            addCriterion("TNM not between", value1, value2, "tnm");
            return (Criteria) this;
        }

        public Criteria andClmIsNull() {
            addCriterion("CLM is null");
            return (Criteria) this;
        }

        public Criteria andClmIsNotNull() {
            addCriterion("CLM is not null");
            return (Criteria) this;
        }

        public Criteria andClmEqualTo(Integer value) {
            addCriterion("CLM =", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmNotEqualTo(Integer value) {
            addCriterion("CLM <>", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmGreaterThan(Integer value) {
            addCriterion("CLM >", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLM >=", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmLessThan(Integer value) {
            addCriterion("CLM <", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmLessThanOrEqualTo(Integer value) {
            addCriterion("CLM <=", value, "clm");
            return (Criteria) this;
        }

        public Criteria andClmIn(List<Integer> values) {
            addCriterion("CLM in", values, "clm");
            return (Criteria) this;
        }

        public Criteria andClmNotIn(List<Integer> values) {
            addCriterion("CLM not in", values, "clm");
            return (Criteria) this;
        }

        public Criteria andClmBetween(Integer value1, Integer value2) {
            addCriterion("CLM between", value1, value2, "clm");
            return (Criteria) this;
        }

        public Criteria andClmNotBetween(Integer value1, Integer value2) {
            addCriterion("CLM not between", value1, value2, "clm");
            return (Criteria) this;
        }

        public Criteria andPrdIsNull() {
            addCriterion("PRD is null");
            return (Criteria) this;
        }

        public Criteria andPrdIsNotNull() {
            addCriterion("PRD is not null");
            return (Criteria) this;
        }

        public Criteria andPrdEqualTo(Short value) {
            addCriterion("PRD =", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdNotEqualTo(Short value) {
            addCriterion("PRD <>", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdGreaterThan(Short value) {
            addCriterion("PRD >", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdGreaterThanOrEqualTo(Short value) {
            addCriterion("PRD >=", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdLessThan(Short value) {
            addCriterion("PRD <", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdLessThanOrEqualTo(Short value) {
            addCriterion("PRD <=", value, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdIn(List<Short> values) {
            addCriterion("PRD in", values, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdNotIn(List<Short> values) {
            addCriterion("PRD not in", values, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdBetween(Short value1, Short value2) {
            addCriterion("PRD between", value1, value2, "prd");
            return (Criteria) this;
        }

        public Criteria andPrdNotBetween(Short value1, Short value2) {
            addCriterion("PRD not between", value1, value2, "prd");
            return (Criteria) this;
        }

        public Criteria andComBlaIsNull() {
            addCriterion("COM_BLA is null");
            return (Criteria) this;
        }

        public Criteria andComBlaIsNotNull() {
            addCriterion("COM_BLA is not null");
            return (Criteria) this;
        }

        public Criteria andComBlaEqualTo(String value) {
            addCriterion("COM_BLA =", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaNotEqualTo(String value) {
            addCriterion("COM_BLA <>", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaGreaterThan(String value) {
            addCriterion("COM_BLA >", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaGreaterThanOrEqualTo(String value) {
            addCriterion("COM_BLA >=", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaLessThan(String value) {
            addCriterion("COM_BLA <", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaLessThanOrEqualTo(String value) {
            addCriterion("COM_BLA <=", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaLike(String value) {
            addCriterion("COM_BLA like", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaNotLike(String value) {
            addCriterion("COM_BLA not like", value, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaIn(List<String> values) {
            addCriterion("COM_BLA in", values, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaNotIn(List<String> values) {
            addCriterion("COM_BLA not in", values, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaBetween(String value1, String value2) {
            addCriterion("COM_BLA between", value1, value2, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBlaNotBetween(String value1, String value2) {
            addCriterion("COM_BLA not between", value1, value2, "comBla");
            return (Criteria) this;
        }

        public Criteria andComBldIsNull() {
            addCriterion("COM_BLD is null");
            return (Criteria) this;
        }

        public Criteria andComBldIsNotNull() {
            addCriterion("COM_BLD is not null");
            return (Criteria) this;
        }

        public Criteria andComBldEqualTo(String value) {
            addCriterion("COM_BLD =", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldNotEqualTo(String value) {
            addCriterion("COM_BLD <>", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldGreaterThan(String value) {
            addCriterion("COM_BLD >", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldGreaterThanOrEqualTo(String value) {
            addCriterion("COM_BLD >=", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldLessThan(String value) {
            addCriterion("COM_BLD <", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldLessThanOrEqualTo(String value) {
            addCriterion("COM_BLD <=", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldLike(String value) {
            addCriterion("COM_BLD like", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldNotLike(String value) {
            addCriterion("COM_BLD not like", value, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldIn(List<String> values) {
            addCriterion("COM_BLD in", values, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldNotIn(List<String> values) {
            addCriterion("COM_BLD not in", values, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldBetween(String value1, String value2) {
            addCriterion("COM_BLD between", value1, value2, "comBld");
            return (Criteria) this;
        }

        public Criteria andComBldNotBetween(String value1, String value2) {
            addCriterion("COM_BLD not between", value1, value2, "comBld");
            return (Criteria) this;
        }

        public Criteria andComNameIsNull() {
            addCriterion("COM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andComNameIsNotNull() {
            addCriterion("COM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andComNameEqualTo(String value) {
            addCriterion("COM_NAME =", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotEqualTo(String value) {
            addCriterion("COM_NAME <>", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThan(String value) {
            addCriterion("COM_NAME >", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameGreaterThanOrEqualTo(String value) {
            addCriterion("COM_NAME >=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThan(String value) {
            addCriterion("COM_NAME <", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLessThanOrEqualTo(String value) {
            addCriterion("COM_NAME <=", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameLike(String value) {
            addCriterion("COM_NAME like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotLike(String value) {
            addCriterion("COM_NAME not like", value, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameIn(List<String> values) {
            addCriterion("COM_NAME in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotIn(List<String> values) {
            addCriterion("COM_NAME not in", values, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameBetween(String value1, String value2) {
            addCriterion("COM_NAME between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComNameNotBetween(String value1, String value2) {
            addCriterion("COM_NAME not between", value1, value2, "comName");
            return (Criteria) this;
        }

        public Criteria andComTypeIsNull() {
            addCriterion("COM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andComTypeIsNotNull() {
            addCriterion("COM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComTypeEqualTo(String value) {
            addCriterion("COM_TYPE =", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotEqualTo(String value) {
            addCriterion("COM_TYPE <>", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeGreaterThan(String value) {
            addCriterion("COM_TYPE >", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COM_TYPE >=", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeLessThan(String value) {
            addCriterion("COM_TYPE <", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeLessThanOrEqualTo(String value) {
            addCriterion("COM_TYPE <=", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeLike(String value) {
            addCriterion("COM_TYPE like", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotLike(String value) {
            addCriterion("COM_TYPE not like", value, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeIn(List<String> values) {
            addCriterion("COM_TYPE in", values, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotIn(List<String> values) {
            addCriterion("COM_TYPE not in", values, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeBetween(String value1, String value2) {
            addCriterion("COM_TYPE between", value1, value2, "comType");
            return (Criteria) this;
        }

        public Criteria andComTypeNotBetween(String value1, String value2) {
            addCriterion("COM_TYPE not between", value1, value2, "comType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNull() {
            addCriterion("CUSTOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNotNull() {
            addCriterion("CUSTOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeEqualTo(String value) {
            addCriterion("CUSTOM_TYPE =", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <>", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThan(String value) {
            addCriterion("CUSTOM_TYPE >", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE >=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThan(String value) {
            addCriterion("CUSTOM_TYPE <", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLike(String value) {
            addCriterion("CUSTOM_TYPE like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotLike(String value) {
            addCriterion("CUSTOM_TYPE not like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIn(List<String> values) {
            addCriterion("CUSTOM_TYPE in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotIn(List<String> values) {
            addCriterion("CUSTOM_TYPE not in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE not between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyIsNull() {
            addCriterion("FACT_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyIsNotNull() {
            addCriterion("FACT_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyEqualTo(String value) {
            addCriterion("FACT_CURRENCY =", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyNotEqualTo(String value) {
            addCriterion("FACT_CURRENCY <>", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyGreaterThan(String value) {
            addCriterion("FACT_CURRENCY >", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("FACT_CURRENCY >=", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyLessThan(String value) {
            addCriterion("FACT_CURRENCY <", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyLessThanOrEqualTo(String value) {
            addCriterion("FACT_CURRENCY <=", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyLike(String value) {
            addCriterion("FACT_CURRENCY like", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyNotLike(String value) {
            addCriterion("FACT_CURRENCY not like", value, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyIn(List<String> values) {
            addCriterion("FACT_CURRENCY in", values, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyNotIn(List<String> values) {
            addCriterion("FACT_CURRENCY not in", values, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyBetween(String value1, String value2) {
            addCriterion("FACT_CURRENCY between", value1, value2, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactCurrencyNotBetween(String value1, String value2) {
            addCriterion("FACT_CURRENCY not between", value1, value2, "factCurrency");
            return (Criteria) this;
        }

        public Criteria andFactMoneyIsNull() {
            addCriterion("FACT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andFactMoneyIsNotNull() {
            addCriterion("FACT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andFactMoneyEqualTo(BigDecimal value) {
            addCriterion("FACT_MONEY =", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyNotEqualTo(BigDecimal value) {
            addCriterion("FACT_MONEY <>", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyGreaterThan(BigDecimal value) {
            addCriterion("FACT_MONEY >", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_MONEY >=", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyLessThan(BigDecimal value) {
            addCriterion("FACT_MONEY <", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_MONEY <=", value, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyIn(List<BigDecimal> values) {
            addCriterion("FACT_MONEY in", values, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyNotIn(List<BigDecimal> values) {
            addCriterion("FACT_MONEY not in", values, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_MONEY between", value1, value2, "factMoney");
            return (Criteria) this;
        }

        public Criteria andFactMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_MONEY not between", value1, value2, "factMoney");
            return (Criteria) this;
        }

        public Criteria andCollectDateIsNull() {
            addCriterion("COLLECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCollectDateIsNotNull() {
            addCriterion("COLLECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCollectDateEqualTo(Integer value) {
            addCriterion("COLLECT_DATE =", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotEqualTo(Integer value) {
            addCriterion("COLLECT_DATE <>", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateGreaterThan(Integer value) {
            addCriterion("COLLECT_DATE >", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLLECT_DATE >=", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateLessThan(Integer value) {
            addCriterion("COLLECT_DATE <", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateLessThanOrEqualTo(Integer value) {
            addCriterion("COLLECT_DATE <=", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateIn(List<Integer> values) {
            addCriterion("COLLECT_DATE in", values, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotIn(List<Integer> values) {
            addCriterion("COLLECT_DATE not in", values, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateBetween(Integer value1, Integer value2) {
            addCriterion("COLLECT_DATE between", value1, value2, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotBetween(Integer value1, Integer value2) {
            addCriterion("COLLECT_DATE not between", value1, value2, "collectDate");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andReviMoneyIsNull() {
            addCriterion("REVI_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andReviMoneyIsNotNull() {
            addCriterion("REVI_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReviMoneyEqualTo(BigDecimal value) {
            addCriterion("REVI_MONEY =", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyNotEqualTo(BigDecimal value) {
            addCriterion("REVI_MONEY <>", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyGreaterThan(BigDecimal value) {
            addCriterion("REVI_MONEY >", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVI_MONEY >=", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyLessThan(BigDecimal value) {
            addCriterion("REVI_MONEY <", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVI_MONEY <=", value, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyIn(List<BigDecimal> values) {
            addCriterion("REVI_MONEY in", values, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyNotIn(List<BigDecimal> values) {
            addCriterion("REVI_MONEY not in", values, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVI_MONEY between", value1, value2, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andReviMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVI_MONEY not between", value1, value2, "reviMoney");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("UPDATE_DATE like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("UPDATE_DATE not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNull() {
            addCriterion("TRANSFER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNotNull() {
            addCriterion("TRANSFER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDateEqualTo(String value) {
            addCriterion("TRANSFER_DATE =", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotEqualTo(String value) {
            addCriterion("TRANSFER_DATE <>", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThan(String value) {
            addCriterion("TRANSFER_DATE >", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_DATE >=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThan(String value) {
            addCriterion("TRANSFER_DATE <", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_DATE <=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLike(String value) {
            addCriterion("TRANSFER_DATE like", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotLike(String value) {
            addCriterion("TRANSFER_DATE not like", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateIn(List<String> values) {
            addCriterion("TRANSFER_DATE in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotIn(List<String> values) {
            addCriterion("TRANSFER_DATE not in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateBetween(String value1, String value2) {
            addCriterion("TRANSFER_DATE between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_DATE not between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcIsNull() {
            addCriterion("REVI_RECE_SRC is null");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcIsNotNull() {
            addCriterion("REVI_RECE_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcEqualTo(String value) {
            addCriterion("REVI_RECE_SRC =", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcNotEqualTo(String value) {
            addCriterion("REVI_RECE_SRC <>", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcGreaterThan(String value) {
            addCriterion("REVI_RECE_SRC >", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcGreaterThanOrEqualTo(String value) {
            addCriterion("REVI_RECE_SRC >=", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcLessThan(String value) {
            addCriterion("REVI_RECE_SRC <", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcLessThanOrEqualTo(String value) {
            addCriterion("REVI_RECE_SRC <=", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcLike(String value) {
            addCriterion("REVI_RECE_SRC like", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcNotLike(String value) {
            addCriterion("REVI_RECE_SRC not like", value, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcIn(List<String> values) {
            addCriterion("REVI_RECE_SRC in", values, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcNotIn(List<String> values) {
            addCriterion("REVI_RECE_SRC not in", values, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcBetween(String value1, String value2) {
            addCriterion("REVI_RECE_SRC between", value1, value2, "reviReceSrc");
            return (Criteria) this;
        }

        public Criteria andReviReceSrcNotBetween(String value1, String value2) {
            addCriterion("REVI_RECE_SRC not between", value1, value2, "reviReceSrc");
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