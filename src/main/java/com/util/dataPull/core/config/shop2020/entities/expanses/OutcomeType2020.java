package com.util.dataPull.core.config.shop2020.entities.expanses;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.dataPull.core.config.shop2020.entities.BaseBean;

@Table(name = "OUTCOME_TYPES")
@Entity(name = "OutcomeType")
@Setter
@Getter
public class OutcomeType2020 extends BaseBean {
	
	
	@Id
	@Column(name ="ID" )
	private int id ;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "NAME_AR")
	private String nameAr;

}
