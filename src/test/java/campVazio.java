using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;
using System;

public class campVazio {

    class Program
    {
        static void Main(string[] args)
        {
            IWebDriver driver = new ChromeDriver();

            // Selecionar o BOTÃO
            IWebElement campoTexto = driver.FindElement(By.Id("id-do-campo"));
            // Texto do campo
            string textoCampo = campoTexto.Text;
            //Verifica se está preenchido
            if (string.IsNullOrWhiteSpace(textoCampo))
            {
                Console.WriteLine("O campo está em branco. Por favor, preencha-o.");
            }
            else
            {
                Console.WriteLine("O campo não está em branco.");
            }
            driver.Quit();
        }
    }


}
