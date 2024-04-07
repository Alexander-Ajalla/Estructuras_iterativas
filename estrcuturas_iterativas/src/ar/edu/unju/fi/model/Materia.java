package ar.edu.unju.fi.model;

public class Materia {
	
	private String codigo;
	private String nombre;
	
	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "\ncodigo:" + this.codigo+  "\nnombre:" + this.nombre;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombreMateria(String nombre) {
		this.nombre = nombre;
	}
	
	
}
