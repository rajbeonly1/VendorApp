package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="loc_Tab")
public class Location {
   @Id
   @GeneratedValue(generator="loc")
   @SequenceGenerator(name="loc",sequenceName="LOC_SEQ")
   @Column(name="loc_id")
   private int locId;
   @Column(name="loc_name",length=15)
   private String locName;
   @Column(name="loc_type",length=11)
   private String locType;
   @Column(name="loc_state",length=15)
   private String locState;
   @Column(name="loc_pincode")
   private int locPinCode;
   @Column(name="loc_Country",length=15)
   private String locCountry;
   @Column(name="loc_SupName",length=15)
   private String locSupName;
   @Column(name="loc_AdvName",length=15)
   private String locAdvName;
   @Column(name="loc_CreDate",length=11)
   private String locCreDate;

@Override
public String toString() {
	return "Location [locId=" + locId + ", locName=" + locName + ", locType="
			+ locType + ", locState=" + locState + ", locPinCode=" + locPinCode
			+ ", locCountry=" + locCountry + ", locSupName=" + locSupName
			+ ", locAdvName=" + locAdvName + ", locCreDate=" + locCreDate + "]";
}

public Location(int locId, String locName, String locType, String locState,
		int locPinCode, String locCountry, String locSupName,
		String locAdvName, String locCreDate) {
	super();
	this.locId = locId;
	this.locName = locName;
	this.locType = locType;
	this.locState = locState;
	this.locPinCode = locPinCode;
	this.locCountry = locCountry;
	this.locSupName = locSupName;
	this.locAdvName = locAdvName;
	this.locCreDate = locCreDate;
}

public String getLocCountry() {
	return locCountry;
}

public void setLocCountry(String locCountry) {
	this.locCountry = locCountry;
}

public String getLocSupName() {
	return locSupName;
}

public void setLocSupName(String locSupName) {
	this.locSupName = locSupName;
}

public String getLocAdvName() {
	return locAdvName;
}

public void setLocAdvName(String locAdvName) {
	this.locAdvName = locAdvName;
}

public String getLocCreDate() {
	return locCreDate;
}

public void setLocCreDate(String locCreDate) {
	this.locCreDate = locCreDate;
}

public String getLocState() {
	return locState;
}

public void setLocState(String locState) {
	this.locState = locState;
}

public int getLocPinCode() {
	return locPinCode;
}

public void setLocPinCode(int locPinCode) {
	this.locPinCode = locPinCode;
}

public Location() {
	// TODO Auto-generated constructor stub
}

public Location(int locId) {
	this.locId = locId;
}
public int getLocId() {
	return locId;
}
public void setLocId(int locId) {
	this.locId = locId;
}
public String getLocName() {
	return locName;
}
public void setLocName(String locName) {
	this.locName = locName;
}
public String getLocType() {
	return locType;
}
public void setLocType(String locType) {
	this.locType = locType;
}


   
   

}
