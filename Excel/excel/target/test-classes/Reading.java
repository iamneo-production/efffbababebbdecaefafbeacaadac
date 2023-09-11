import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading {
    public void read(int row,int col)
    {
        FileInputStream fis = new FileInputStream("");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        Cell cell = sheet.getRow(row).getCell(col);
        System.out.println(cell);
    }
    public static void main(String[] args) {
        
    }
}
