package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\k_sur\\Desktop\\Nitish\\Project\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement e) {
		e.click();

	}

	public static String getTittle() {
		String title = driver.getTitle();
		return title;

	}

	public static String getUrl() {
		String Url = driver.getCurrentUrl();
		return Url;

	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void selectByVisibleText(WebElement element, String text) {

		new Select(element).selectByVisibleText(text);

	}

	public static String getTextAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static String getDataFromExcel(int row, int cell) throws IOException {
		String value = null;
		File loc = new File("C:\\Users\\k_sur\\eclipse-workspace\\Cucumber\\Excel\\integration.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int type = c.getCellType();

		if (type == 1) {

			value = c.getStringCellValue();

		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
				value = sim.format(dateCellValue);

			} else {

				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}

		}
		return value;

	}
	public static void getScreenShot(String path) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		java.util.Date date=new java.util.Date();
		File d=new File(("C:\\Users\\k_sur\\Desktop\\Nitish")+"screenshot"+date.getTime()+".png");
		FileUtils.copyFile(s, d);

	}

	
}