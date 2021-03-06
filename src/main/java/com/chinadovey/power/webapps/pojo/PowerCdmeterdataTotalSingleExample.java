package com.chinadovey.power.webapps.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowerCdmeterdataTotalSingleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public PowerCdmeterdataTotalSingleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
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

        public Criteria andEcuIdIsNull() {
            addCriterion("ecu_id is null");
            return (Criteria) this;
        }

        public Criteria andEcuIdIsNotNull() {
            addCriterion("ecu_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcuIdEqualTo(Integer value) {
            addCriterion("ecu_id =", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdNotEqualTo(Integer value) {
            addCriterion("ecu_id <>", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdGreaterThan(Integer value) {
            addCriterion("ecu_id >", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecu_id >=", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdLessThan(Integer value) {
            addCriterion("ecu_id <", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecu_id <=", value, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdIn(List<Integer> values) {
            addCriterion("ecu_id in", values, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdNotIn(List<Integer> values) {
            addCriterion("ecu_id not in", values, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdBetween(Integer value1, Integer value2) {
            addCriterion("ecu_id between", value1, value2, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEcuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecu_id not between", value1, value2, "ecuId");
            return (Criteria) this;
        }

        public Criteria andEquiIdIsNull() {
            addCriterion("equi_id is null");
            return (Criteria) this;
        }

        public Criteria andEquiIdIsNotNull() {
            addCriterion("equi_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquiIdEqualTo(Long value) {
            addCriterion("equi_id =", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdNotEqualTo(Long value) {
            addCriterion("equi_id <>", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdGreaterThan(Long value) {
            addCriterion("equi_id >", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equi_id >=", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdLessThan(Long value) {
            addCriterion("equi_id <", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdLessThanOrEqualTo(Long value) {
            addCriterion("equi_id <=", value, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdIn(List<Long> values) {
            addCriterion("equi_id in", values, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdNotIn(List<Long> values) {
            addCriterion("equi_id not in", values, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdBetween(Long value1, Long value2) {
            addCriterion("equi_id between", value1, value2, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiIdNotBetween(Long value1, Long value2) {
            addCriterion("equi_id not between", value1, value2, "equiId");
            return (Criteria) this;
        }

        public Criteria andEquiStatusIsNull() {
            addCriterion("equi_status is null");
            return (Criteria) this;
        }

        public Criteria andEquiStatusIsNotNull() {
            addCriterion("equi_status is not null");
            return (Criteria) this;
        }

        public Criteria andEquiStatusEqualTo(Integer value) {
            addCriterion("equi_status =", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusNotEqualTo(Integer value) {
            addCriterion("equi_status <>", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusGreaterThan(Integer value) {
            addCriterion("equi_status >", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("equi_status >=", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusLessThan(Integer value) {
            addCriterion("equi_status <", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("equi_status <=", value, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusIn(List<Integer> values) {
            addCriterion("equi_status in", values, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusNotIn(List<Integer> values) {
            addCriterion("equi_status not in", values, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusBetween(Integer value1, Integer value2) {
            addCriterion("equi_status between", value1, value2, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("equi_status not between", value1, value2, "equiStatus");
            return (Criteria) this;
        }

        public Criteria andEquiTeeIsNull() {
            addCriterion("equi_tee is null");
            return (Criteria) this;
        }

        public Criteria andEquiTeeIsNotNull() {
            addCriterion("equi_tee is not null");
            return (Criteria) this;
        }

        public Criteria andEquiTeeEqualTo(Double value) {
            addCriterion("equi_tee =", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeNotEqualTo(Double value) {
            addCriterion("equi_tee <>", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeGreaterThan(Double value) {
            addCriterion("equi_tee >", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_tee >=", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeLessThan(Double value) {
            addCriterion("equi_tee <", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeLessThanOrEqualTo(Double value) {
            addCriterion("equi_tee <=", value, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeIn(List<Double> values) {
            addCriterion("equi_tee in", values, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeNotIn(List<Double> values) {
            addCriterion("equi_tee not in", values, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeBetween(Double value1, Double value2) {
            addCriterion("equi_tee between", value1, value2, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTeeNotBetween(Double value1, Double value2) {
            addCriterion("equi_tee not between", value1, value2, "equiTee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeIsNull() {
            addCriterion("equi_tsee is null");
            return (Criteria) this;
        }

        public Criteria andEquiTseeIsNotNull() {
            addCriterion("equi_tsee is not null");
            return (Criteria) this;
        }

        public Criteria andEquiTseeEqualTo(Double value) {
            addCriterion("equi_tsee =", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeNotEqualTo(Double value) {
            addCriterion("equi_tsee <>", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeGreaterThan(Double value) {
            addCriterion("equi_tsee >", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_tsee >=", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeLessThan(Double value) {
            addCriterion("equi_tsee <", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeLessThanOrEqualTo(Double value) {
            addCriterion("equi_tsee <=", value, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeIn(List<Double> values) {
            addCriterion("equi_tsee in", values, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeNotIn(List<Double> values) {
            addCriterion("equi_tsee not in", values, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeBetween(Double value1, Double value2) {
            addCriterion("equi_tsee between", value1, value2, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTseeNotBetween(Double value1, Double value2) {
            addCriterion("equi_tsee not between", value1, value2, "equiTsee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeIsNull() {
            addCriterion("equi_thee is null");
            return (Criteria) this;
        }

        public Criteria andEquiTheeIsNotNull() {
            addCriterion("equi_thee is not null");
            return (Criteria) this;
        }

        public Criteria andEquiTheeEqualTo(Double value) {
            addCriterion("equi_thee =", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeNotEqualTo(Double value) {
            addCriterion("equi_thee <>", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeGreaterThan(Double value) {
            addCriterion("equi_thee >", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_thee >=", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeLessThan(Double value) {
            addCriterion("equi_thee <", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeLessThanOrEqualTo(Double value) {
            addCriterion("equi_thee <=", value, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeIn(List<Double> values) {
            addCriterion("equi_thee in", values, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeNotIn(List<Double> values) {
            addCriterion("equi_thee not in", values, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeBetween(Double value1, Double value2) {
            addCriterion("equi_thee between", value1, value2, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTheeNotBetween(Double value1, Double value2) {
            addCriterion("equi_thee not between", value1, value2, "equiThee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeIsNull() {
            addCriterion("equi_tnee is null");
            return (Criteria) this;
        }

        public Criteria andEquiTneeIsNotNull() {
            addCriterion("equi_tnee is not null");
            return (Criteria) this;
        }

        public Criteria andEquiTneeEqualTo(Double value) {
            addCriterion("equi_tnee =", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeNotEqualTo(Double value) {
            addCriterion("equi_tnee <>", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeGreaterThan(Double value) {
            addCriterion("equi_tnee >", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_tnee >=", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeLessThan(Double value) {
            addCriterion("equi_tnee <", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeLessThanOrEqualTo(Double value) {
            addCriterion("equi_tnee <=", value, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeIn(List<Double> values) {
            addCriterion("equi_tnee in", values, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeNotIn(List<Double> values) {
            addCriterion("equi_tnee not in", values, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeBetween(Double value1, Double value2) {
            addCriterion("equi_tnee between", value1, value2, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTneeNotBetween(Double value1, Double value2) {
            addCriterion("equi_tnee not between", value1, value2, "equiTnee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeIsNull() {
            addCriterion("equi_tlee is null");
            return (Criteria) this;
        }

        public Criteria andEquiTleeIsNotNull() {
            addCriterion("equi_tlee is not null");
            return (Criteria) this;
        }

        public Criteria andEquiTleeEqualTo(Double value) {
            addCriterion("equi_tlee =", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeNotEqualTo(Double value) {
            addCriterion("equi_tlee <>", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeGreaterThan(Double value) {
            addCriterion("equi_tlee >", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_tlee >=", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeLessThan(Double value) {
            addCriterion("equi_tlee <", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeLessThanOrEqualTo(Double value) {
            addCriterion("equi_tlee <=", value, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeIn(List<Double> values) {
            addCriterion("equi_tlee in", values, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeNotIn(List<Double> values) {
            addCriterion("equi_tlee not in", values, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeBetween(Double value1, Double value2) {
            addCriterion("equi_tlee between", value1, value2, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiTleeNotBetween(Double value1, Double value2) {
            addCriterion("equi_tlee not between", value1, value2, "equiTlee");
            return (Criteria) this;
        }

        public Criteria andEquiWppIsNull() {
            addCriterion("equi_wpp is null");
            return (Criteria) this;
        }

        public Criteria andEquiWppIsNotNull() {
            addCriterion("equi_wpp is not null");
            return (Criteria) this;
        }

        public Criteria andEquiWppEqualTo(Double value) {
            addCriterion("equi_wpp =", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppNotEqualTo(Double value) {
            addCriterion("equi_wpp <>", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppGreaterThan(Double value) {
            addCriterion("equi_wpp >", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_wpp >=", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppLessThan(Double value) {
            addCriterion("equi_wpp <", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppLessThanOrEqualTo(Double value) {
            addCriterion("equi_wpp <=", value, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppIn(List<Double> values) {
            addCriterion("equi_wpp in", values, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppNotIn(List<Double> values) {
            addCriterion("equi_wpp not in", values, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppBetween(Double value1, Double value2) {
            addCriterion("equi_wpp between", value1, value2, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWppNotBetween(Double value1, Double value2) {
            addCriterion("equi_wpp not between", value1, value2, "equiWpp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpIsNull() {
            addCriterion("equi_wqp is null");
            return (Criteria) this;
        }

        public Criteria andEquiWqpIsNotNull() {
            addCriterion("equi_wqp is not null");
            return (Criteria) this;
        }

        public Criteria andEquiWqpEqualTo(Double value) {
            addCriterion("equi_wqp =", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpNotEqualTo(Double value) {
            addCriterion("equi_wqp <>", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpGreaterThan(Double value) {
            addCriterion("equi_wqp >", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpGreaterThanOrEqualTo(Double value) {
            addCriterion("equi_wqp >=", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpLessThan(Double value) {
            addCriterion("equi_wqp <", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpLessThanOrEqualTo(Double value) {
            addCriterion("equi_wqp <=", value, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpIn(List<Double> values) {
            addCriterion("equi_wqp in", values, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpNotIn(List<Double> values) {
            addCriterion("equi_wqp not in", values, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpBetween(Double value1, Double value2) {
            addCriterion("equi_wqp between", value1, value2, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andEquiWqpNotBetween(Double value1, Double value2) {
            addCriterion("equi_wqp not between", value1, value2, "equiWqp");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNull() {
            addCriterion("save_time is null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIsNotNull() {
            addCriterion("save_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaveTimeEqualTo(Date value) {
            addCriterion("save_time =", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotEqualTo(Date value) {
            addCriterion("save_time <>", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThan(Date value) {
            addCriterion("save_time >", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("save_time >=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThan(Date value) {
            addCriterion("save_time <", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("save_time <=", value, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeIn(List<Date> values) {
            addCriterion("save_time in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotIn(List<Date> values) {
            addCriterion("save_time not in", values, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeBetween(Date value1, Date value2) {
            addCriterion("save_time between", value1, value2, "saveTime");
            return (Criteria) this;
        }

        public Criteria andSaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("save_time not between", value1, value2, "saveTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated do_not_delete_during_merge Mon Oct 31 17:56:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table power_cdmeterdata_total_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
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