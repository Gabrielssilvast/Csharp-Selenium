import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;



public class teste01
{
    public static void Main(string[] args)
    {
//      https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("url do projeto");
        //Alterando o tamanho da pagina
        driver.manage().window().setSize(new Dimension(1000, 800));
        driver.Navigate().GoToUrl("url");

        string input = "1 + A";
        bool success = double.TryParse(input, out double result);

        if (success)
        {
            //verificando se podera ter uma resposta adequada
            Console.WriteLine("A conversão foi bem-sucedida. O número convertido é: " + result);
        }
        else
        {
            Console.WriteLine("Não foi possível converter a string em um número.");
        }

        driver.Quit();
    }

    static <IWebDriver> void contandocolchetes(IWebDriver driver)
            //Verificando os colchetes
    {
        string expressao = "2 - (5 + 1)";
        // Realizando a verificação seguencial dentro da equação
        Stack<char> stack = new Stack<char>();

        foreach (char c in equation)
        {
            if (c == '(')
            {
                stack.Push(c);
            }
            else if (c == ')')
            {
                if (stack.Count == 0 || stack.Peek() != '(')
                {
                    return false;
                }
            }
        }

        return stack.Count == 0;
        // try catch para verificar os colchetes
        try
        {
            IWebElement errorElement = driver.FindElement(By.Id("error-message"));
            string errorMessage = errorElement.Text;
            Console.WriteLine("Mensagem de erro a ser exibida: " + errorMessage);
        }
        catch (NoSuchElementException)
        {
            Console.WriteLine("Não foram encontrados erros de colchetes.");
        }
    }

}
