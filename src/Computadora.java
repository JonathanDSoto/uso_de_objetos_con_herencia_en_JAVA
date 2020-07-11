
public class Computadora {
	
	private String codigo;
	private double precio;
	private String eslogan;
	private String marca;
	
	public Computadora() {
		this.codigo = "";
		this.precio = 0;
		this.eslogan = "";
		this.marca = "";
	}
	
	public Computadora(String c, double p, String e, String m) {
		this.codigo = c;
		this.precio = p;
		this.eslogan = e;
		this.marca = m;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEslogan() {
		return eslogan;
	}

	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Computadora [codigo=" + codigo + ", precio=" + precio + ", eslogan=" + eslogan + ", marca=" + marca
				+ "]";
	}

}
