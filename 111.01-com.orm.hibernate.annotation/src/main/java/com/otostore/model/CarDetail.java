package com.otostore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CarDetail_Hibernate_Annotation")
public class CarDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CarDetail_ID")
	private long id;
	
	@Column
	private String marka;
	
	@Column
	private String model;
	
	@Column
	private int year;
	
	@Column(name="eklenme_tarihi", updatable=false)
	private Date addDate;
	
	@Column(name= "guncelleme_tarihi")
	private Date updateDate;
	
	public CarDetail() {
		// TODO Auto-generated constructor stub
	}

	public CarDetail(long id, String marka, String model, int year, Date addDate, Date updateDate) {
		super();
		this.id = id;
		this.marka = marka;
		this.model = model;
		this.year = year;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
		return new StringBuilder("CarDetail  [")
				.append("id=").append(id)
				.append(", marka=").append(marka)
				.append(", model=").append(model)
				.append(", year=").append(year)
				.append(", addDate=").append(addDate)
				.append(", updateDate=").append(updateDate)
				.append("]").toString();
	}
	
}
