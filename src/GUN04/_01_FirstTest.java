package GUN04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_FirstTest extends BaseDriver {

    @Test

    void test1(){

        WebElement step1= driver.findElement(By.linkText("Üye Ol"));
        step1.click();

        WebElement cookie= driver.findElement(By.xpath("//div[text()='Tamam']"));
        cookie.click();

        WebElement step2= driver.findElement(By.id("firstName"));
        step2.click();

        WebElement step3= driver.findElement(By.id("lastName"));
        step3.click();

        WebElement step4= driver.findElement(By.name("email"));
        step4.click();

        WebElement step5= driver.findElement(By.id("password"));
        step5.click();

        WebElement step6= driver.findElement(By.xpath("(//div[@class='genderInputBox'])[2]"));
        step6.click();


        System.out.println("başarı ile kayıt olundu");



    }

    @Test(dependsOnMethods = {"test1"})

    void test2(){

        WebElement element= driver.findElement(By.id("searchData"));
        element.sendKeys("kitap");

        WebElement element1= driver.findElement(By.linkText("ARA"));
        element.click();


        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement element2= driver.findElement(By.linkText("Akademik Kitaplar"));
        js.executeScript("arguments[0].click();",element2);

        WebElement element3= driver.findElement(By.linkText("Tarih"));
        element3.click();

        WebElement element4= driver.findElement(By.xpath("(//div[@class='imgHolder  cargoCampaign '])[3]"));
        element4.click();

        WebElement element5= driver.findElement(By.xpath("(//button[text()='Sepete Ekle'])[1]"));
        element5.click();


        System.out.println("ilk satın alma işlemi başarı ile tamamlandı");

    }

    @Test(dependsOnMethods = {"test2"})

    void test3(){

        WebElement element1= driver.findElement(By.id("searchData"));
        element1.sendKeys("iphone15");

        WebElement element2= driver.findElement(By.cssSelector("[class='iconsSearch']"));
        element2.click();

        WebElement element3= driver.findElement(By.xpath("(//a[@title='Cep Telefonu'])[1]"));
        element3.click();

        JavascriptExecutor js1=(JavascriptExecutor) driver;
        WebElement elementhafıza= driver.findElement(By.xpath("//h2[text()='Dahili Hafıza']"));
        js1.executeScript("arguments[0].scrollIntoView(true)",elementhafıza);

        WebElement element4= driver.findElement(By.xpath("//span[text()='512 GB']"));
        element4.click();

        WebElement element5= driver.findElement(By.xpath("//h3[text()='Apple iPhone 15 Pro 512 GB (Apple Türkiye Garantili)']"));
        element5.click();

        WebElement element6= driver.findElement(By.xpath("(//button[text()='Sepete Ekle'])[1]"));
        element6.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement anasayfa= driver.findElement(By.xpath("//a[@title='hayat sana gelir']"));
        anasayfa.click();

        WebElement yazigonder= driver.findElement(By.id("searchData"));
        yazigonder.sendKeys("anakart");

        WebElement element21= driver.findElement(By.cssSelector("[class='iconsSearch']"));
        element21.click();

        WebElement tikla= driver.findElement(By.cssSelector("[title='Bilgisayar Bileşenleri']"));
        tikla.click();

        WebElement op=driver.findElement(By.xpath("//h3[text()='Gigabyte A520M K V2 AMD A520 5100 MHz (OC) DDR4 Soket AM4 mATX Anakart']"));
        op.click();


        WebElement ekle2=driver.findElement(By.xpath("(//button[text()='Sepete Ekle'])[1]"));
        ekle2.click();


        WebElement sepet=driver.findElement(By.cssSelector("[title='Sepetim']"));
        sepet.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        System.out.println("alışverişiniz başarı ile yapılmıştır");
    }
}
