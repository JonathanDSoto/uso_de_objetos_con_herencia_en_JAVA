
public class Escritorio extends Computadora{
	
	private String fuentePoder;
	
	public Escritorio() { 
		this.fuentePoder = ""; 
		this.setCodigo("");
		this.setPrecio(0);
		this.setEslogan("");
		this.setMarca("");
	}
	
	public Escritorio(String c, double p, String e, String m, String f) {
		this.fuentePoder = f; 
		this.setCodigo(c);
		this.setPrecio(p);
		this.setEslogan(e);
		this.setMarca(m);
	}

	public String getFuentePoder() {
		return fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}
	
	public String toString() {
		return "Computadora [codigo=" + this.getCodigo() + ", precio=" + this.getPrecio() + ", eslogan=" + this.getEslogan() + ", marca=" + this.getMarca()
				+", fuente de poder=" + this.fuentePoder + " ]";
	}

}
