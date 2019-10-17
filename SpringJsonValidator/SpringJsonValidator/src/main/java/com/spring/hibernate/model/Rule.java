package com.spring.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Rule")
public class Rule {

	@Id
	private int ID;
	private int parentId;
	private int level;
	private String rule;
	private String fieldName;
	
	@OneToMany(fetch = FetchType.EAGER,cascade= {CascadeType.ALL})
	@JoinColumn(name="rule_id")
	private List<ListofRules> listofrules;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<ListofRules> getListofrules() {
		return listofrules;
	}

	public void setListofrules(List<ListofRules> listofrules) {
		this.listofrules = listofrules;
	}
	
	
	
}
