package com.mycompany.testautomationsequal;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Andrés Patiño
 */
public class TestAutomationSEQUAL {

    public static void main(String[] args) {
        runAutomation();
    }

    public static void runAutomation() {

        //Crea un grupo de opciones
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--disable-gpu", "--start-maximized", "--ignore-certificate-errors", "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage", "--disable-notifications"});

        //Descarga y configura el chromeDriver
        WebDriverManager.chromedriver().setup();

        //Crea Objeto tipo WebDriver
        WebDriver driver = new ChromeDriver(options);

        //Define 10 segundos de espera maximo para encontrar los elementos
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Accede a la pagina web
        driver.get("https://www.exito.com/");

//        //Espera 2 segundos      
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Click en Mi cuenta       
        driver.findElement(By.xpath("//div[contains(@class,'vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--header-link')]")).click();

//        //Espera 3 segundos      
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Click en ingresar con email
        driver.findElement(By.xpath("(//div[contains(@class,'vtex-button__label flex')])[3]")).click();

//        //Espera 2 segundos      
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Ingreso email
        driver.findElement(By.xpath("(//input[contains(@class,'vtex-styleguide-9-x-input ma0')])[2]")).sendKeys("andrespa87@gmail.com");

        //Ingreso contraseña
        driver.findElement(By.xpath("(//input[contains(@class,'vtex-styleguide-9-x-input ma0')])[3]")).sendKeys("Qwerty123");

        //Click entrar
        driver.findElement(By.xpath("(//div[contains(@class,'vtex-button__label flex')])[3]")).click();

        //Espera 4 segundos      
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        //buscar palabra "atun"
        driver.findElement(By.xpath("//input[contains(@class,'vtex-styleguide-9-x-input ma0')]")).sendKeys("atun");

//        //Espera 3 segundos      
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //click en ver todos los resultados
        driver.findElement(By.className("vtex-search-2-x-tileListSeeMore")).click();

//        //Espera 6 segundos      
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Click en seleccionar ciudad
        driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase-input MuiInput-input')]//div")).click();

//        //Espera 1 segundos      
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Seleccionar ciudad medellin
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys("medellin");
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys(Keys.RETURN);

        //click en entrar ciudad
        driver.findElement(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton shippingaddress-confirmar']")).click();

        //Espera 10 segundos     
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //click atun ekono  
        driver.findElement(By.xpath("//span[text()='EKONO']/following::div[@class='exito-vtex-components-4-x-blockBuyButton']")).click();

//        //Espera 4 segundos      
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Click boton envio a domicilio
        driver.findElement(By.xpath("(//button[contains(@class,'exito-geolocation-3-x-orderOptionsButton ')])[2]")).click();

//        //Espera 10 segundos     
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //click confirmar direccion
        driver.findElement(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton addressbyuser-confirmar']")).click();

        //Espera 5 segundos      
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //click en carrito de compras
        driver.findElement(By.xpath("(//a[contains(@class,'exito-header-3-x-minicartLink')])")).click();

//        //Espera 5 segundos      
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //click en ir a pagar
        driver.findElement(By.xpath("(//a[contains(@class,'btn btn-large btn-success pull-left-margin btn-place-order')])")).click();

        //Espera 10 segundos
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestAutomationSEQUAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Cierra el navegador
        driver.close();

    }
}
