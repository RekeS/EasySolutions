package modelo;

public class Producto {

	private String nombre;
	private String codigo;
	private int valor;
	private int manoDeObra;

	public Producto() {

	}
	
	

	public Producto(String codigo, String nombre, int valor, int manoDeObra) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.valor = valor;
		this.manoDeObra = manoDeObra;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getManoDeObra() {
		return manoDeObra;
	}

	public void setManoDeObra(int manoDeObra) {
		this.manoDeObra = manoDeObra;
	}

	
}
