package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
@SequenceGenerator(allocationSize=1, name="seqProduto", sequenceName="SQ_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(generator="seqProduto", strategy=GenerationType.SEQUENCE)
	@Column(name="CD_PRODUTO")
	private int codigo;
	
	@Column(name="NM_PRODUTO", nullable=false, length=100)
	private String nome;
	
	@Column(name="VLPRODUTO", nullable=false)
	private float valor;

	
	public Produto(){
		
	}
	
	public Produto(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
