package com.spring.JsonValidator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Validator")
public class Rule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	@Column(nullable=true)
	private String field;
	@Column(nullable=true)
	private int parent;
	@Column(nullable=true)
	private boolean stringFlag;
	@Column(nullable=true)
	private boolean numberFlag;
	@Column(nullable=true)
	private int minLength;
	@Column(nullable=true)
	private int maxLength;
	@Column(nullable=true)
	private int min;
	@Column(nullable=true)
	private int max;
	@Column(nullable=true)
	private boolean required;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public boolean isStringFlag() {
		return stringFlag;
	}
	public void setStringFlag(boolean stringFlag) {
		this.stringFlag = stringFlag;
	}
	public boolean isNumberFlag() {
		return numberFlag;
	}
	public void setNumberFlag(boolean numberFlag) {
		this.numberFlag = numberFlag;
	}
	public int getMinLength() {
		return minLength;
	}
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	@Override
	public String toString() {
		return "Rule [ID=" + ID + ", field=" + field + ", parent=" + parent + ", stringFlag=" + stringFlag
				+ ", numberFlag=" + numberFlag + ", minLength=" + minLength + ", maxLength=" + maxLength + ", min="
				+ min + ", max=" + max + ", required=" + required + "]";
	}
	
	
	

}
