import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;


public class msgErro {

    class Program
    {
        static <string> void Main(string[] args)
        {
            // Inicializa o WebDriver do Selenium
            IWebDriver driver = new ChromeDriver();

            // Acessa a página onde as mensagens de erro estão presentes
            driver.Navigate().GoToUrl("http://exemplo.com");

            // Encontra o elemento de mensagem de erro pode ser através do ID
            IWebElement mensagemErro = driver.FindElement(By.Id("btn-id"));

            // Altera a cor da mensagem de erro para vermelho usando estilo CSS
            driver.ExecuteScript("arguments[0].style.color = 'red';", mensagemErro);

            // Adiciona um contorno vermelho à mensagem de erro usando estilo CSS
            driver.ExecuteScript("arguments[0].style.border = '1px solid red';", mensagemErro);

            // Fecha o navegador
            driver.Quit();
        }
    }

}
