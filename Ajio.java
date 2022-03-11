package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chd= new ChromeDriver();
		//launch the URL
		chd.get("https://www.ajio.com/");
		chd.manage().window().maximize();
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		// In the search box, type as "bags" and press enter
       chd.findElement(By.xpath("//input[@name= 'searchVal']")).sendKeys("Bags", Keys.ENTER);
       
       // To the left  of the screen under " Gender" click the "Men"
       chd.findElement(By.xpath("//label[@class= 'facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
       Thread.sleep(2000);
       
       //Under "Category" click "Fashion Bags"
       chd.findElement(By.xpath("//label[@class= 'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
       
       //Print the count of the items Found. 
       String totalitems=chd.findElement(By.className("length")).getText();
       System.out.println("the count of total items are"+totalitems);
       
       //Get the list of brand of the products displayed in the page and print the list.
       List<WebElement> brandNameList= chd.findElements(By.className("brand"));
       System.out.println("size of the brandname is" + brandNameList.size());
       for(WebElement WebElement1:brandNameList){
    	   String text= WebElement1.getText();
    	   System.out.println("the brandnames are"+text);
       }
       //Get the list of names of the bags and print it
       List<WebElement> bagNameList= chd.findElements(By.className("nameCls"));
       System.out.println("size of the bagnames are" + bagNameList.size());
       for(WebElement WebElement2:bagNameList){
    	   String text2= WebElement2.getText();
    	   System.out.println("the bagnames are"+text2);
    	   
    	   
    	   
       
       }
}
}

       
       
       
	

	

