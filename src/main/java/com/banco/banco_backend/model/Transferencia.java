package com.banco.banco_backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String concepto;
	private Date fecha;
	private Double importe;

	@ManyToOne
	private Cliente ordenante;
	@ManyToOne
	private Cliente beneficiario;

	public Transferencia() {
		// TODO Auto-generated constructor stub
	}

	@PrePersist
	private void antesDeGuardar() {
		if (this.fecha == null) {
			this.fecha = new Date();
		}
		;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Cliente getOrdenante() {
		return ordenante;
	}

	public void setOrdenante(Cliente ordenante) {
		this.ordenante = ordenante;
	}

	public Cliente getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Cliente beneficiario) {
		this.beneficiario = beneficiario;
	}

}
