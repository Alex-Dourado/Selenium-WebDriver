package com.selenium.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    private WebDriver driver;
    private String url_caminho = "https://www.google.com.br/";

    @Test
    public void pesquisar() {

        // Configura automaticamente o ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Inicia o Chrome
        driver = new ChromeDriver();

        // Abre o Google
        driver.get(url_caminho);

         // *** Localiza a barra de pesquisa ***
        WebElement barraPesquisa = driver.findElement(By.name("q"));

          // *** Clica no campo ***
        barraPesquisa.click();

        // *** Digita o texto ***
        String textoDigitado = "Linkendin";
        barraPesquisa.sendKeys(textoDigitado);

        // *** Validação do texto digitado ***
        Assertions.assertEquals(textoDigitado, barraPesquisa.getAttribute("value"));

        

        // Espera alguns segundos só para visualizar (opcional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        // Fecha o navegador
        driver.quit();
    }
}
