package Ejercicio47;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		//paso 1
		cliente1.setDni("12345678X");
		cliente1.setNombre("Blas de los Montes");
		//falta paso 2
		Carrito carrito1 = new Carrito(cliente1);
		System.out.println(carrito1);
		//paso 3
		Ropa prenda1 = new Ropa();
		prenda1.setDescripcion("Poncho");
		prenda1.setPrecio(20.00);
		prenda1.setTalla("XL");
		prenda1.setColor("Azul");
		
		//falta paso 4
		
		//paso 5
		Libro libro1 = new Libro();
		libro1.setDescripcion("Así habló Zaratustra");
		libro1.setPrecio(15.00);
		libro1.setAutor("Nietzeche");
		
		//Falta paso 6
		//Falta paso 7
		//Falta paso 8
		//Falta paso 9
		//Falta paso 10
		
	}

}
