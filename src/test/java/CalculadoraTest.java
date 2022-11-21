import org.junit.Test;
import org.uniproj.pessoa.*;

import static org.uniproj.calculadora.Calculadora.calcularImc;
import static org.uniproj.calculadora.Calculadora.statusImc;
import static org.uniproj.calculadora.Calculadora.txGorduraCorporal;

public class CalculadoraTest {
	Pessoa p1 = new Pessoa( "schula", "alemão",19, 75, 175, "masculino");
	
	@Test
	public void imcTest(Pessoa p1) {
		
		double altsqr = Math.pow((double) 175/100, 2.0);
		double imc = 75/altsqr;
		calcularImc(p1);
		assertEquals(imc, p1.getImc());
		assertString("ideal", statusImc(p1));
	}
	
	@Test
	public void gorduraCorporalTest(Pessoa p1) {
		double gorduraCorporal = (1.2 * pessoa.getImc()) - (10.8 * ((pessoa.getSexo() == "feminino")? 0 : 1) + (0.23 * pessoa.getIdade()) - 5.4);
		assertEquals(txGorduraCorporal(p1), gorduraCorporal);
	}
	
	@Test
	public void pesoIdealTest(Pessoa p1) {
		double pesoIdeal = (pessoa.getAltura() - 100) - ((pessoa.getAltura() - 150)/ ((pessoa.getSexo() == "masculino")? 4 : 2));
		assertEquals(pesoIdeal, pesoIdeal(p1));
	}
	
}