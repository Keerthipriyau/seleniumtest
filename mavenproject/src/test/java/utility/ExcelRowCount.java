package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowCount {
	
	public static int excelRowCount(String sheetname, String path) throws EncryptedDocumentException, InvalidFormatException, IOException {
        int rc=0;
        try{
        FileInputStream fis=new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
         rc=wb.getSheet(sheetname).getLastRowNum();
	}
	catch(Exception e){
	
	}

        return rc;
        
 }


}
