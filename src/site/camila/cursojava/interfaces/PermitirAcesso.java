package site.camila.cursojava.interfaces;

//Essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {
	//apenas declaração do método
	public boolean autenticar(String login, String senha);
}
