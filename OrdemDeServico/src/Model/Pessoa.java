package Model;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String endereco;
	private Integer telefone;
	private String  itens;
	private Date data ;
	private Double valor;

	
	public Pessoa(Double valor) {
		super();
		this.valor = valor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getItens() {
		return itens;
	}
	public void setItens(String itens) {
		this.itens = itens;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Pessoa(String nome, String endereco, Integer telefone, String itens, Date data) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.itens = itens;
		this.data = data;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
