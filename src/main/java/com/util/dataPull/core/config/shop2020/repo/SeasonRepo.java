package com.util.dataPull.core.config.shop2020.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.util.dataPull.core.config.shop2020.entities.masterData.Season2020;

@Repository
public interface SeasonRepo  extends CrudRepository<Season2020,Integer> {
}
