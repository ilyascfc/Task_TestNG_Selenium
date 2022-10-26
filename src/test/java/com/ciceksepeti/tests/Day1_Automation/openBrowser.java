package com.ciceksepeti.tests.Day1_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class openBrowser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.operadriver().setup();
        WebDriverManager.firefoxdriver().setup();       //chrome&firefox aynı anda mac ve tablet hariç bilgisayarı kasıyor.
        //WebDriverManager.edgedriver().setup();        //çalıştıramadım.

        WebDriver chrome_driver=new ChromeDriver();
        WebDriver opera_driver=new OperaDriver();
        WebDriver firefox_driver=new FirefoxDriver();
        //WebDriver edge_driver=new EdgeDriver();

        chrome_driver.get("https://www.ciceksepeti.com/");
        opera_driver.get("https://www.ciceksepeti.com/");
        firefox_driver.get("https://www.ciceksepeti.com/");
        //edge_driver.get("https://www.ciceksepeti.com/");

        chrome_driver.manage().window().maximize();
        opera_driver.manage().window().maximize();
        firefox_driver.manage().window().maximize();
        //edge_driver.manage().window().maximize();

        System.out.println("Chrome Title : " + chrome_driver.getTitle());
        System.out.println("Opera Title : " + opera_driver.getTitle());
        System.out.println("Mozilla Firefox Title : " + firefox_driver.getTitle());
        //System.out.println("Edge Title : " +edge_driver.getTitle());

        String expectedTitle="Çiçeksepeti - Oline Çiçek & Hediye Sitesi";
        String chrome_driverTitle= chrome_driver.getTitle();
        String opera_driverTitle= opera_driver.getTitle();
        String firefox_driverTitle= firefox_driver.getTitle();
        //String edge_driverTitle= edge_driver.getTitle();

        if (chrome_driverTitle.equals(expectedTitle) &&
                opera_driverTitle.equals(expectedTitle) &&
                firefox_driverTitle.equals(expectedTitle)){
            System.out.println("BAŞLIK DOĞRU");
        }else {
            System.err.println("BAŞLIK HATALI (" + expectedTitle + ")");
        }
    }
}
