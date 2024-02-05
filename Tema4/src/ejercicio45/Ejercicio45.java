package ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fecha;
		LocalDate nacimiento;
		Boolean correcto = false;
		LocalDate hoy = LocalDate.now();
		
		do {
			System.out.println("Introduce tu fecha de nacimiento con formato dd/MM/yyyy");
			fecha = sc.nextLine();
			
			Integer dia = Integer.parseInt(fecha.split("/")[0]);
			Integer mes = Integer.parseInt(fecha.split("/")[1]);
			Integer anyo = Integer.parseInt(fecha.split("/")[2]);
			
			nacimiento = LocalDate.of(anyo, mes, dia);
			
			if(dia>=1 && dia<=31 && mes>=1 && mes<=12 && anyo<= hoy.getYear() ) {
				correcto=true;
			}else
				correcto=false;
			
		}while(!correcto);
		
		System.out.println("¿Naciste en un año bisiesto? " + nacimiento.isLeapYear());
		System.out.println("Naciste un " + nacimiento.getDayOfWeek());
		System.out.println("Tienes " + (hoy.getYear()-nacimiento.getYear() ) + " años");
		
		LocalDate muerte= nacimiento.plusYears(100);
		Period periodo = hoy.until(muerte);
		System.out.println("Suponiendo que vives 100 años, te quedan: "
				+ periodo.getYears() + "años"
				+ periodo.getMonths() + "meses"
				+ periodo.getDays() + "dias");
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora actual: " + formato.format(hora));
		
		sc.close();
	}

}
