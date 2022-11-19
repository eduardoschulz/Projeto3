package org.uniproj;

public class ImcTest {
	
	@Test
	public void imcTest() {
		
		Pessoa p1 = new Pessoa(19, 75, 175, "schula", "alemão", "masculino");
		Calaculadora c = new Calculadora();
		
		c.calcularImc(p1);
		System.out.prntlin(p1.getImc());
		c.statusImc(p1);
		c.txGorduraCorporal(p1);
	}
	
}