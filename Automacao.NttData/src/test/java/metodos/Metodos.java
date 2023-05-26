package metodos;

import Automacao.NttData.PesquisaGoogle.JUnit;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Set;
import static Automacao.NttData.PesquisaGoogle.JUnit.driver;

public class Metodos {
    public void scroll(int n1, int n2) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.ScrollBy(" + n1 + "," + n2 + ")");
        } catch (Exception e) {
            e.getCause();
            System.err.println("o comando não pode ser executado ");
        }
    }

    public void abrirNovaAba() {
        for (String windHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windHandle);

        }


    }

    public void trocarDeAba() {
        // Obter o nome da janela principal
        String janelaPrincipal = driver.getWindowHandle();
        // Obter todas as janelas filhas abertas
        Set<String> janelasAbertas = driver.getWindowHandles();

//Percorrer as janelas abertas e selecionar a nova janela
        for (String janela : janelasAbertas) {
            if (!janela.equals(janelaPrincipal)) {
                // trocamos de janela com código abaixo
                driver.switchTo().window(janela);
            }
        }

    }

}
