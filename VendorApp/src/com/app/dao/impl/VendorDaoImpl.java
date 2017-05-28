package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;
@Repository
public class VendorDaoImpl implements IVendorDao {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveVendor(Vendor v) {
		return (Integer)ht.save(v);
	}

	@Override
	public void updateVendor(Vendor v) {
		ht.update(v);
	}

	@Override
	public void deleteVendor(int venId) {
		ht.delete(new Vendor(venId));
	}

	@Override
	public Vendor getVenById(int venId) {
		return ht.get(Vendor.class, venId);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return ht.loadAll(Vendor.class);
	}
 @Override
	public Vendor getVendorByEmail(String venEmail) {
	 Vendor ven =null;
	 String hql="from "+Vendor.class.getName()+" where VenEmail=?";
	 List<Vendor> venList=ht.find(hql, venEmail);
	 if(venList != null && venList.size()>0)
	 {
		ven= venList.get(0); 
	 }
	 return ven;
}
}
