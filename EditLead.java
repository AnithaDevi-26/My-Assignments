package week2day1seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AnithaDevi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gavaskar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anithadevi@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(state);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//Edit
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);		
		
				}
}

