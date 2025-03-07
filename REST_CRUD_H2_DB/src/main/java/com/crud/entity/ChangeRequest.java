package com.crud.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ChangeRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String changeRequestName;
	private String company;
	
	 @OneToMany(mappedBy = "cr", cascade = CascadeType.ALL)
	private List<Scope> scopeList;
	public List<Scope> getScopeList() {
		return scopeList;
	}
	public void setScopeList(List<Scope> scopeList) {
		this.scopeList = scopeList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChangeRequestName() {
		return changeRequestName;
	}
	public void setChangeRequestName(String changeRequestName) {
		this.changeRequestName = changeRequestName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
	
}
