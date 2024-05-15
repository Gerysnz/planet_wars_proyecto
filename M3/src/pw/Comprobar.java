package pw;

import java.util.Scanner;

public class Comprobar {
	 public int comprobarNumero() {
	     Scanner sc = new Scanner(System.in);
	     int opcion = 99;
	     String mierda = "";
	     if (!sc.hasNextInt()) {
	         System.out.println("No has metido un número");
	         sc.nextLine();
	     } else {
	         opcion = sc.nextInt();
	         mierda = sc.nextLine();
	         if (!mierda.equals("")) {
	             System.out.println("Solo mete un número");
	         }
	     }
	     return opcion;


	 }

	}

