package com.yodhaa.sp.model;

import java.io.Serializable;
import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * Total Registration
 * @author ethender
 * 26-01-2017
 */
@Document(collection="registration")
public class Registration implements Serializable{

	
	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = 2621436106370432523L;
	@Id
	private String refnum;
	private String companyName;
	private String email;
	private Mobile mobile;
	private Landline landline;
	private ContactPerson person;
	private BusinessHours businesshour;
	private Date insertdate;
	private Date lastmodified;
	private String status;
	public String getRefnum() {
		return refnum;
	}
	public void setRefnum(String refnum) {
		this.refnum = refnum;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public Landline getLandline() {
		return landline;
	}
	public void setLandline(Landline landline) {
		this.landline = landline;
	}
	public ContactPerson getPerson() {
		return person;
	}
	public void setPerson(ContactPerson person) {
		this.person = person;
	}
	public BusinessHours getBusinesshour() {
		return businesshour;
	}
	public void setBusinesshour(BusinessHours businesshour) {
		this.businesshour = businesshour;
	}
	public Date getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}
	public Date getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businesshour == null) ? 0 : businesshour.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((insertdate == null) ? 0 : insertdate.hashCode());
		result = prime * result + ((landline == null) ? 0 : landline.hashCode());
		result = prime * result + ((lastmodified == null) ? 0 : lastmodified.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((refnum == null) ? 0 : refnum.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (businesshour == null) {
			if (other.businesshour != null)
				return false;
		} else if (!businesshour.equals(other.businesshour))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (insertdate == null) {
			if (other.insertdate != null)
				return false;
		} else if (!insertdate.equals(other.insertdate))
			return false;
		if (landline == null) {
			if (other.landline != null)
				return false;
		} else if (!landline.equals(other.landline))
			return false;
		if (lastmodified == null) {
			if (other.lastmodified != null)
				return false;
		} else if (!lastmodified.equals(other.lastmodified))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (refnum == null) {
			if (other.refnum != null)
				return false;
		} else if (!refnum.equals(other.refnum))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Registration [refnum=" + refnum + ", companyName=" + companyName + ", email=" + email + ", mobile="
				+ mobile + ", landline=" + landline + ", person=" + person + ", businesshour=" + businesshour
				+ ", insertdate=" + insertdate + ", lastmodified=" + lastmodified + ", status=" + status + "]";
	}
	
		
}


/**
 * Address
 * @author ethender
 *
 */
class Address implements Serializable{

	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = -9203555900576225079L;
	
	private String country;
	private String state;
	private String pincode;
	private String district;
	private String city;
	private String area;
	private String street1;
	private String street2;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street1 == null) ? 0 : street1.hashCode());
		result = prime * result + ((street2 == null) ? 0 : street2.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street1 == null) {
			if (other.street1 != null)
				return false;
		} else if (!street1.equals(other.street1))
			return false;
		if (street2 == null) {
			if (other.street2 != null)
				return false;
		} else if (!street2.equals(other.street2))
			return false;
		return true;
	}
	
	
	
	
}

/**
 * Mobile
 * @author ethender
 *
 */
class Mobile implements Serializable{

	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = -2282032121381073562L;

		private String countrycode;
		private String number;
		public String getCountrycode() {
			return countrycode;
		}
		public void setCountrycode(String countrycode) {
			this.countrycode = countrycode;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((countrycode == null) ? 0 : countrycode.hashCode());
			result = prime * result + ((number == null) ? 0 : number.hashCode());
			return result;
		}
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mobile other = (Mobile) obj;
			if (countrycode == null) {
				if (other.countrycode != null)
					return false;
			} else if (!countrycode.equals(other.countrycode))
				return false;
			if (number == null) {
				if (other.number != null)
					return false;
			} else if (!number.equals(other.number))
				return false;
			return true;
		}
		
		public String toString() {
			return "Mobile [countrycode=" + countrycode + ", number=" + number + "]";
		}
		
}

/**
 * Land line
 * @author ethender
 *
 */
class Landline implements Serializable{

	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = 4455430609894668557L;
	
	private String landlinecode;
	private String areacode;
	private String number;
	public String getLandlinecode() {
		return landlinecode;
	}
	public void setLandlinecode(String landlinecode) {
		this.landlinecode = landlinecode;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areacode == null) ? 0 : areacode.hashCode());
		result = prime * result + ((landlinecode == null) ? 0 : landlinecode.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Landline other = (Landline) obj;
		if (areacode == null) {
			if (other.areacode != null)
				return false;
		} else if (!areacode.equals(other.areacode))
			return false;
		if (landlinecode == null) {
			if (other.landlinecode != null)
				return false;
		} else if (!landlinecode.equals(other.landlinecode))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	public String toString() {
		return "Landline [landlinecode=" + landlinecode + ", areacode=" + areacode + ", number=" + number + "]";
	}
}

/**
 * Contact Person
 * @author ethender
 *
 */
class ContactPerson implements Serializable{

	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = -458580789846155295L;
	
	private String salutation;
	private String firstname;
	private String lastname;
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((salutation == null) ? 0 : salutation.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactPerson other = (ContactPerson) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (salutation == null) {
			if (other.salutation != null)
				return false;
		} else if (!salutation.equals(other.salutation))
			return false;
		return true;
	}
	
	public String toString() {
		return "ContactPerson [salutation=" + salutation + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}

/**
 * Business Hours
 * @author ethender
 *
 */
class BusinessHours implements Serializable{

	/**
	 * @author ethender
	 */
	private static final long serialVersionUID = -5821554921614447683L;
	
	private String format;
	private String from;
	private String to;
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessHours other = (BusinessHours) obj;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}
	
	public String toString() {
		return "BusinessHours [format=" + format + ", from=" + from + ", to=" + to + "]";
	}
	
	
	
}

