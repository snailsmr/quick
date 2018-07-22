package com.yhc.quick.pojo;

import java.util.ArrayList;
import java.util.List;

public class Word11Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Word11Example() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(String value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(String value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(String value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(String value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(String value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(String value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLike(String value) {
            addCriterion("topic_id like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotLike(String value) {
            addCriterion("topic_id not like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<String> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<String> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(String value1, String value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(String value1, String value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andPhonIsNull() {
            addCriterion("phon is null");
            return (Criteria) this;
        }

        public Criteria andPhonIsNotNull() {
            addCriterion("phon is not null");
            return (Criteria) this;
        }

        public Criteria andPhonEqualTo(String value) {
            addCriterion("phon =", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonNotEqualTo(String value) {
            addCriterion("phon <>", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonGreaterThan(String value) {
            addCriterion("phon >", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonGreaterThanOrEqualTo(String value) {
            addCriterion("phon >=", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonLessThan(String value) {
            addCriterion("phon <", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonLessThanOrEqualTo(String value) {
            addCriterion("phon <=", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonLike(String value) {
            addCriterion("phon like", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonNotLike(String value) {
            addCriterion("phon not like", value, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonIn(List<String> values) {
            addCriterion("phon in", values, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonNotIn(List<String> values) {
            addCriterion("phon not in", values, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonBetween(String value1, String value2) {
            addCriterion("phon between", value1, value2, "phon");
            return (Criteria) this;
        }

        public Criteria andPhonNotBetween(String value1, String value2) {
            addCriterion("phon not between", value1, value2, "phon");
            return (Criteria) this;
        }

        public Criteria andPronIsNull() {
            addCriterion("pron is null");
            return (Criteria) this;
        }

        public Criteria andPronIsNotNull() {
            addCriterion("pron is not null");
            return (Criteria) this;
        }

        public Criteria andPronEqualTo(String value) {
            addCriterion("pron =", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronNotEqualTo(String value) {
            addCriterion("pron <>", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronGreaterThan(String value) {
            addCriterion("pron >", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronGreaterThanOrEqualTo(String value) {
            addCriterion("pron >=", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronLessThan(String value) {
            addCriterion("pron <", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronLessThanOrEqualTo(String value) {
            addCriterion("pron <=", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronLike(String value) {
            addCriterion("pron like", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronNotLike(String value) {
            addCriterion("pron not like", value, "pron");
            return (Criteria) this;
        }

        public Criteria andPronIn(List<String> values) {
            addCriterion("pron in", values, "pron");
            return (Criteria) this;
        }

        public Criteria andPronNotIn(List<String> values) {
            addCriterion("pron not in", values, "pron");
            return (Criteria) this;
        }

        public Criteria andPronBetween(String value1, String value2) {
            addCriterion("pron between", value1, value2, "pron");
            return (Criteria) this;
        }

        public Criteria andPronNotBetween(String value1, String value2) {
            addCriterion("pron not between", value1, value2, "pron");
            return (Criteria) this;
        }

        public Criteria andParaIsNull() {
            addCriterion("para is null");
            return (Criteria) this;
        }

        public Criteria andParaIsNotNull() {
            addCriterion("para is not null");
            return (Criteria) this;
        }

        public Criteria andParaEqualTo(String value) {
            addCriterion("para =", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotEqualTo(String value) {
            addCriterion("para <>", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaGreaterThan(String value) {
            addCriterion("para >", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaGreaterThanOrEqualTo(String value) {
            addCriterion("para >=", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLessThan(String value) {
            addCriterion("para <", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLessThanOrEqualTo(String value) {
            addCriterion("para <=", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLike(String value) {
            addCriterion("para like", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotLike(String value) {
            addCriterion("para not like", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaIn(List<String> values) {
            addCriterion("para in", values, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotIn(List<String> values) {
            addCriterion("para not in", values, "para");
            return (Criteria) this;
        }

        public Criteria andParaBetween(String value1, String value2) {
            addCriterion("para between", value1, value2, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotBetween(String value1, String value2) {
            addCriterion("para not between", value1, value2, "para");
            return (Criteria) this;
        }

        public Criteria andBuildIsNull() {
            addCriterion("build is null");
            return (Criteria) this;
        }

        public Criteria andBuildIsNotNull() {
            addCriterion("build is not null");
            return (Criteria) this;
        }

        public Criteria andBuildEqualTo(String value) {
            addCriterion("build =", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildNotEqualTo(String value) {
            addCriterion("build <>", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildGreaterThan(String value) {
            addCriterion("build >", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildGreaterThanOrEqualTo(String value) {
            addCriterion("build >=", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildLessThan(String value) {
            addCriterion("build <", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildLessThanOrEqualTo(String value) {
            addCriterion("build <=", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildLike(String value) {
            addCriterion("build like", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildNotLike(String value) {
            addCriterion("build not like", value, "build");
            return (Criteria) this;
        }

        public Criteria andBuildIn(List<String> values) {
            addCriterion("build in", values, "build");
            return (Criteria) this;
        }

        public Criteria andBuildNotIn(List<String> values) {
            addCriterion("build not in", values, "build");
            return (Criteria) this;
        }

        public Criteria andBuildBetween(String value1, String value2) {
            addCriterion("build between", value1, value2, "build");
            return (Criteria) this;
        }

        public Criteria andBuildNotBetween(String value1, String value2) {
            addCriterion("build not between", value1, value2, "build");
            return (Criteria) this;
        }

        public Criteria andExampleIsNull() {
            addCriterion("example is null");
            return (Criteria) this;
        }

        public Criteria andExampleIsNotNull() {
            addCriterion("example is not null");
            return (Criteria) this;
        }

        public Criteria andExampleEqualTo(String value) {
            addCriterion("example =", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotEqualTo(String value) {
            addCriterion("example <>", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThan(String value) {
            addCriterion("example >", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThanOrEqualTo(String value) {
            addCriterion("example >=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThan(String value) {
            addCriterion("example <", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThanOrEqualTo(String value) {
            addCriterion("example <=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLike(String value) {
            addCriterion("example like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotLike(String value) {
            addCriterion("example not like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleIn(List<String> values) {
            addCriterion("example in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotIn(List<String> values) {
            addCriterion("example not in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleBetween(String value1, String value2) {
            addCriterion("example between", value1, value2, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotBetween(String value1, String value2) {
            addCriterion("example not between", value1, value2, "example");
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