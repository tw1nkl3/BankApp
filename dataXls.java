/* import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataXls {
    public static void main(String[] args){
        //filePath - это путь до MS Excel
        Workbook book = new XSSFWorkbook(new FileInputStream("C:/programming/BankApp/data.xls"));
        //считывается лист по индексу sheet_index. sheet_index начинается с 0
        Sheet sheet = book.getSheetAt(0);
        //считывается row по индексу row_index. row_index начинается с 0
        Row row = sheet.getRow(0);
        //считывается cell по индексу cell_index. cell_index начинается с 0
        Cell cell = sheet.getCell("A");
    }
}
 */