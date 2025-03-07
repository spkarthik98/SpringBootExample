package com.crud.entity;

import jakarta.persistence.*;

@Entity
public class Scope {
	@Id
	private Long id;
	private String scope;
	
	@ManyToOne
    @JoinColumn(name = "scopeList")
	private ChangeRequest cr;
	public ChangeRequest getCr() {
		return cr;
	}
	public void setCr(ChangeRequest cr) {
		this.cr = cr;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
