package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.model.Vendor;
@Repository
public class LocationDaoImpl implements ILocationDao {
	@Autowired
	private HibernateTemplate ht;
    
	@Override
	public int saveLocation(Location loc) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(loc);
	}
	@Override
	public List<Location> getAllLocations() {
		return ht.loadAll(Location.class);
	}
	@Override
	public void deleteLocation(int lid) {

      Location 	loc=new Location(lid);
      ht.delete(loc);
	}
	@Override
	public Location getLocById(int locId) {
		return ht.get(Location.class, locId );
	}
	@Override
	public void updateLocation(Location loc) {
       ht.update(loc);	
	}
	@Override
	public Location getLocationByName(String name) {
		Location loc=null;
        String hql="from "+Location.class.getName()+" where locName=?";
        List<Location> locList=ht.find(hql, name);
        if(locList !=null && locList.size()>0)
        {
        	loc=locList.get(0);
        }
		return loc;
	}
	@Override
	public Location checkBeforeDelete(int locId) {
		Location loc=null;
		String hql=" from "+Vendor.class.getName()+" as ven ";
		List<Location> locList=ht.find(hql,locId);
		if(locList != null && locList.size() > 0)
		{
			loc=locList.get(0);
		}
		return loc;
	}
	@Override
	public List<Object[]> getLocationWiseCount() {
		// TODO Auto-generated method stub
		String hql="select locType,count(locType) from "+Location.class.getName()+" group by locType";
		List<Object[]> data=ht.find(hql);
		return data;
	}

}

