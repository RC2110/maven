package org.cts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelly {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\rajaa\\eclipse-workspace\\Maven\\Excel\\Mushroom Subset.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(stream);
		

		Sheet sheet = book.getSheet("mush");
			
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	    	Row row = sheet.getRow(i);
	    	System.out.println("==============");
	    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    		Cell cell = row.getCell(j);
	    		CellType cellType = cell.getCellType();
//	    		System.out.println(cellType);
	    		switch (cellType) {
				case STRING:
					String scv = cell.getStringCellValue();
					System.out.println(scv);
					break;
					
				case NUMERIC:
					
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dcv = cell.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
						String dValue = sdf.format(dcv);
						System.out.println(dValue);			
						}
					else {
						double d = cell.getNumericCellValue();
						long round = Math.round(d);
						
						if (round==d) {
							String rval = String.valueOf(round);
							System.out.println(rval);
												
						}
						else {
							String dVal = String.valueOf(d);
							System.out.println(dVal);
						}
					
					}
//					BigDecimal value = BigDecimal.valueOf(ncv);
//					String string = value.toString();
//					System.out.println(string);
//					break;
								
				default:
					break;
				}
		
	    	}}
		
		
		
	}

}
