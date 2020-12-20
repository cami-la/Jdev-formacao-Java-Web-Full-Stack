package site.camila.cursojava.classesauxiliares;

import site.camila.cursojava.interfaces.PermitirAcesso;

//Realmente e somente receber alguém que tem o contrato da interface de PermitirAcesso e chamar o autenticar.
public class FuncaoAutenticacao {
	// atributos
	private PermitirAcesso permitirAcesso;

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

}
