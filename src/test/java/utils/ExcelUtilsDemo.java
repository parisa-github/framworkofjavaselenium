package utils;


public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel  = new ExcelUtils(projectpath+"/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDatanumber(1, 1);
	}

}
