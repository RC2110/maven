package org.cts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcellTwo {	
	private static String format;

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\rajaa\\eclipse-workspace\\Maven\\Excel\\March16.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("data");
		
		for (int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			System.out.println("============");
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
//				System.out.println(cell);
				CellType cellType = cell.getCellType();
							
				switch (cellType) {
				case STRING:
					String scv = cell.getStringCellValue();
					System.out.println(scv);
					break;
					
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dcv = cell.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
						format = sdf.format(dcv);
						System.out.println(format);
						
					}
								
					else {
						double ncv = cell.getNumericCellValue();
						long round = Math.round(ncv);
						if (round==ncv) {
							String valueOf = String.valueOf(round);
							System.out.println(valueOf);
													
						} else {
							String valueOf = String.valueOf(ncv);
							System.out.println(valueOf);
						}
//						BigDecimal b = BigDecimal.valueOf(ncv);
//						String cv = b.toString();
//						System.out.println(cv);
						}

					default:
						break;
				}
				
			}
			
		}
			
		
	}
	

}
