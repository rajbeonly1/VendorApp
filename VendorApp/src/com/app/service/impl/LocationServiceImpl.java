package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;
@Service
public class LocationServiceImpl implements ILocationService {
    @Autowired
	private ILocationDao dao;

	@Override
	public int saveLocation(Location loc) {
		// TODO Auto-generated method stub
		return dao.saveLocation(loc);
	}
	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return dao.getAllLocations();
	}
	@Override
	public void deleteLocation(int lid) {
      dao.deleteLocation(lid);		
	}
	@Override
	public Location getLocById(int locId) {
		return dao.getLocById(locId);
	}
	@Override
	public void updateLocation(Location loc) {
     dao.updateLocation(loc);		
	}
	@Override
	public Location getLocationByName(String name) {
		// TODO Auto-generated method stub
		return dao.getLocationByName(name);
	}
	@Override
	public Location checkBeforeDelete(int locId) {
		// TODO Auto-generated method stub
		return dao.checkBeforeDelete(locId);
	}
	@Override
	public List<Object[]> getLocationWiseCount() {
		// TODO Auto-generated method stub
		return dao.getLocationWiseCount();
	}
}
