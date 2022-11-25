import org.junit.Test;
import org.uniproj.pessoa.*;

import static org.junit.Assert.assertEquals;
import static org.uniproj.calculadora.Calculadora.*;

public class CalculadoraTest {
	Pessoa p1 = new Pessoa( "schula", "alemão",19, 75, 175, "masculino");
	
	@Test
	public void imcTest() {
		
		double altsqr = Math.pow((double) 175/100, 2.0);
		double imc = 75/altsqr;
		calcularImc(p1);
		assertEquals(imc, p1.getImc(), 0.0);
		assertEquals("ideal", statusImc(p1));
	}
	
	@Test
	public void gorduraCorporalTest() {
		double gorduraCorporal = (1.2 * p1.getImc()) - (10.8 * ((p1.getSexo() == "feminino")? 0 : 1) + (0.23 * p1.getIdade()) - 5.4);
		assertEquals(txGorduraCorporal(p1), gorduraCorporal, 0.0);
	}
	
	@Test
	public void pesoIdealTest() {
		double pesoIdeal = (p1.getAltura() - 100) - ((p1.getAltura() - 150)/ ((p1.getSexo() == "masculino")? 4 : 2));
		assertEquals(pesoIdeal, pesoIdeal(p1),0.0);
	}
	
}