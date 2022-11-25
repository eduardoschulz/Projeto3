import org.junit.Test;
import org.uniproj.pessoa.Pessoa;

import static org.uniproj.arquivo.Json.jsonToPessoa;
import static org.uniproj.arquivo.Json.pessoaToJson;

public class JsonTest {
	Pessoa p1 = new Pessoa( "schula", "alemão",19, 75, 175, "masculino");
	String s = "Teste";

	@Test
	public void pessoaToJsonTest() {
		pessoaToJson(p1);
	}
		
	/*@Test
	public void jsonToPessoaTest() {
		jsonToPessoa(s);
	}*/
}
