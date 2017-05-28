package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ven_tab")
public class Vendor  implements Comparable<Vendor>{
	@Id
	@GeneratedValue(generator="ven")
	@SequenceGenerator(name="ven",sequenceName="VEN_SEQ")
	@Column(name="ven_id")
	private int venId;
	@Column(name="ven_name")
	private String venName;
	@Column(name="ven_email")
	private String VenEmail;
	@ManyToOne
	@JoinColumn(name="locFK")
	private Location loc;

	
	public Vendor(int venId, String venName, String venEmail, Location loc) {
		super();
		this.venId = venId;
		this.venName = venName;
		VenEmail = venEmail;
		this.loc = loc;
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}

	public Vendor() {
		super();
	}
  
	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName
				+ ", VenEmail=" + VenEmail + ", loc=" + loc + "]";
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenEmail() {
		return VenEmail;
	}

	public void setVenEmail(String venEmail) {
		VenEmail = venEmail;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public int compareTo(Vendor o) {
		// TODO Auto-generated method stub
		return this.getVenId()-o.getVenId();
	}
	

}
