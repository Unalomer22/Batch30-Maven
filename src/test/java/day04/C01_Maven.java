package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class C01_Maven {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // 1. amazon.com sayfasina git
        driver.get("https://www.amazon.com/");

        // 2. arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.click();
        // 3. "Samsung headphones" ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);
        Thread.sleep(2000);
        // 4. Bulunan sonuc ayisini yazdirin
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("sonucYazisiElementi.getText() = " + sonucYazisiElementi.getText());
        // 5. ilk urunu tikla
        WebElement ilkUrunElementi = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        ilkUrunElementi.click();
        // Sadece bir click yapacaksak webelement olusturmaya gerek yok
        // Direk locate edip sonra click yapabiliriz.
        //         driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        // 6. Sayfadaki tüm basliklari yazdir
        WebElement basliklarTum = driver.findElement(By.xpath("//div[@id='nav-xshop']"));

        List<WebElement> urunlerListesi = driver.findElements(By.xpath("//div[@id='nav-xshop']"));

        for (WebElement each:urunlerListesi) {
            System.out.println(each.getText());
        }

        driver.close();





    }




}
