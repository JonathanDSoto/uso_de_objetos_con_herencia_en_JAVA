
public class Laptop extends Computadora{
		
	private double peso; 
	
	public Laptop() { 
		this.peso = 0; 
		this.setCodigo("");
		this.setPrecio(0);
		this.setEslogan("");
		this.setMarca("");
	}
	
	public Laptop(String c, double p, String e, String m, double w) {
		this.peso = w; 
		this.setCodigo(c);
		this.setPrecio(p);
		this.setEslogan(e);
		this.setMarca(m);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Computadora [codigo=" + this.getCodigo() + ", precio=" + this.getPrecio() + ", eslogan=" + this.getEslogan() + ", marca=" + this.getMarca()
				+", peso=" + this.peso + " ]";
	}
}
