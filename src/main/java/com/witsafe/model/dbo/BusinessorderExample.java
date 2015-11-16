package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessorderExample() {
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

        public Criteria andBorderidIsNull() {
            addCriterion("BOrderID is null");
            return (Criteria) this;
        }

        public Criteria andBorderidIsNotNull() {
            addCriterion("BOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andBorderidEqualTo(Integer value) {
            addCriterion("BOrderID =", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidNotEqualTo(Integer value) {
            addCriterion("BOrderID <>", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidGreaterThan(Integer value) {
            addCriterion("BOrderID >", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOrderID >=", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidLessThan(Integer value) {
            addCriterion("BOrderID <", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidLessThanOrEqualTo(Integer value) {
            addCriterion("BOrderID <=", value, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidIn(List<Integer> values) {
            addCriterion("BOrderID in", values, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidNotIn(List<Integer> values) {
            addCriterion("BOrderID not in", values, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidBetween(Integer value1, Integer value2) {
            addCriterion("BOrderID between", value1, value2, "borderid");
            return (Criteria) this;
        }

        public Criteria andBorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("BOrderID not between", value1, value2, "borderid");
            return (Criteria) this;
        }

        public Criteria andBordertnmameIsNull() {
            addCriterion("BOrderTNmame is null");
            return (Criteria) this;
        }

        public Criteria andBordertnmameIsNotNull() {
            addCriterion("BOrderTNmame is not null");
            return (Criteria) this;
        }

        public Criteria andBordertnmameEqualTo(String value) {
            addCriterion("BOrderTNmame =", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameNotEqualTo(String value) {
            addCriterion("BOrderTNmame <>", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameGreaterThan(String value) {
            addCriterion("BOrderTNmame >", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameGreaterThanOrEqualTo(String value) {
            addCriterion("BOrderTNmame >=", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameLessThan(String value) {
            addCriterion("BOrderTNmame <", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameLessThanOrEqualTo(String value) {
            addCriterion("BOrderTNmame <=", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameLike(String value) {
            addCriterion("BOrderTNmame like", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameNotLike(String value) {
            addCriterion("BOrderTNmame not like", value, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameIn(List<String> values) {
            addCriterion("BOrderTNmame in", values, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameNotIn(List<String> values) {
            addCriterion("BOrderTNmame not in", values, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameBetween(String value1, String value2) {
            addCriterion("BOrderTNmame between", value1, value2, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andBordertnmameNotBetween(String value1, String value2) {
            addCriterion("BOrderTNmame not between", value1, value2, "bordertnmame");
            return (Criteria) this;
        }

        public Criteria andXh1IsNull() {
            addCriterion("XH1 is null");
            return (Criteria) this;
        }

        public Criteria andXh1IsNotNull() {
            addCriterion("XH1 is not null");
            return (Criteria) this;
        }

        public Criteria andXh1EqualTo(String value) {
            addCriterion("XH1 =", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1NotEqualTo(String value) {
            addCriterion("XH1 <>", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1GreaterThan(String value) {
            addCriterion("XH1 >", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1GreaterThanOrEqualTo(String value) {
            addCriterion("XH1 >=", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1LessThan(String value) {
            addCriterion("XH1 <", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1LessThanOrEqualTo(String value) {
            addCriterion("XH1 <=", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1Like(String value) {
            addCriterion("XH1 like", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1NotLike(String value) {
            addCriterion("XH1 not like", value, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1In(List<String> values) {
            addCriterion("XH1 in", values, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1NotIn(List<String> values) {
            addCriterion("XH1 not in", values, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1Between(String value1, String value2) {
            addCriterion("XH1 between", value1, value2, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh1NotBetween(String value1, String value2) {
            addCriterion("XH1 not between", value1, value2, "xh1");
            return (Criteria) this;
        }

        public Criteria andXh2IsNull() {
            addCriterion("XH2 is null");
            return (Criteria) this;
        }

        public Criteria andXh2IsNotNull() {
            addCriterion("XH2 is not null");
            return (Criteria) this;
        }

        public Criteria andXh2EqualTo(String value) {
            addCriterion("XH2 =", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2NotEqualTo(String value) {
            addCriterion("XH2 <>", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2GreaterThan(String value) {
            addCriterion("XH2 >", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2GreaterThanOrEqualTo(String value) {
            addCriterion("XH2 >=", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2LessThan(String value) {
            addCriterion("XH2 <", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2LessThanOrEqualTo(String value) {
            addCriterion("XH2 <=", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2Like(String value) {
            addCriterion("XH2 like", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2NotLike(String value) {
            addCriterion("XH2 not like", value, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2In(List<String> values) {
            addCriterion("XH2 in", values, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2NotIn(List<String> values) {
            addCriterion("XH2 not in", values, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2Between(String value1, String value2) {
            addCriterion("XH2 between", value1, value2, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh2NotBetween(String value1, String value2) {
            addCriterion("XH2 not between", value1, value2, "xh2");
            return (Criteria) this;
        }

        public Criteria andXh3IsNull() {
            addCriterion("XH3 is null");
            return (Criteria) this;
        }

        public Criteria andXh3IsNotNull() {
            addCriterion("XH3 is not null");
            return (Criteria) this;
        }

        public Criteria andXh3EqualTo(String value) {
            addCriterion("XH3 =", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3NotEqualTo(String value) {
            addCriterion("XH3 <>", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3GreaterThan(String value) {
            addCriterion("XH3 >", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3GreaterThanOrEqualTo(String value) {
            addCriterion("XH3 >=", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3LessThan(String value) {
            addCriterion("XH3 <", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3LessThanOrEqualTo(String value) {
            addCriterion("XH3 <=", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3Like(String value) {
            addCriterion("XH3 like", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3NotLike(String value) {
            addCriterion("XH3 not like", value, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3In(List<String> values) {
            addCriterion("XH3 in", values, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3NotIn(List<String> values) {
            addCriterion("XH3 not in", values, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3Between(String value1, String value2) {
            addCriterion("XH3 between", value1, value2, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh3NotBetween(String value1, String value2) {
            addCriterion("XH3 not between", value1, value2, "xh3");
            return (Criteria) this;
        }

        public Criteria andXh4IsNull() {
            addCriterion("XH4 is null");
            return (Criteria) this;
        }

        public Criteria andXh4IsNotNull() {
            addCriterion("XH4 is not null");
            return (Criteria) this;
        }

        public Criteria andXh4EqualTo(String value) {
            addCriterion("XH4 =", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4NotEqualTo(String value) {
            addCriterion("XH4 <>", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4GreaterThan(String value) {
            addCriterion("XH4 >", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4GreaterThanOrEqualTo(String value) {
            addCriterion("XH4 >=", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4LessThan(String value) {
            addCriterion("XH4 <", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4LessThanOrEqualTo(String value) {
            addCriterion("XH4 <=", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4Like(String value) {
            addCriterion("XH4 like", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4NotLike(String value) {
            addCriterion("XH4 not like", value, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4In(List<String> values) {
            addCriterion("XH4 in", values, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4NotIn(List<String> values) {
            addCriterion("XH4 not in", values, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4Between(String value1, String value2) {
            addCriterion("XH4 between", value1, value2, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh4NotBetween(String value1, String value2) {
            addCriterion("XH4 not between", value1, value2, "xh4");
            return (Criteria) this;
        }

        public Criteria andXh5IsNull() {
            addCriterion("XH5 is null");
            return (Criteria) this;
        }

        public Criteria andXh5IsNotNull() {
            addCriterion("XH5 is not null");
            return (Criteria) this;
        }

        public Criteria andXh5EqualTo(String value) {
            addCriterion("XH5 =", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5NotEqualTo(String value) {
            addCriterion("XH5 <>", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5GreaterThan(String value) {
            addCriterion("XH5 >", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5GreaterThanOrEqualTo(String value) {
            addCriterion("XH5 >=", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5LessThan(String value) {
            addCriterion("XH5 <", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5LessThanOrEqualTo(String value) {
            addCriterion("XH5 <=", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5Like(String value) {
            addCriterion("XH5 like", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5NotLike(String value) {
            addCriterion("XH5 not like", value, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5In(List<String> values) {
            addCriterion("XH5 in", values, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5NotIn(List<String> values) {
            addCriterion("XH5 not in", values, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5Between(String value1, String value2) {
            addCriterion("XH5 between", value1, value2, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh5NotBetween(String value1, String value2) {
            addCriterion("XH5 not between", value1, value2, "xh5");
            return (Criteria) this;
        }

        public Criteria andXh6IsNull() {
            addCriterion("XH6 is null");
            return (Criteria) this;
        }

        public Criteria andXh6IsNotNull() {
            addCriterion("XH6 is not null");
            return (Criteria) this;
        }

        public Criteria andXh6EqualTo(Date value) {
            addCriterion("XH6 =", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6NotEqualTo(Date value) {
            addCriterion("XH6 <>", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6GreaterThan(Date value) {
            addCriterion("XH6 >", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6GreaterThanOrEqualTo(Date value) {
            addCriterion("XH6 >=", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6LessThan(Date value) {
            addCriterion("XH6 <", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6LessThanOrEqualTo(Date value) {
            addCriterion("XH6 <=", value, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6In(List<Date> values) {
            addCriterion("XH6 in", values, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6NotIn(List<Date> values) {
            addCriterion("XH6 not in", values, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6Between(Date value1, Date value2) {
            addCriterion("XH6 between", value1, value2, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh6NotBetween(Date value1, Date value2) {
            addCriterion("XH6 not between", value1, value2, "xh6");
            return (Criteria) this;
        }

        public Criteria andXh7IsNull() {
            addCriterion("XH7 is null");
            return (Criteria) this;
        }

        public Criteria andXh7IsNotNull() {
            addCriterion("XH7 is not null");
            return (Criteria) this;
        }

        public Criteria andXh7EqualTo(String value) {
            addCriterion("XH7 =", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7NotEqualTo(String value) {
            addCriterion("XH7 <>", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7GreaterThan(String value) {
            addCriterion("XH7 >", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7GreaterThanOrEqualTo(String value) {
            addCriterion("XH7 >=", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7LessThan(String value) {
            addCriterion("XH7 <", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7LessThanOrEqualTo(String value) {
            addCriterion("XH7 <=", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7Like(String value) {
            addCriterion("XH7 like", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7NotLike(String value) {
            addCriterion("XH7 not like", value, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7In(List<String> values) {
            addCriterion("XH7 in", values, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7NotIn(List<String> values) {
            addCriterion("XH7 not in", values, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7Between(String value1, String value2) {
            addCriterion("XH7 between", value1, value2, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh7NotBetween(String value1, String value2) {
            addCriterion("XH7 not between", value1, value2, "xh7");
            return (Criteria) this;
        }

        public Criteria andXh8IsNull() {
            addCriterion("XH8 is null");
            return (Criteria) this;
        }

        public Criteria andXh8IsNotNull() {
            addCriterion("XH8 is not null");
            return (Criteria) this;
        }

        public Criteria andXh8EqualTo(String value) {
            addCriterion("XH8 =", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8NotEqualTo(String value) {
            addCriterion("XH8 <>", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8GreaterThan(String value) {
            addCriterion("XH8 >", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8GreaterThanOrEqualTo(String value) {
            addCriterion("XH8 >=", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8LessThan(String value) {
            addCriterion("XH8 <", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8LessThanOrEqualTo(String value) {
            addCriterion("XH8 <=", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8Like(String value) {
            addCriterion("XH8 like", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8NotLike(String value) {
            addCriterion("XH8 not like", value, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8In(List<String> values) {
            addCriterion("XH8 in", values, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8NotIn(List<String> values) {
            addCriterion("XH8 not in", values, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8Between(String value1, String value2) {
            addCriterion("XH8 between", value1, value2, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh8NotBetween(String value1, String value2) {
            addCriterion("XH8 not between", value1, value2, "xh8");
            return (Criteria) this;
        }

        public Criteria andXh9IsNull() {
            addCriterion("XH9 is null");
            return (Criteria) this;
        }

        public Criteria andXh9IsNotNull() {
            addCriterion("XH9 is not null");
            return (Criteria) this;
        }

        public Criteria andXh9EqualTo(String value) {
            addCriterion("XH9 =", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9NotEqualTo(String value) {
            addCriterion("XH9 <>", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9GreaterThan(String value) {
            addCriterion("XH9 >", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9GreaterThanOrEqualTo(String value) {
            addCriterion("XH9 >=", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9LessThan(String value) {
            addCriterion("XH9 <", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9LessThanOrEqualTo(String value) {
            addCriterion("XH9 <=", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9Like(String value) {
            addCriterion("XH9 like", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9NotLike(String value) {
            addCriterion("XH9 not like", value, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9In(List<String> values) {
            addCriterion("XH9 in", values, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9NotIn(List<String> values) {
            addCriterion("XH9 not in", values, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9Between(String value1, String value2) {
            addCriterion("XH9 between", value1, value2, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh9NotBetween(String value1, String value2) {
            addCriterion("XH9 not between", value1, value2, "xh9");
            return (Criteria) this;
        }

        public Criteria andXh10IsNull() {
            addCriterion("XH10 is null");
            return (Criteria) this;
        }

        public Criteria andXh10IsNotNull() {
            addCriterion("XH10 is not null");
            return (Criteria) this;
        }

        public Criteria andXh10EqualTo(String value) {
            addCriterion("XH10 =", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10NotEqualTo(String value) {
            addCriterion("XH10 <>", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10GreaterThan(String value) {
            addCriterion("XH10 >", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10GreaterThanOrEqualTo(String value) {
            addCriterion("XH10 >=", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10LessThan(String value) {
            addCriterion("XH10 <", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10LessThanOrEqualTo(String value) {
            addCriterion("XH10 <=", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10Like(String value) {
            addCriterion("XH10 like", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10NotLike(String value) {
            addCriterion("XH10 not like", value, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10In(List<String> values) {
            addCriterion("XH10 in", values, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10NotIn(List<String> values) {
            addCriterion("XH10 not in", values, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10Between(String value1, String value2) {
            addCriterion("XH10 between", value1, value2, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh10NotBetween(String value1, String value2) {
            addCriterion("XH10 not between", value1, value2, "xh10");
            return (Criteria) this;
        }

        public Criteria andXh11IsNull() {
            addCriterion("XH11 is null");
            return (Criteria) this;
        }

        public Criteria andXh11IsNotNull() {
            addCriterion("XH11 is not null");
            return (Criteria) this;
        }

        public Criteria andXh11EqualTo(String value) {
            addCriterion("XH11 =", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11NotEqualTo(String value) {
            addCriterion("XH11 <>", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11GreaterThan(String value) {
            addCriterion("XH11 >", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11GreaterThanOrEqualTo(String value) {
            addCriterion("XH11 >=", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11LessThan(String value) {
            addCriterion("XH11 <", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11LessThanOrEqualTo(String value) {
            addCriterion("XH11 <=", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11Like(String value) {
            addCriterion("XH11 like", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11NotLike(String value) {
            addCriterion("XH11 not like", value, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11In(List<String> values) {
            addCriterion("XH11 in", values, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11NotIn(List<String> values) {
            addCriterion("XH11 not in", values, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11Between(String value1, String value2) {
            addCriterion("XH11 between", value1, value2, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh11NotBetween(String value1, String value2) {
            addCriterion("XH11 not between", value1, value2, "xh11");
            return (Criteria) this;
        }

        public Criteria andXh12IsNull() {
            addCriterion("XH12 is null");
            return (Criteria) this;
        }

        public Criteria andXh12IsNotNull() {
            addCriterion("XH12 is not null");
            return (Criteria) this;
        }

        public Criteria andXh12EqualTo(String value) {
            addCriterion("XH12 =", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12NotEqualTo(String value) {
            addCriterion("XH12 <>", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12GreaterThan(String value) {
            addCriterion("XH12 >", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12GreaterThanOrEqualTo(String value) {
            addCriterion("XH12 >=", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12LessThan(String value) {
            addCriterion("XH12 <", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12LessThanOrEqualTo(String value) {
            addCriterion("XH12 <=", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12Like(String value) {
            addCriterion("XH12 like", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12NotLike(String value) {
            addCriterion("XH12 not like", value, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12In(List<String> values) {
            addCriterion("XH12 in", values, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12NotIn(List<String> values) {
            addCriterion("XH12 not in", values, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12Between(String value1, String value2) {
            addCriterion("XH12 between", value1, value2, "xh12");
            return (Criteria) this;
        }

        public Criteria andXh12NotBetween(String value1, String value2) {
            addCriterion("XH12 not between", value1, value2, "xh12");
            return (Criteria) this;
        }

        public Criteria andXhdateIsNull() {
            addCriterion("XHDate is null");
            return (Criteria) this;
        }

        public Criteria andXhdateIsNotNull() {
            addCriterion("XHDate is not null");
            return (Criteria) this;
        }

        public Criteria andXhdateEqualTo(Date value) {
            addCriterion("XHDate =", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateNotEqualTo(Date value) {
            addCriterion("XHDate <>", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateGreaterThan(Date value) {
            addCriterion("XHDate >", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateGreaterThanOrEqualTo(Date value) {
            addCriterion("XHDate >=", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateLessThan(Date value) {
            addCriterion("XHDate <", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateLessThanOrEqualTo(Date value) {
            addCriterion("XHDate <=", value, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateIn(List<Date> values) {
            addCriterion("XHDate in", values, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateNotIn(List<Date> values) {
            addCriterion("XHDate not in", values, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateBetween(Date value1, Date value2) {
            addCriterion("XHDate between", value1, value2, "xhdate");
            return (Criteria) this;
        }

        public Criteria andXhdateNotBetween(Date value1, Date value2) {
            addCriterion("XHDate not between", value1, value2, "xhdate");
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