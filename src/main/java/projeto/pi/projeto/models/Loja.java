package projeto.pi.projeto.models;

public class Loja {

	private String Nome;
	private Long CNPJ;
	private String Endereço;
	private String Produtos;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public String getProdutos() {
		return Produtos;
	}

	public void setProdutos(String produtos) {
		Produtos = produtos;
	}

}
