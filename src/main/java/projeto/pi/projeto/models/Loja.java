package projeto.pi.projeto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String CNPJ;
	private String Nome;
	private String Endereço;
	private String TipoDeProduto;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Loja [id=" + id + ", CNPJ=" + CNPJ + ", Nome=" + Nome + ", Endereço=" + Endereço + ", TipoDeProduto="
				+ TipoDeProduto + "]";
	}
	
}
