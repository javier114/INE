import java.util.Scanner;
import java.security.SecureRandom;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		RegistroINE d = new RegistroINE();
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();

		do {

			System.out.println("\n" +"------------\n" + " 1) Registrar una INE       \n" + "                                     \n" + "                                     \n" + " 2) Ver todas las INES           \n" );
			int ans = sc.nextInt();

			if (ans == 1) {
				// CREAR CUENTA
				p.setClaveElectoralP(rand.nextInt(2000));
				
				System.out.println("Nombre:");
				p.setNombrePersona(sc.next());
				
				System.out.println("Apellido paterno:");
				p.setApellidoPPersona(sc.next());
				
				System.out.println("Apellido materno:");
				p.setApellidoMPersona(sc.next());
				
				System.out.println("Domicilio:");
				p.setDomicilio(sc.next());
				
				System.out.println("Curp:");
				p.setCurp(sc.next());
				
				
				
				System.out.println("Fecha de nacimiento:");
				p.setAñoNacimiento(sc.next());
				
				System.out.println("Sexo:");
				p.setSexo(sc.next());
				
				System.out.println("AñoRegistroINE:");
				p.setAñoRegistroINE(sc.nextInt());
				
				System.out.println("Estado:");
				p.setEstado(sc.nextInt());
				
				System.out.println("Localidad:");
				p.setLocalidad(sc.nextInt());
				
				System.out.println("Municipio:");
				p.setMunicipio(sc.nextInt());
				
				System.out.println("Emision:");
				p.setEmision(sc.nextInt());
				
				System.out.println("Seccion:");
				p.setSeccion(sc.nextInt());
				
				System.out.println("Vigencia:");
				p.setVigencia(sc.nextInt());
				
				d.insertarRegistro(p);
				System.out.println(p);
			} 
			
			else if (ans == 2) {
				System.out.println("Ingresa tu ClaveElectoralP:");
				p.setClaveElectoralP(sc.nextInt());
				p = d.seleccionarPersona(p);
				System.out.println(p);
			} 

		}

		while (true);


	}

}
