package ec.edu.ups.demoJakartaa.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="TBL_CLIENTE")
public class Cliente {
	@Id
	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Column(name = "cli_direccion")
	private String direccion;
	
	//Getters & Setters
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
