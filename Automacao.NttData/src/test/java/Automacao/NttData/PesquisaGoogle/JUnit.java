package Automacao.NttData.PesquisaGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import metodos.Metodos;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class JUnit {


    public static WebDriver driver;
    Metodos metodos = new Metodos();

    @Before
    public void iniciar() {

        String url = "https://www.google.com.br"; // Criando uma variável para guardar a URL

        WebDriverManager.chromedriver().setup(); // Gerenciando o Driver do Chrome

        driver = new ChromeDriver(); //Abrindo o Chrome

        driver.manage().window().maximize(); // Maximizando o Navegador

        driver.get(url); // Entrando no Site

    }




@Test
    public void teste() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("nttdata"); //Digitando na barra de pesquisa
        TimeUnit.MILLISECONDS.sleep(1000);
        driver.findElement(By.xpath("//textarea[@name='q']")).submit(); // enter
        TimeUnit.MILLISECONDS.sleep(4000);

        // driver.findElement(By.xpath("//span[text()='NTT DATA Business Solutions - Transformação Digital']")).click();
        driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']")).click();
        TimeUnit.MILLISECONDS.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Todos os cookies']")).click();
        TimeUnit.MILLISECONDS.sleep(1000);
        driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-32094']")).click();
        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.scroll(0,300);
        TimeUnit.MILLISECONDS.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='button'])[1]")).click();
        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.trocarDeAba();
        TimeUnit.MILLISECONDS.sleep(4000);
        driver.findElement(By.id("pesquisar-vaga-localidade-etc")).sendKeys("Arquiteto");
        TimeUnit.MILLISECONDS.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='col-xs-12 padding-5 padding-top-15 padding-bottom-15 vacancy-list-typograph'])[1]")).click();
    }
}
