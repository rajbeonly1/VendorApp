package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocationService {
	public int saveLocation(Location loc);
	public List<Location> getAllLocations();
	public void deleteLocation(int lid);
	public Location getLocById(int locId);
	public void updateLocation(Location loc);
	
	public Location getLocationByName(String name);
	public Location checkBeforeDelete(int locId);
	
	public List<Object[]> getLocationWiseCount();

}
