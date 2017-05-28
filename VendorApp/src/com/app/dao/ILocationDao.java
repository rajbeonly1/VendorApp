package com.app.dao;

import java.util.List;

import com.app.model.Location;

public interface ILocationDao {
	public int saveLocation(Location loc);
	public List<Location> getAllLocations();
	public void deleteLocation(int locId);
	public Location getLocById(int locId);
	public void updateLocation(Location loc);
	
	//for validations
	public Location getLocationByName(String name);
	public Location checkBeforeDelete(int locId);
	
	// for charts
	public List<Object[]> getLocationWiseCount();

}
