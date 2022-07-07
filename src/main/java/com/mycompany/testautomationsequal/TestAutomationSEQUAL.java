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

    public static void main(String[] args) throws InterruptedException {
        runAutomation();
    }

    public static void runAutomation() throws InterruptedException {

        //Crea un grupo de opciones
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--disable-gpu", "--start-maximized", "--ignore-certificate-errors", "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage", "--disable-notifications"});

        //Descarga y configura el chromeDriver
        WebDriverManager.chromedriver().setup();

        //Crea Objeto tipo WebDriver
        WebDriver driver = new ChromeDriver(options);

        //Define 15 segundos de espera maximo para encontrar los elementos
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Accede a la pagina web
        driver.get("https://www.exito.com/");

        //Click en Mi cuenta       
        driver.findElement(By.xpath("//div[contains(@class,'vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--header-link')]")).click();

        //Espera 2 segundos      
        Thread.sleep(2000);

        //Click en ingresar con email
        driver.findElement(By.xpath("(//div[contains(@class,'vtex-button__label flex')])[3]")).click();

        //Ingreso email
        driver.findElement(By.xpath("(//input[contains(@class,'vtex-styleguide-9-x-input ma0')])[2]")).sendKeys("andrespa87@gmail.com");

        //Ingreso contraseña
        driver.findElement(By.xpath("(//input[contains(@class,'vtex-styleguide-9-x-input ma0')])[3]")).sendKeys("Qwerty123");

        //Click entrar
        driver.findElement(By.xpath("(//div[contains(@class,'vtex-button__label flex')])[3]")).click();

        //Espera 4 segundos      
        Thread.sleep(4000);

        //buscar palabra "atun"
        driver.findElement(By.xpath("//input[contains(@class,'vtex-styleguide-9-x-input ma0')]")).sendKeys("atun");

        //click en ver todos los resultados
        driver.findElement(By.className("vtex-search-2-x-tileListSeeMore")).click();

        //Click en seleccionar ciudad
        driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase-input MuiInput-input')]//div")).click();

        //Seleccionar ciudad medellin
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys("medellin");
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys(Keys.RETURN);

        //click en entrar ciudad
        driver.findElement(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton shippingaddress-confirmar']")).click();

        //Espera 10 segundos     
        Thread.sleep(15000);

        //click atun ekono  
        driver.findElement(By.xpath("//span[text()='EKONO']/following::div[@class='exito-vtex-components-4-x-blockBuyButton']")).click();

        //Click boton envio a domicilio
        driver.findElement(By.xpath("(//button[contains(@class,'exito-geolocation-3-x-orderOptionsButton ')])[2]")).click();

        //click confirmar direccion
        driver.findElement(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton addressbyuser-confirmar']")).click();

        //Espera 5 segundos      
        Thread.sleep(5000);

        //click en carrito de compras
        driver.findElement(By.xpath("(//a[contains(@class,'exito-header-3-x-minicartLink')])")).click();

        //click en ir a pagar
        driver.findElement(By.xpath("(//a[contains(@class,'btn btn-large btn-success pull-left-margin btn-place-order')])")).click();

        //Espera 10 segundos
        Thread.sleep(10000);

        
        //Cierra el navegador
        driver.close();

    }
}
