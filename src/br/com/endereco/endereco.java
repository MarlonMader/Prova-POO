package br.com.endereco;

public class endereco extends cidade {

	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	
	public String getRua() {
		return rua;
	
	}
	public void setRua(String rua) {
		this.rua = rua;
	
	}
	public int getNumero() {
		return numero;
	
	}
	public void setNumero(int numero) {
		this.numero = numero;
	
	}
	public String getBairro() {
		return bairro;
	
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	
	}
	public String getComplemento() {
		return complemento;
	
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
