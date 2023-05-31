import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    void deveCalcularValorHorasExtras(){
        Funcionario func = new Funcionario();
        func.setHorasExtras(4);

        assertEquals(40.0, func.calcularHorasExtras());
    }

    @Test
    void deveRetornarValorTotalSalario(){
        Funcionario func = new Funcionario();
        func.setSalarioBase(2000.0);
        func.setHorasExtras(4);
        func.calcularHorasExtras();

        assertEquals(2040.0, func.valorTotalSalario());
    }
}
