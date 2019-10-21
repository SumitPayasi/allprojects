package com.spring.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Allrule")
public class ListofRules {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int allruleId;
	private int targetField1Per;
	private String nodeRuleType;
	@JsonProperty("regExp")
	private String regExp1;
	@JsonProperty("condition")
	private String condition1;
	private String minValue;
	@JsonProperty("maxValue")
	private String maxValue1;
	private String nodeMessage;
	@JsonProperty("minLength")
	private String minLength1;
	@JsonProperty("maxLength")
	private String maxLength1;
	@JsonProperty("minDate")
	private String minDate1;
	@JsonProperty("maxDate")
	private String maxDate1;
	private String maximumValue;
	private String operatorStringType;
	private String operatorType1;
	private String operatorType;
	@JsonProperty("targetValue")
	private String targetValue1;
	
	@OneToMany(fetch = FetchType.EAGER,cascade= {CascadeType.ALL})
	@JoinColumn(name="LOR_id")
	private List<Choice> choice;
	private String[] plusField1;
    private String[] targetField1; 
	private String[] miusField;
	private String[] minusField1;
	private String[] plusField;
	 


	public String[] getMiusField1() {
		return minusField1;
	}

	public void setMiusField1(String[] miusField1) {
		this.minusField1 = miusField1;
	}

	public String[] getPlusField() {
		return plusField;
	}

	public void setPlusField(String[] plusField) {
		this.plusField = plusField;
	}

	public String[] getTargetField1() {
		return targetField1;
	}

	public void setTargetField1(String[] targetField1) {
		this.targetField1 = targetField1;
	}

	public String[] getMiusField() {
		return miusField;
	}

	public void setMiusField(String[] miusField) {
		this.miusField = miusField;
	}

	public String[] getPlusField1() {
		return plusField1;
	}

	public void setPlusField1(String[] plusField1) {
		this.plusField1 = plusField1;
	}

	public List<Choice> getChoice() {
		return choice;
	}

	public void setChoice(List<Choice> choice) {
		this.choice = choice;
	}

	public String getNodeMessage() {
		return nodeMessage;
	}

	public void setNodeMessage(String nodeMessage) {
		this.nodeMessage = nodeMessage;
	}

	public ListofRules() { super(); }

	public int getTargetField1Per() {
		return targetField1Per;
	}

	public void setTargetField1Per(int targetField1Per) {
		this.targetField1Per = targetField1Per;
	}

	public String getNodeRuleType() {
		return nodeRuleType;
	}

	public void setNodeRuleType(String nodeRuleType) {
		this.nodeRuleType = nodeRuleType;
	}

	public String getRegExp1() {
		return regExp1;
	}

	public void setRegExp1(String regExp1) {
		this.regExp1 = regExp1;
	}

	public String getCondition1() {
		return condition1;
	}

	public void setCondition1(String condition1) {
		this.condition1 = condition1;
	}

	public String getMinValue() {
		return minValue;
	}

	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}

	public String getMaxValue1() {
		return maxValue1;
	}

	public void setMaxValue1(String maxValue1) {
		this.maxValue1 = maxValue1;
	}

	public String getMinLength1() {
		return minLength1;
	}

	public void setMinLength1(String minLength1) {
		this.minLength1 = minLength1;
	}

	public String getMaxLength1() {
		return maxLength1;
	}

	public void setMaxLength1(String maxLength1) {
		this.maxLength1 = maxLength1;
	}

	public String getMinDate1() {
		return minDate1;
	}

	public void setMinDate1(String minDate1) {
		this.minDate1 = minDate1;
	}

	public String getMaxDate1() {
		return maxDate1;
	}

	public void setMaxDate1(String maxDate1) {
		this.maxDate1 = maxDate1;
	}

	public String getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
	}

	public String getOperatorStringType() {
		return operatorStringType;
	}

	public void setOperatorStringType(String operatorStringType) {
		this.operatorStringType = operatorStringType;
	}

	public String getOperatorType1() {
		return operatorType1;
	}

	public void setOperatorType1(String operatorType1) {
		this.operatorType1 = operatorType1;
	}

	public String getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getTargetValue1() {
		return targetValue1;
	}

	public void setTargetValue1(String targetValue1) {
		this.targetValue1 = targetValue1;
	}


}
