package cl.jrios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arriendo_quincho")
public class ArriendoQuincho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fecha", nullable = false)
	private String fecha;

	@ManyToOne
	@JoinColumn(name = "departamento_id", nullable = false, foreignKey = @ForeignKey(name = "arriendoquincho_departamento_FK"))
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name = "estado_id", nullable = false, foreignKey = @ForeignKey(name = "arriendoquincho_estado_FK"))
	private Estado estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
