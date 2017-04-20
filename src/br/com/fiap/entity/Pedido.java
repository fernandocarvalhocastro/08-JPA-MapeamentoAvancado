package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PEDIDO")
@SequenceGenerator(allocationSize=1, name="seqPedido", sequenceName="SQ_PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(generator="seqPedido", strategy=GenerationType.SEQUENCE)
	@Column(name="CD_PEDIDO")
	private int codigo;
	
	@Column(name="DT_PEDIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column(name="NM_CLIENTE", length=100)
	private String nomeCliente;

	public Pedido(){
		
	}
	
	public Pedido(Calendar data, String nomeCliente) {
		super();
		this.data = data;
		this.nomeCliente = nomeCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
