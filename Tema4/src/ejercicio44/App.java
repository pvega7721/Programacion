package ejercicio44;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asesino asesino1 = new Asesino();
		asesino1.setCodigo("A1");
		asesino1.setNombre("Blau");
		Asesino asesino2= new Asesino();
		asesino2.setNombre("Situletienes");
		asesino2.setCodigo("A2");
		Asesino asesino3 = new Asesino();
		asesino3.setCodigo("A3");
		asesino3.setNombre("ConstructorAsesino");
		Jugador jugador = new Jugador();
		jugador.setNombre("TeamBlas");
		
		EquipoCombate equipo = new EquipoCombate();
		jugador.setEquipo(equipo);
		equipo.añadirPersonaje(asesino1);
		jugador.getEquipo().añadirPersonaje(asesino2);
		equipo.añadirPersonaje(asesino3);
		
		Parasito parasito = new Parasito();
		parasito.setCodigo("B69");
		parasito.setNombre("Blas");
		System.out.println(parasito.getDaño() + " cada " + parasito.getDañoTiempo());
		
		jugador.getEquipo().añadirPersonaje(parasito);
		
		System.out.println("Puntos totales del equipo: " + jugador.getEquipo().getTotalPuntosVida());
		
		
		
	}

}
