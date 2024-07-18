package subsystem2;


public class CepApi {
	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getinstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Ubaira";
	}
	public String recuperarEstado(String cep) {
		return "BA";
	}
}
