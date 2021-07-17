package com.example.demo.DTO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.example.demo.entities.ClientEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class PedidoDTO {

	private Long id;

	private Long numeroDoPedido;

	private Double valorTotalDoPedido;

	private LocalDate dataDoPedido;

	private LocalDate dataDaEntrega;

	private String status;

	private Set<ProdutosPedidosDTO> listaProdutos = new HashSet<>();

	@JsonIgnore
	private ClientEntity cliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(Long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public Double getValorTotalDoPedido() {
		return valorTotalDoPedido;
	}

	public void setValorTotalDoPedido(Double valorTotalDoPedido) {
		this.valorTotalDoPedido = valorTotalDoPedido;
	}

	public LocalDate getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(LocalDate dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}

	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ClientEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClientEntity cliente) {
		this.cliente = cliente;
	}

	public Set<ProdutosPedidosDTO> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(Set<ProdutosPedidosDTO> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	@Override
	public String toString() {
		
		return "\nPedido nº " + numeroDoPedido + "\n\nValor Total do Pedido  R$" + valorTotalDoPedido
				+ "\n\nData do Pedido: " + dataDoPedido+ "\n\nData da Entrega: " + dataDaEntrega
				+ "(Seu pedido chegará em 10 dias úteis)" + "\n\nStatus: " + status + "\n\nLista de Produtos: "
				+ listaProdutos;
	}

}
