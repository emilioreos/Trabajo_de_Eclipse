package kanban;

import java.util.Date;

public class Tarea {
	private String descripcion,categoria,propietario;
	private Date fechaDeEntrega,fechaDeCreacion;
	private Estado ESTADO;
	private int prioridad;
	public String getDescripcion() {
		return descripcion;
	}
	public Estado getESTADO() {
		return ESTADO;
	}
	public void setESTADO(Estado eSTADO) {
		ESTADO = eSTADO;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public Estado getEstado() {
		return ESTADO;
	}
	public void setEstado(Estado estado) {
		this.ESTADO = estado;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
}
