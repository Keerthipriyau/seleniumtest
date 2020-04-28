	package utility;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	
	public class ExcelRead {
		
		public static String excelRead(String sheetname, String path,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
	        String v="";
	        try{
			FileInputStream fis=new FileInputStream(path);
	        Workbook wb = WorkbookFactory.create(fis);
	        Cell c=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
	         v= c.toString();
	        }
	        catch(Exception e){
	        	
	        }
	        return v;
	
	}
	
	
	}
