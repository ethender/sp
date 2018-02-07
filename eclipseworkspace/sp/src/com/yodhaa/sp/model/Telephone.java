package com.yodhaa.sp.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="telephone")
public class Telephone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5128331007239467868L;
	
	@Id
	private String id;
	private String country;
	private String telecode;
	private String currency;
	private String lenofcode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelecode() {
		return telecode;
	}
	public void setTelecode(String telecode) {
		this.telecode = telecode;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getLenofcode() {
		return lenofcode;
	}
	public void setLenofcode(String lenofcode) {
		this.lenofcode = lenofcode;
	}

	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lenofcode == null) ? 0 : lenofcode.hashCode());
		result = prime * result + ((telecode == null) ? 0 : telecode.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lenofcode == null) {
			if (other.lenofcode != null)
				return false;
		} else if (!lenofcode.equals(other.lenofcode))
			return false;
		if (telecode == null) {
			if (other.telecode != null)
				return false;
		} else if (!telecode.equals(other.telecode))
			return false;
		return true;
	}
	
	public String toString() {
		return "Telephone [id=" + id + ", country=" + country + ", telecode=" + telecode + ", currency=" + currency
				+ ", lenofcode=" + lenofcode + "]";
	}
	

}
