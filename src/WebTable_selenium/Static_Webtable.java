package WebTable_selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //depracated method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //new method
		
//*************************************************************************************************************************************		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));         //tr=table row		
		System.out.println("number of rows = "+ rows.size());                                          //total number of rows in table
		
		List<WebElement> colms = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
		System.out.println("columns or header cell= "+colms.size());                                    //total number of columns/header cell
		
		List<WebElement> headercells = driver.findElements(By.xpath("//table[@id='customers']//tr//th"));  //th=table header
		System.out.println("number of data headercells = "+ headercells.size());                           //total number of header cells
		
		List<WebElement> datacells = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));   //td=table datacell
		System.out.println("number of data cells = "+ datacells.size());                                  //total number of data cells
		
		WebElement cellvalue = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[1]"));  //get specific datacell value
		System.out.println(cellvalue.getText());                                                           //cell value of 2nd row and 1st column

		
System.out.println();//********Fetching Web-table data--(1)--datacolumn-approach********************************************************	


		for (int i=2; i<=rows.size(); i++)                     //here row starts from 2 as 1st row is header row, for header row use i=1
		{
			for (int j=1; j<=colms.size(); j++)                 //we use column size
			{
				WebElement cellsdata = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]"));   //to fetch header row only, change td to th
				System.out.print(cellsdata.getText()+"   ");
			}
			System.out.println();
		}
		
System.out.println();//********Fetching Web-table data--(2)--datacell-approach*********************************************************

		
		for (int i=1; i<rows.size(); i++)
		{
			List<WebElement> datacellsZ = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));  //to fetch header row only, change td to th
			for (int j=0; j<datacellsZ.size(); j++)                                                                      //we use cell size
			{
				System.out.print(datacellsZ.get(j).getText() + "   ");
			}
			System.out.println();
		}
		

		
		
}
}
