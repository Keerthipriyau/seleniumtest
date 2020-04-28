package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	
	public static void excelWrite(String sheetname, String cellvalue,String path,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException  {
        FileInputStream fis=new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Cell c=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
        String v= c.toString();

        c.setCellValue(cellvalue);

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos); 

 }

}
