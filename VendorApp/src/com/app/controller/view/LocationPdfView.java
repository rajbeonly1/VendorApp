package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class LocationPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> m, Document doc,
			PdfWriter writer, HttpServletRequest arg3, HttpServletResponse arg4)
			throws Exception {
		List<Location> locList=(List<Location>)m.get("locListObj");
		PdfPTable table=new PdfPTable(8);
		table.addCell("Location Id");
		table.addCell("Location Name");
		table.addCell("Location PinCode");
		table.addCell("Location State");
		table.addCell("Location Country");
		table.addCell("Location Type");
		table.addCell("Location Spervisor Name");
		table.addCell("Location Advisor Name");
		table.addCell("Location Creation Date");
		for(Location loc:locList)
		{
			table.addCell(""+loc.getLocId());
			table.addCell(loc.getLocName());
			table.addCell(""+loc.getLocPinCode());
			table.addCell(loc.getLocState());
			table.addCell(loc.getLocCountry());
			table.addCell(loc.getLocType());
			table.addCell(loc.getLocSupName());
			table.addCell(loc.getLocAdvName());
			table.addCell(loc.getLocCreDate());
		}
		doc.add(table);
	}
}
