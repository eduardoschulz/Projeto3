import org.junit.Test;

public class PessoaTest {
	Pessoa p1 = new Pessoa( "schula", "alemão",19, 75, 175, "masculino");
	String codigo = "codigo";

	@Test
	public void setCodigoTest() {
		p1.setCodigo(codigo);
		System.out.println(p1.getCodigo());
	}
	
	@Test
	public void getImcTest() {
		p1.setImc(20);
		System.out.println(p1.getImc);
	}
}
