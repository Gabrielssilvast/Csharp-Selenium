from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

import static sun.security.util.KnownOIDs.EC; as EC

public class checking {

    driver = webdriver.Chrome()
            driver.get("http://exemplo.com")
    wait = WebDriverWait(driver, 10)
    // Encontra o botão pelo seletor CSS, ID, XPath, etc.
    IWebElement botao = driver.FindElement(By.Id("id-do-botao"));
    botao.Click();

            //Podemos colocar o ID ou selector xpath ou outro informção unica do botão.

    if (botao.Enabled)
    {
        Console.WriteLine("O botão é clicável!");
    }
    else
    {
        Console.WriteLine("O botão não é clicável!");
    }
        // podemos verificar se é funcional de outras formas.
driver.quit()

}


