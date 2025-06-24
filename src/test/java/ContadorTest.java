import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTest {

    @Test
    public void deveExecutarContagemComParametrosValidos() {
        Contador contador = new Contador(3, 7);
        assertDoesNotThrow(() -> contador.executar());
    }

    @Test
    public void deveLancarExcecaoSeParametrosInvalidos() {
        Contador contador = new Contador(10, 5);
        ParametrosInvalidosException e = assertThrows(
                ParametrosInvalidosException.class,
                contador::executar
        );
        assertEquals("O segundo parâmetro deve ser maior que o primeiro", e.getMessage());
    }
}