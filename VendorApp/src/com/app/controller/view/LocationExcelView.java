package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Location;

public class LocationExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest arg2, HttpServletResponse arg3)
			throws Exception
			{   List<Location> locList=(List<Location>)map.get("locListObj");
	            HSSFSheet sheet= book.createSheet();
	            setHeader(sheet);
	            setBody(sheet,locList);
	        }

	private void setBody(HSSFSheet sheet, List<Location> locList) {
  int rownum=1;
  for(Location loc:locList)
  {
	  HSSFRow row=sheet.createRow(rownum++);
	  row.createCell(0).setCellValue(loc.getLocId());
	  row.createCell(1).setCellValue(loc.getLocName());
	  row.createCell(2).setCellValue(loc.getLocPinCode());
	  row.createCell(3).setCellValue(loc.getLocState());
	  row.createCell(4).setCellValue(loc.getLocCountry());
	  row.createCell(5).setCellValue(loc.getLocType());
	  row.createCell(6).setCellValue(loc.getLocSupName());
	  row.createCell(7).setCellValue(loc.getLocAdvName());
	  row.createCell(8).setCellValue(loc.getLocCreDate());
	   
	  
  }
	}

	private void setHeader(HSSFSheet sheet) {
	  int rownum=0;
		  HSSFRow row=sheet.createRow(rownum);
			  row.createCell(0).setCellValue("Location Id");
			  row.createCell(1).setCellValue("Location Name");
			  row.createCell(2).setCellValue("Location PinCode");
			  row.createCell(3).setCellValue("Location State");
			  row.createCell(4).setCellValue("Location Country");
			  row.createCell(5).setCellValue("Location Type");
			  row.createCell(6).setCellValue("Location  Supervisor Name");
			  row.createCell(7).setCellValue("Location Advisor Name");
			  row.createCell(8).setCellValue("Creation Date");
	}

	
}
