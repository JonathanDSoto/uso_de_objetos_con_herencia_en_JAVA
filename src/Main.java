import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean on = true;
		int op = 0;
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Laptop> laptos = new ArrayList<Laptop>();
		ArrayList<Computadora> pcs = new ArrayList<Computadora>();
		
		while(on)
		{
			
			System.out.println("Desea capturar una laptop (1) o PC (2), salir (3)");
			op = teclado.nextInt();
			
			switch(op)
			{
				case 1:
					Laptop lp = new Laptop();
					System.out.println("Ingrese los datos de la LAPTOP");
					
					System.out.println("1.- Marca");
					lp.setMarca(teclado.next());
					
					System.out.println("2.- Eslogan");
					lp.setEslogan(teclado.nextLine());
					
					System.out.println("3.- Código");
					lp.setCodigo(teclado.nextLine());
					
					System.out.println("4.- Peso");
					lp.setPeso(teclado.nextDouble());
					
					System.out.println("5.- Precio");
					lp.setPrecio(teclado.nextDouble());
					
					laptos.add(lp);
					System.out.println(lp.toString());
					
				break;
				case 2:
					Escritorio pc = new Escritorio();
					System.out.println("Ingrese los datos de la PC");
					
					System.out.println("1.- Marca");
					pc.setMarca(teclado.next());
					
					System.out.println("2.- Eslogan");
					pc.setEslogan(teclado.nextLine());
					
					System.out.println("3.- Código");
					pc.setCodigo(teclado.nextLine());
					
					System.out.println("4.- Fuente de Poder");
					pc.setFuentePoder(teclado.nextLine());
					
					System.out.println("5.- Precio");
					pc.setPrecio(teclado.nextDouble());
					
					System.out.println(pc.toString());
					pcs.add(pc);
				break;
			default:
				on = false;
				break;
			} 
			
		}
		
		System.out.println(pcs.get(0).toString());
		
	}  
	 
}