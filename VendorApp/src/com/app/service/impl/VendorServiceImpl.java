package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;
import com.app.service.IVendorService;
@Service
public class VendorServiceImpl implements IVendorService {
    @Autowired
	private IVendorDao dao;
	@Override
	public int saveVendor(Vendor v) {
		return dao.saveVendor(v);
	}

	@Override
	public void updateVendor(Vendor v) {
dao.updateVendor(v);
	}

	@Override
	public void deleteVendor(int venId) {
dao.deleteVendor(venId);
	}

	@Override
	public Vendor getVenById(int venId) {
		// TODO Auto-generated method stub
		return dao.getVenById(venId);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return dao.getAllVendors();
	}
	@Override
	public Vendor getVendorByEmail(String venEmail) {
		// TODO Auto-generated method stub
		return dao.getVendorByEmail(venEmail);
	}

}
