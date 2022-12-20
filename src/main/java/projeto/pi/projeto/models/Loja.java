package projeto.pi.projeto.models;

public class Loja {

	private String Nome;
	private String CNPJ;
	private String Endereço;
	private String TipoDeProduto;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public String getTipoDeProduto() {
		return TipoDeProduto;
	}

	public void setTipoDeProduto(String tipoDeProduto) {
		TipoDeProduto = tipoDeProduto;
	}

}
