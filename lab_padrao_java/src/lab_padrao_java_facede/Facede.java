package lab_padrao_java_facede;

import subsystem.CrmService;
import subsystem2.CepApi;

public class Facede {
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getinstancia().recuperarCidade(cep);
		String estado = CepApi.getinstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
