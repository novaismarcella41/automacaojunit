package br.com.inter;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		//codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//comando para chamar o driver dentro do before
		driver = new ChromeDriver();
		driver.get("https://www.bancointer.com.br/");
	//comando para minizar a tela 
    driver.manage().window().maximize();
    //comando para interagir com o elemento 
	 driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
	 driver.findElement(By.id("nome")).sendKeys("Teste flash code");
	driver.findElement(By.id("celular")).sendKeys("11940222585");
	driver.findElement(By.id("email")).sendKeys("geovanamarcella41@gmail.com");
	driver.findElement(By.id("cpf")).sendKeys("44805832894");
	driver.findElement(By.id("dataNascimento")).sendKeys("01051998");
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[6]/div/label")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[7]/button")).click();

	
	
	}
	
	@After
	public void tearDown() throws Exception {
   driver.quit();
	
		
		
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
	    System.out.println(texto);
	    assertEquals(texto,"Prontinho! Recebemos os seus dados.");
	  


	}

}
