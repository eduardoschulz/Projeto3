import org.junit.Test;
import org.uniproj.pessoa.*;

import static org.uniproj.calculadora.Calculadora.calcularImc;
import static org.uniproj.calculadora.Calculadora.statusImc;
import static org.uniproj.calculadora.Calculadora.txGorduraCorporal;

public class ImcTest {
	
	@Test
	public void imcTest() {
		
		Pessoa p1 = new Pessoa(19, 75, 175, "schula", "alemão", "masculino");
		calcularImc(p1);
		System.out.println(p1.getImc());
		statusImc(p1);
		txGorduraCorporal(p1);
	}
	
}