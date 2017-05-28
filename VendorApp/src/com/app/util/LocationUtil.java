package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Location;
import com.app.service.ILocationService;

@Component
public class LocationUtil {
	@Autowired
	private ILocationService service;

 public List<Location> getAllLocations()
 {
	 return service.getAllLocations();
 }
 
 public void genLocPieChart(String path,List<Object[]> data)
 {
	 //1.dataset
	 DefaultPieDataset dataset= new DefaultPieDataset();
	 for(Object[] ob:data)
	 {
		 dataset.setValue(ob[0].toString(), new Double(ob[1].toString()));
	 }
	 //2.using chatFactory create JFreeChat object
	 JFreeChart chart= ChartFactory.createPieChart3D("Location PieChart", dataset, true, true, false);
	 //3 using chartutilities convert jrfee object to image
	 try {
		ChartUtilities.saveChartAsJPEG(new File(path+"/sample.jpg"), chart, 400, 400);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public void genLocBarGraph(String path,List<Object[]> data)
 {
	
 }
}
 