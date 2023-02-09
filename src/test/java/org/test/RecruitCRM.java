package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RecruitCRM extends BaseClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://neo-mr.recruitcrm.io/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("sTestEmail")).sendKeys("ponnagarajchitrambalam@gmail.com");
	driver.findElement(By.id("sTestPassword")).sendKeys("Naren0150");
	driver.findElement(By.id("sTestLoginBtn")).click();
	Thread.sleep(8000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Actions a= new Actions(driver);
	Robot key=new Robot();
	
	/*
	driver.findElement(By.xpath("//a[@class='menu-link candidate']")).click();
	WebElement canditate = driver.findElement(By.xpath("//td/following::a[@class='media-a is-hidden-mobile']"));
	js.executeScript("arguments[0].click()", canditate);
	driver.findElement(By.xpath("(//i[@class='material-icons'])[23]")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys("1234567890");
	driver.findElement(By.id("sTest-candidateCity")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.id("sTest-candidateCity")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("sTest-candidateCity")).sendKeys("Madurai");
	WebElement dropDown = driver.findElement(By.xpath("(//div[@class='dropdown-trigger'])[8]"));
	js.executeScript("arguments[0].scrollIntoView(true)", dropDown);
	a.click(dropDown).perform();
	Thread.sleep(3000);
	WebElement yr = driver.findElement(By.xpath("(//a[@class='button'])[3]/following::div[@class='dropdown-menu'][1]/child::div/child::a[contains(text(),'5')][1]"));
	js.executeScript("arguments[0].click()", yr);
	driver.findElement(By.id("sTest-candidateAddBtn")).click();
	System.out.println("Completed TestCase-01");
	
	
	Thread.sleep(5000);
	WebElement editIcon = driver.findElement(By.xpath("(//span[@class='text-truncate inline-link'])[1]"));
	editIcon.click();
	//a.moveToElement(editIcon).click().perform();
	//driver.findElement(By.xpath("(//a[@class='button'])[3]")).click();
	driver.findElement(By.xpath("//input[@*='Current Organization']")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.xpath("//input[@*='Current Organization']")).sendKeys(Keys.DELETE);
	driver.findElement(By.xpath("//input[@*='Current Organization']")).sendKeys("sinapse Software");
	Thread.sleep(2000);
	key.keyPress(KeyEvent.VK_ENTER);
	System.out.println("Completed Testcase-02");
	
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='menu-link job']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='mdi mdi-pencil']")).click();
	Thread.sleep(2000);
	
	WebElement id = driver.findElement(By.xpath("(//p[contains(text(),'ID')]/following::span[@class='check'])[1]"));
	boolean actualId = id.isSelected();
	if(actualId==false) {
		js.executeScript("arguments[0].click()", id);
	}
	System.out.println(id+" in ID selection");

	WebElement specialization = driver.findElement(By.xpath("(//p[contains(text(),'Specialization')]/following::span[@class='check'])[1]"));
	js.executeScript("arguments[0].scrollIntoView(true)", specialization);
	boolean actualSpec = specialization.isSelected();
	System.out.println(actualSpec+" in Specialization selection");
	if(actualSpec==false) {
		js.executeScript("arguments[0].click()", specialization);
	}

	WebElement collaborator = driver.findElement(By.xpath("(//p[contains(text(),'Collaborator')]/following::span[@class='check'])[1]"));
	js.executeScript("arguments[0].scrollIntoView(true)", collaborator);
	boolean actualColl = specialization.isSelected();
	System.out.println(actualColl+" in Collaborator selection");
	if(actualColl==false) {
		js.executeScript("arguments[0].click()", collaborator);
	}
	
	driver.findElement(By.xpath("//input[@*='sTest-searchFields']")).sendKeys("city");
	WebElement city = driver.findElement(By.xpath("(//p[contains(text(),'City')]/following::span[@class='check'])[1]"));
	boolean actualCity = city.isSelected();
	System.out.println(actualCity+" in City selection");
	if(actualCity==false) {
		js.executeScript("arguments[0].click()", city);
	}
	
	WebElement exit = driver.findElement(By.xpath("//button[@class='modal-close is-large']"));
	js.executeScript("arguments[0].click()", exit);
	List<WebElement> tableHeadings = driver.findElements(By.tagName("th"));
	for(int i=0; i<tableHeadings.size(); i++) {
	System.out.println(tableHeadings.get(i).getText());
	}
	System.out.println("Completed Testcase-03");

	
	driver.findElement(By.xpath("//a[@class='menu-link candidate']")).click();
	WebElement canditate1 = driver.findElement(By.xpath("//td/following::a[@class='media-a is-hidden-mobile']"));
	js.executeScript("arguments[0].click()", canditate1);
	driver.findElement(By.xpath("(//i[@class='material-icons'])[23]")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("sTest-candidateMobile")).sendKeys("1234567890");
	driver.findElement(By.id("sTest-candidateCity")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.id("sTest-candidateCity")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("sTest-candidateCity")).sendKeys("Madurai");
	WebElement dropDown1 = driver.findElement(By.xpath("(//div[@class='dropdown-trigger'])[8]"));
	js.executeScript("arguments[0].scrollIntoView(true)", dropDown1);
	a.click(dropDown1).perform();
	Thread.sleep(3000);
	WebElement yr1 = driver.findElement(By.xpath("(//a[@class='button'])[3]/following::div[@class='dropdown-menu'][1]/child::div/child::a[contains(text(),'5')][1]"));
	js.executeScript("arguments[0].click()", yr1);
	driver.findElement(By.id("sTest-candidateLangRowAddBtn")).click();
	driver.findElement(By.id("sTest-candidateLanguage")).sendKeys(Keys.CONTROL, "a");
	driver.findElement(By.id("sTest-candidateLanguage")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("sTest-candidateLanguage")).sendKeys("Tamil");
	
	driver.findElement(By.id("sTest-candidateProficiencyLevel")).click();
	System.out.println("clicked on proficient");
	
	WebElement level = driver.findElement(By.xpath("//div[@class='collapse card card-accordian resume-collapse']//ancestor::a/child::span[contains(text(),'Native')]"));
	System.out.println("level");
	js.executeScript("arguments[0].scrollIntoView(true)", level);
	js.executeScript("arguments[0].click()", level);
	driver.findElement(By.id("sTest-candidateAddBtn")).click();
	
	System.out.println("Completed TestCase-04");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='menu-link contact']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td/following::a[@class='media-a is-hidden-mobile']")).click();
	Thread.sleep(3000);
	WebElement img = driver.findElement(By.xpath("//a[@class='change-profile-picture']"));
	js.executeScript("arguments[0].click()", img);
	Thread.sleep(3000);
	
	
	WebElement changeBtn = driver.findElement(By.xpath("//a[text()='Change']"));   //(//input[@*='sTest-uploadFile-undefined'])[2]
	//.sendKeys("C:\\Users\\Mohanraj-93\\Desktop\\Recruit CRM\\profile.jpg");
	//js.executeScript("arguments[0].setAttribute('value','C:\\Users\\Mohanraj-93\\Desktop\\Recruit CRM\\profile.jpg')", changeBtn);
	Thread.sleep(10000);
	//javascriptClick(changeBtn);
	changeBtn.click();
	StringSelection selection= new StringSelection("C:\\Users\\Mohanraj-93\\Desktop\\Recruit CRM\\profile.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Robot r=new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//imageUpload("C:\\Users\\Mohanraj-93\\Desktop\\Recruit CRM\\profile.jpg",changeBtn);
	//key.keyPress(KeyEvent.VK_ENTER);
	//key.keyRelease(KeyEvent.VK_ENTER);
	key.keyPress(KeyEvent.VK_ESCAPE);
	key.keyRelease(KeyEvent.VK_ESCAPE);
	System.out.println("Completed TestCase-05");

	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='menu-link mailbox']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("//button[contains(text(),'Opened')]")).click();
	boolean urlOpened = driver.getCurrentUrl().contains("opened");
	System.out.println(urlOpened+" to opened is in url");
	
	driver.findElement(By.xpath("//button[contains(text(),'Failed')]")).click();
	boolean urlFailed = driver.getCurrentUrl().contains("failed");
	System.out.println(urlFailed+" to failed is in url");
	
	driver.findElement(By.xpath("(//a[contains(text(),'Email Templates')])[1]")).click();
	boolean urlTemp = driver.getCurrentUrl().contains("templates");
	System.out.println(urlTemp+" to templates is in url");
	
	driver.findElement(By.xpath("(//a[contains(text(),'Email Templates')])[2]")).click();
	boolean urlStdTemp = driver.getCurrentUrl().contains("standard");
	System.out.println(urlStdTemp+" to standard is in url");
	
	System.out.println("Completed TestCase-06");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='menu-link candidate']")).click();
	Thread.sleep(3000);
	WebElement canditate2 = driver.findElement(By.xpath("//td/following::a[@class='media-a is-hidden-mobile']"));
	js.executeScript("arguments[0].click()", canditate2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//i[@class='material-icons'])[23]")).click();
	Thread.sleep(8000);
	WebElement eduQualification = driver.findElement(By.id("sTest-candidateQualification"));
	js.executeScript("arguments[0].scrollIntoView(true)", eduQualification);
	System.out.println(eduQualification.getAttribute("value"));
	
	WebElement eduSpecification = driver.findElement(By.id("sTest-candidateSpecialization"));
	js.executeScript("arguments[0].scrollIntoView(true)", eduSpecification);
	System.out.println(eduSpecification.getAttribute("value"));
	
	WebElement acaOrganization = driver.findElement(By.id("sTest-candidateOrganisation"));
	js.executeScript("arguments[0].scrollIntoView(true)", acaOrganization);
	System.out.println(acaOrganization.getAttribute("value"));
	
	WebElement acaTotalExp = driver.findElement(By.id("sTest-candidateTotalExp"));
	js.executeScript("arguments[0].scrollIntoView(true)", acaTotalExp);
	System.out.println(acaTotalExp.getAttribute("value"));
	
	WebElement acaCurrentSal = driver.findElement(By.id("sTest-candidateAnnualSalary"));
	js.executeScript("arguments[0].scrollIntoView(true)", acaCurrentSal);
	System.out.println(acaCurrentSal.getAttribute("value"));
	
	WebElement acaExpectedSal = driver.findElement(By.id("sTest-candidateExpectatedSalary"));
	js.executeScript("arguments[0].scrollIntoView(true)", acaExpectedSal);
	System.out.println(acaExpectedSal.getAttribute("value"));
	WebElement close = driver.findElement(By.xpath("//a[text()='Close']"));
	close.click();
//	js.executeAsyncScript("arguments[0].click()", exit);
	//Note tested resume, personal info, language, technical skills	
	
	System.out.println("Completed TestCase-07");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='menu-link taskandmeeting']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//td//input[@type='checkbox']/following-sibling::span[@class='check'])[1]")).click();
	String alertMsg = driver.findElement(By.xpath("//div[text()='Field Updated Successfully']")).getText();
	//	Alert alert=driver.switchTo().alert();
	System.out.println(alertMsg);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//td//input[@type='checkbox']/following-sibling::span[@class='check'])[1]")).click();
	//Can't catch the alert through automation
	System.out.println("Completed TestCase-08");
	
	Thread.sleep(3000);
	
	*/
	
	//driver.findElement(By.xpath("//a[@class='menu-link dashboard']")).click();
	Thread.sleep(3000);
	WebElement exportSpreadSheets = driver.findElement(By.xpath("(//a[@class='button is-link is-success is-small'])[3]"));
	//js.executeScript("aruguments[0].scrollIntoView(true)", exportSpreadSheets);
	exportSpreadSheets.click();
	Thread.sleep(10000);
	boolean fileDownloaded = isFileDownloaded("C:\\Users\\Mohanraj-93\\Downloads", "Candidate Pipeline Of Ponnagaraj Chitrambalam's Recruiter.csv");
	System.out.println(fileDownloaded+" in file downloaded");
	System.out.println("Completed TestCase-09"); 

}
}
