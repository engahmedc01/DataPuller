package com.util.dataPull.core.config.shop2020.entities.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.Outcome2020;

@Repository
public interface OutcomeRepo  extends CrudRepository<Outcome2020,Integer> {
}