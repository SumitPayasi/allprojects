package com.spring.JsonValidator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.JsonValidator.model.Rule;

@Repository
public interface ValidatorDao extends JpaRepository<Rule, Integer> {

}
