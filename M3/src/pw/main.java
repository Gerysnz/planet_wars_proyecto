package pw;


public class main {

	public static void main(String[] args) {
		planet planet1 = new planet();
		Comprobar comprobacion = new Comprobar();
		final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
	    final String menu02 = "1)Build troops\n2)Build Defenses\n3)Go Back";
	    final String menu021 = "1)Build LigthHunter\n2)Build HeavyHunter\n3)Build BattleShip\n4)Build ArmoredShip\n5)Go Back";
	    final String menu03 = "1)Upgrade Defense Technology.\n2)Upgrade Attack Technology.\n3)Go Back";
	    final String menu05 = "Planet Wars\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n5)View Thread Comming\n0)Exit";

		boolean salir = false;
        while (!salir) {
            System.out.println(menu00);
            System.out.println("Option > ");
            int option = comprobacion.comprobarNumero();
            switch (option) {
            case 1:
            	planet1.printStats();
            	break;
            case 2:
            	 while (!salir) {
            		 System.out.println(menu02);
                     System.out.println("Option > ");
                     option = comprobacion.comprobarNumero();
                     switch (option){
                     case 1:
                    	 salir = false;
                    	 while (!salir) {
                    		 System.out.println(menu021);
                             System.out.println("Option > ");
                             option = comprobacion.comprobarNumero();
                             switch (option){
                             case 1:
                            	 System.out.println("LIGHTHUNTER");
                            	 break;
                             case 2:
                            	 System.out.println("HEAVYHUNTER");
                            	 break;
                             case 3:
                            	 System.out.println("BATTLESHIP");
                            	 break;
                             case 4:
                            	 System.out.println("ARMOREDSHIP");
                            	 break;
                             case 5:
                            	 salir = true;
                            	 break;
                             default:
          						System.out.println("\nInvalid option\n");
                            
                             }          
                            	}
                	 salir = false;
                     break;     	 
                     case 2:
                    	 System.out.println("OPCION 2");
                    	 break;
                     case 3:
                    	 salir = true;
                    	 break;
                     default:
 						System.out.println("\nInvalid option\n");
 					}
  
                     }
            salir = false;
            break;
            case 3:
            	 while (!salir) {
            		 System.out.println(menu03);
                     System.out.println("Option > ");
                     option = comprobacion.comprobarNumero();
                     switch (option){
                     case 1:
                    	 System.out.println("OPCION 1");
                    	 break;
                     case 2:
                    	 System.out.println("OPCION 2");
                    	 break;
                     case 3:
                    	 salir = true;
                    	 break;
                     default:
 						System.out.println("\nInvalid option\n");
 			
                     } 
                     }
            salir = false;
            break;
            
            case 4:
            	System.out.println("Aqui va el printStat");
            	break;
            
            case 0: // Cierra el programa
                System.out.println("Exiting...");
                salir = true;
                break;
            default:
                System.out.println("\nInvalid option\n");
		} 

}
           }
       }
	
        
