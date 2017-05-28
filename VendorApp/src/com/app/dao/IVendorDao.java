package com.app.dao;

import java.util.List;

import com.app.model.Vendor;

public interface IVendorDao {
	public int saveVendor(Vendor v);
	public void updateVendor(Vendor v);
	public void deleteVendor(int venId);
	public Vendor getVenById(int venId);
	public List<Vendor> getAllVendors();
	
	public Vendor getVendorByEmail(String venEmail);

}
