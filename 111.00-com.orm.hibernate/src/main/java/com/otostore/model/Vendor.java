package com.otostore.model;

import java.io.Serializable;
import java.util.Date;

public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String surName;
	private String firm;
	private Date addDate;
	private Date updateDate;
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public Vendor(long id, String name, String surName, String firm, Date addDate, Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.firm = firm;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("Vendor  [")
				.append("id=").append(id)
				.append(", name=").append(name)
				.append(", surName=").append(surName)
				.append(", firm=").append(firm)
				.append(", addDate=").append(addDate)
				.append(", updateDate=").append(updateDate)
				.append("]").toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
