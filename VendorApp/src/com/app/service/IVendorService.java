package com.app.service;

import java.util.List;

import com.app.model.Vendor;

public interface IVendorService {
	public int saveVendor(Vendor v);
	public void updateVendor(Vendor v);
	public void deleteVendor(int venId);
	public Vendor getVenById(int venId);
	public List<Vendor> getAllVendors();
	//for Validation
	public Vendor getVendorByEmail(String venEmail);


}
