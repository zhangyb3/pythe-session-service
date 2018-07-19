package com.pythe.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblTeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserimgIsNull() {
            addCriterion("userImg is null");
            return (Criteria) this;
        }

        public Criteria andUserimgIsNotNull() {
            addCriterion("userImg is not null");
            return (Criteria) this;
        }

        public Criteria andUserimgEqualTo(String value) {
            addCriterion("userImg =", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotEqualTo(String value) {
            addCriterion("userImg <>", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgGreaterThan(String value) {
            addCriterion("userImg >", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgGreaterThanOrEqualTo(String value) {
            addCriterion("userImg >=", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLessThan(String value) {
            addCriterion("userImg <", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLessThanOrEqualTo(String value) {
            addCriterion("userImg <=", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLike(String value) {
            addCriterion("userImg like", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotLike(String value) {
            addCriterion("userImg not like", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgIn(List<String> values) {
            addCriterion("userImg in", values, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotIn(List<String> values) {
            addCriterion("userImg not in", values, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgBetween(String value1, String value2) {
            addCriterion("userImg between", value1, value2, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotBetween(String value1, String value2) {
            addCriterion("userImg not between", value1, value2, "userimg");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("gradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeId =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeId <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeId >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeId >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeId <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeId <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeId in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeId not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeId between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeId not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidIsNull() {
            addCriterion("mnp1_openId is null");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidIsNotNull() {
            addCriterion("mnp1_openId is not null");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidEqualTo(String value) {
            addCriterion("mnp1_openId =", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidNotEqualTo(String value) {
            addCriterion("mnp1_openId <>", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidGreaterThan(String value) {
            addCriterion("mnp1_openId >", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidGreaterThanOrEqualTo(String value) {
            addCriterion("mnp1_openId >=", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidLessThan(String value) {
            addCriterion("mnp1_openId <", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidLessThanOrEqualTo(String value) {
            addCriterion("mnp1_openId <=", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidLike(String value) {
            addCriterion("mnp1_openId like", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidNotLike(String value) {
            addCriterion("mnp1_openId not like", value, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidIn(List<String> values) {
            addCriterion("mnp1_openId in", values, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidNotIn(List<String> values) {
            addCriterion("mnp1_openId not in", values, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidBetween(String value1, String value2) {
            addCriterion("mnp1_openId between", value1, value2, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andMnp1OpenidNotBetween(String value1, String value2) {
            addCriterion("mnp1_openId not between", value1, value2, "mnp1Openid");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceIsNull() {
            addCriterion("knowlegeSpace is null");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceIsNotNull() {
            addCriterion("knowlegeSpace is not null");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceEqualTo(String value) {
            addCriterion("knowlegeSpace =", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceNotEqualTo(String value) {
            addCriterion("knowlegeSpace <>", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceGreaterThan(String value) {
            addCriterion("knowlegeSpace >", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceGreaterThanOrEqualTo(String value) {
            addCriterion("knowlegeSpace >=", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceLessThan(String value) {
            addCriterion("knowlegeSpace <", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceLessThanOrEqualTo(String value) {
            addCriterion("knowlegeSpace <=", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceLike(String value) {
            addCriterion("knowlegeSpace like", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceNotLike(String value) {
            addCriterion("knowlegeSpace not like", value, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceIn(List<String> values) {
            addCriterion("knowlegeSpace in", values, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceNotIn(List<String> values) {
            addCriterion("knowlegeSpace not in", values, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceBetween(String value1, String value2) {
            addCriterion("knowlegeSpace between", value1, value2, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andKnowlegespaceNotBetween(String value1, String value2) {
            addCriterion("knowlegeSpace not between", value1, value2, "knowlegespace");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNull() {
            addCriterion("id_code is null");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNotNull() {
            addCriterion("id_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodeEqualTo(String value) {
            addCriterion("id_code =", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotEqualTo(String value) {
            addCriterion("id_code <>", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThan(String value) {
            addCriterion("id_code >", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("id_code >=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThan(String value) {
            addCriterion("id_code <", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThanOrEqualTo(String value) {
            addCriterion("id_code <=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLike(String value) {
            addCriterion("id_code like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotLike(String value) {
            addCriterion("id_code not like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeIn(List<String> values) {
            addCriterion("id_code in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotIn(List<String> values) {
            addCriterion("id_code not in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeBetween(String value1, String value2) {
            addCriterion("id_code between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotBetween(String value1, String value2) {
            addCriterion("id_code not between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdImgIsNull() {
            addCriterion("id_img is null");
            return (Criteria) this;
        }

        public Criteria andIdImgIsNotNull() {
            addCriterion("id_img is not null");
            return (Criteria) this;
        }

        public Criteria andIdImgEqualTo(String value) {
            addCriterion("id_img =", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotEqualTo(String value) {
            addCriterion("id_img <>", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgGreaterThan(String value) {
            addCriterion("id_img >", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgGreaterThanOrEqualTo(String value) {
            addCriterion("id_img >=", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLessThan(String value) {
            addCriterion("id_img <", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLessThanOrEqualTo(String value) {
            addCriterion("id_img <=", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLike(String value) {
            addCriterion("id_img like", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotLike(String value) {
            addCriterion("id_img not like", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgIn(List<String> values) {
            addCriterion("id_img in", values, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotIn(List<String> values) {
            addCriterion("id_img not in", values, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgBetween(String value1, String value2) {
            addCriterion("id_img between", value1, value2, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotBetween(String value1, String value2) {
            addCriterion("id_img not between", value1, value2, "idImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgIsNull() {
            addCriterion("teacher_certificate_img is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgIsNotNull() {
            addCriterion("teacher_certificate_img is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgEqualTo(String value) {
            addCriterion("teacher_certificate_img =", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgNotEqualTo(String value) {
            addCriterion("teacher_certificate_img <>", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgGreaterThan(String value) {
            addCriterion("teacher_certificate_img >", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_certificate_img >=", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgLessThan(String value) {
            addCriterion("teacher_certificate_img <", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgLessThanOrEqualTo(String value) {
            addCriterion("teacher_certificate_img <=", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgLike(String value) {
            addCriterion("teacher_certificate_img like", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgNotLike(String value) {
            addCriterion("teacher_certificate_img not like", value, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgIn(List<String> values) {
            addCriterion("teacher_certificate_img in", values, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgNotIn(List<String> values) {
            addCriterion("teacher_certificate_img not in", values, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgBetween(String value1, String value2) {
            addCriterion("teacher_certificate_img between", value1, value2, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andTeacherCertificateImgNotBetween(String value1, String value2) {
            addCriterion("teacher_certificate_img not between", value1, value2, "teacherCertificateImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgIsNull() {
            addCriterion("incumbency_img is null");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgIsNotNull() {
            addCriterion("incumbency_img is not null");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgEqualTo(String value) {
            addCriterion("incumbency_img =", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgNotEqualTo(String value) {
            addCriterion("incumbency_img <>", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgGreaterThan(String value) {
            addCriterion("incumbency_img >", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgGreaterThanOrEqualTo(String value) {
            addCriterion("incumbency_img >=", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgLessThan(String value) {
            addCriterion("incumbency_img <", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgLessThanOrEqualTo(String value) {
            addCriterion("incumbency_img <=", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgLike(String value) {
            addCriterion("incumbency_img like", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgNotLike(String value) {
            addCriterion("incumbency_img not like", value, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgIn(List<String> values) {
            addCriterion("incumbency_img in", values, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgNotIn(List<String> values) {
            addCriterion("incumbency_img not in", values, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgBetween(String value1, String value2) {
            addCriterion("incumbency_img between", value1, value2, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andIncumbencyImgNotBetween(String value1, String value2) {
            addCriterion("incumbency_img not between", value1, value2, "incumbencyImg");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("diploma is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("diploma is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(String value) {
            addCriterion("diploma =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(String value) {
            addCriterion("diploma <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(String value) {
            addCriterion("diploma >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("diploma >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(String value) {
            addCriterion("diploma <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(String value) {
            addCriterion("diploma <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLike(String value) {
            addCriterion("diploma like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotLike(String value) {
            addCriterion("diploma not like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<String> values) {
            addCriterion("diploma in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<String> values) {
            addCriterion("diploma not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(String value1, String value2) {
            addCriterion("diploma between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(String value1, String value2) {
            addCriterion("diploma not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
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