import java.util.io.*;
import ExcelReader;

class Main(){
    static int main(){
        ExcelReader excelReader = new ExcelReader();
        List<List<String>> excelData = excelReader.readExcel("/path/to/excel/file.xlsx");

        return 0;
    }
}
