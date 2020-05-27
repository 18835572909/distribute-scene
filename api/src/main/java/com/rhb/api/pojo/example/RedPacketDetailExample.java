package com.rhb.api.pojo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketDetailExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRedIdIsNull() {
            addCriterion("red_id is null");
            return (Criteria) this;
        }

        public Criteria andRedIdIsNotNull() {
            addCriterion("red_id is not null");
            return (Criteria) this;
        }

        public Criteria andRedIdEqualTo(String value) {
            addCriterion("red_id =", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdNotEqualTo(String value) {
            addCriterion("red_id <>", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdGreaterThan(String value) {
            addCriterion("red_id >", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdGreaterThanOrEqualTo(String value) {
            addCriterion("red_id >=", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdLessThan(String value) {
            addCriterion("red_id <", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdLessThanOrEqualTo(String value) {
            addCriterion("red_id <=", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdLike(String value) {
            addCriterion("red_id like", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdNotLike(String value) {
            addCriterion("red_id not like", value, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdIn(List<String> values) {
            addCriterion("red_id in", values, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdNotIn(List<String> values) {
            addCriterion("red_id not in", values, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdBetween(String value1, String value2) {
            addCriterion("red_id between", value1, value2, "redId");
            return (Criteria) this;
        }

        public Criteria andRedIdNotBetween(String value1, String value2) {
            addCriterion("red_id not between", value1, value2, "redId");
            return (Criteria) this;
        }

        public Criteria andRedAmountIsNull() {
            addCriterion("red_amount is null");
            return (Criteria) this;
        }

        public Criteria andRedAmountIsNotNull() {
            addCriterion("red_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRedAmountEqualTo(Float value) {
            addCriterion("red_amount =", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountNotEqualTo(Float value) {
            addCriterion("red_amount <>", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountGreaterThan(Float value) {
            addCriterion("red_amount >", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("red_amount >=", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountLessThan(Float value) {
            addCriterion("red_amount <", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountLessThanOrEqualTo(Float value) {
            addCriterion("red_amount <=", value, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountIn(List<Float> values) {
            addCriterion("red_amount in", values, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountNotIn(List<Float> values) {
            addCriterion("red_amount not in", values, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountBetween(Float value1, Float value2) {
            addCriterion("red_amount between", value1, value2, "redAmount");
            return (Criteria) this;
        }

        public Criteria andRedAmountNotBetween(Float value1, Float value2) {
            addCriterion("red_amount not between", value1, value2, "redAmount");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("optime is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("optime is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(Date value) {
            addCriterion("optime =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(Date value) {
            addCriterion("optime <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(Date value) {
            addCriterion("optime >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optime >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(Date value) {
            addCriterion("optime <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(Date value) {
            addCriterion("optime <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(List<Date> values) {
            addCriterion("optime in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(List<Date> values) {
            addCriterion("optime not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(Date value1, Date value2) {
            addCriterion("optime between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(Date value1, Date value2) {
            addCriterion("optime not between", value1, value2, "optime");
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

    public static class RedPacketRobExample {
        protected String orderByClause;

        protected boolean distinct;

        protected List<Criteria> oredCriteria;

        public RedPacketRobExample() {
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
                addCriterion("id is null");
                return (Criteria) this;
            }

            public Criteria andIdIsNotNull() {
                addCriterion("id is not null");
                return (Criteria) this;
            }

            public Criteria andIdEqualTo(Long value) {
                addCriterion("id =", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Long value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Long value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Long value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Long value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Long value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

            public Criteria andIdIn(List<Long> values) {
                addCriterion("id in", values, "id");
                return (Criteria) this;
            }

            public Criteria andIdNotIn(List<Long> values) {
                addCriterion("id not in", values, "id");
                return (Criteria) this;
            }

            public Criteria andIdBetween(Long value1, Long value2) {
                addCriterion("id between", value1, value2, "id");
                return (Criteria) this;
            }

            public Criteria andIdNotBetween(Long value1, Long value2) {
                addCriterion("id not between", value1, value2, "id");
                return (Criteria) this;
            }

            public Criteria andRedIdIsNull() {
                addCriterion("red_id is null");
                return (Criteria) this;
            }

            public Criteria andRedIdIsNotNull() {
                addCriterion("red_id is not null");
                return (Criteria) this;
            }

            public Criteria andRedIdEqualTo(String value) {
                addCriterion("red_id =", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdNotEqualTo(String value) {
                addCriterion("red_id <>", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdGreaterThan(String value) {
                addCriterion("red_id >", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdGreaterThanOrEqualTo(String value) {
                addCriterion("red_id >=", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdLessThan(String value) {
                addCriterion("red_id <", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdLessThanOrEqualTo(String value) {
                addCriterion("red_id <=", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdLike(String value) {
                addCriterion("red_id like", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdNotLike(String value) {
                addCriterion("red_id not like", value, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdIn(List<String> values) {
                addCriterion("red_id in", values, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdNotIn(List<String> values) {
                addCriterion("red_id not in", values, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdBetween(String value1, String value2) {
                addCriterion("red_id between", value1, value2, "redId");
                return (Criteria) this;
            }

            public Criteria andRedIdNotBetween(String value1, String value2) {
                addCriterion("red_id not between", value1, value2, "redId");
                return (Criteria) this;
            }

            public Criteria andUserIdIsNull() {
                addCriterion("user_id is null");
                return (Criteria) this;
            }

            public Criteria andUserIdIsNotNull() {
                addCriterion("user_id is not null");
                return (Criteria) this;
            }

            public Criteria andUserIdEqualTo(Long value) {
                addCriterion("user_id =", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdNotEqualTo(Long value) {
                addCriterion("user_id <>", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThan(Long value) {
                addCriterion("user_id >", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
                addCriterion("user_id >=", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdLessThan(Long value) {
                addCriterion("user_id <", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdLessThanOrEqualTo(Long value) {
                addCriterion("user_id <=", value, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdIn(List<Long> values) {
                addCriterion("user_id in", values, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdNotIn(List<Long> values) {
                addCriterion("user_id not in", values, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdBetween(Long value1, Long value2) {
                addCriterion("user_id between", value1, value2, "userId");
                return (Criteria) this;
            }

            public Criteria andUserIdNotBetween(Long value1, Long value2) {
                addCriterion("user_id not between", value1, value2, "userId");
                return (Criteria) this;
            }

            public Criteria andRedAmountIsNull() {
                addCriterion("red_amount is null");
                return (Criteria) this;
            }

            public Criteria andRedAmountIsNotNull() {
                addCriterion("red_amount is not null");
                return (Criteria) this;
            }

            public Criteria andRedAmountEqualTo(Long value) {
                addCriterion("red_amount =", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountNotEqualTo(Long value) {
                addCriterion("red_amount <>", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountGreaterThan(Long value) {
                addCriterion("red_amount >", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountGreaterThanOrEqualTo(Long value) {
                addCriterion("red_amount >=", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountLessThan(Long value) {
                addCriterion("red_amount <", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountLessThanOrEqualTo(Long value) {
                addCriterion("red_amount <=", value, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountIn(List<Long> values) {
                addCriterion("red_amount in", values, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountNotIn(List<Long> values) {
                addCriterion("red_amount not in", values, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountBetween(Long value1, Long value2) {
                addCriterion("red_amount between", value1, value2, "redAmount");
                return (Criteria) this;
            }

            public Criteria andRedAmountNotBetween(Long value1, Long value2) {
                addCriterion("red_amount not between", value1, value2, "redAmount");
                return (Criteria) this;
            }

            public Criteria andIsActiveIsNull() {
                addCriterion("is_active is null");
                return (Criteria) this;
            }

            public Criteria andIsActiveIsNotNull() {
                addCriterion("is_active is not null");
                return (Criteria) this;
            }

            public Criteria andIsActiveEqualTo(Boolean value) {
                addCriterion("is_active =", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveNotEqualTo(Boolean value) {
                addCriterion("is_active <>", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveGreaterThan(Boolean value) {
                addCriterion("is_active >", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
                addCriterion("is_active >=", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveLessThan(Boolean value) {
                addCriterion("is_active <", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
                addCriterion("is_active <=", value, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveIn(List<Boolean> values) {
                addCriterion("is_active in", values, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveNotIn(List<Boolean> values) {
                addCriterion("is_active not in", values, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
                addCriterion("is_active between", value1, value2, "isActive");
                return (Criteria) this;
            }

            public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
                addCriterion("is_active not between", value1, value2, "isActive");
                return (Criteria) this;
            }

            public Criteria andOptimeIsNull() {
                addCriterion("optime is null");
                return (Criteria) this;
            }

            public Criteria andOptimeIsNotNull() {
                addCriterion("optime is not null");
                return (Criteria) this;
            }

            public Criteria andOptimeEqualTo(Date value) {
                addCriterion("optime =", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeNotEqualTo(Date value) {
                addCriterion("optime <>", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeGreaterThan(Date value) {
                addCriterion("optime >", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeGreaterThanOrEqualTo(Date value) {
                addCriterion("optime >=", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeLessThan(Date value) {
                addCriterion("optime <", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeLessThanOrEqualTo(Date value) {
                addCriterion("optime <=", value, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeIn(List<Date> values) {
                addCriterion("optime in", values, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeNotIn(List<Date> values) {
                addCriterion("optime not in", values, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeBetween(Date value1, Date value2) {
                addCriterion("optime between", value1, value2, "optime");
                return (Criteria) this;
            }

            public Criteria andOptimeNotBetween(Date value1, Date value2) {
                addCriterion("optime not between", value1, value2, "optime");
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
}