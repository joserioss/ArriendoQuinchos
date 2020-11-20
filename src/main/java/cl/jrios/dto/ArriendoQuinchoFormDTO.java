package cl.jrios.dto;

public class ArriendoQuinchoFormDTO {

	private String fecha_desde;
	private String fecha_hasta;
	private Integer departamento_id;
	private Integer estado_id;

	public String getFecha_desde() {
		return fecha_desde;
	}

	public void setFecha_desde(String fecha_desde) {
		this.fecha_desde = fecha_desde;
	}

	public String getFecha_hasta() {
		return fecha_hasta;
	}

	public void setFecha_hasta(String fecha_hasta) {
		this.fecha_hasta = fecha_hasta;
	}

	public Integer getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(Integer departamento_id) {
		this.departamento_id = departamento_id;
	}

	public Integer getEstado_id() {
		return estado_id;
	}

	public void setEstado_id(Integer estado_id) {
		this.estado_id = estado_id;
	}

	@Override
	public String toString() {
		return "ArriendoQuinchoFormDTO [fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta
				+ ", departamento_id=" + departamento_id + ", estado_id=" + estado_id + "]";
	}

}
