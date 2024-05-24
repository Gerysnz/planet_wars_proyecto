package pw;

import java.util.Scanner;
import java.util.Timer;


public class main {

	public static void main(String[] args) throws resourceException{
		planet planet1 = new planet();
		planet1.setMetal(200000);
        planet1.setDeuterium(54500);
        planet1.setTechnologyDefense(0);
        planet1.setTechnologyAtack(0);
        planet1.setUpgradeAttackTechnologyDeuteriumCost(2000);
        planet1.setUpgradeDefenseTechnologyDeuteriumCost(2000);
        
        
        planet1.newArmoredShip(1);
        planet1.newBattleShip(1);
        planet1.newLigthHunter(3);
        planet1.newMissileLauncher(1);
        planet1.newIonCannon(1);
        planet1.newPlasmaCannon(1);
        planet1.newHeavyHunter(1);     
        Timer timer = new Timer();
        
		Comprobar comprobacion = new Comprobar();
		final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
	    final String menu02 = "1)Build troops\n2)Build Defenses\n3)Go Back";
	    final String menu021 = "1)Build LigthHunter\n2)Build HeavyHunter\n3)Build BattleShip\n4)Build ArmoredShip\n5)Go Back";
	    final String menu022 = "1)Build Missile Launcher\n2)Build Ion Cannon\n3)Build Plasma Cannon\n4)Go Back";
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
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 int cantidad = comprobacion.comprobarNumero();
                            	 planet1.newLigthHunter(cantidad);
                            	 break;
                             case 2:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 cantidad = comprobacion.comprobarNumero();
                            	 planet1.newHeavyHunter(cantidad);
                            	 break;
                             case 3:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 cantidad = comprobacion.comprobarNumero();
                            	 planet1.newBattleShip(cantidad);
                            	 break;
                             case 4:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 cantidad = comprobacion.comprobarNumero();
                            	 planet1.newArmoredShip(cantidad);
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
                    	 salir = false;
                    	 while (!salir) {
                    		 System.out.println(menu022);
                             System.out.println("Option > ");
                             option = comprobacion.comprobarNumero();
                             switch (option){
                             case 1:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 int cantidad = comprobacion.comprobarNumero();
                            	 planet1.newMissileLauncher(cantidad);
                            	 break;
                             case 2:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 cantidad = comprobacion.comprobarNumero();
                            	 planet1.newIonCannon(cantidad);
                            	 break;
                             case 3:
                            	 System.out.println("Amount of Units ");
                            	 System.out.println("Amount: > ");
                            	 cantidad = comprobacion.comprobarNumero();
                            	 planet1.newPlasmaCannon(cantidad);
                            	 break;
                            
                             case 4:
                            	 salir = true;
                            	 break;
                             default:
          						System.out.println("\nInvalid option\n");
                            
                             }          
                            	}
                     salir = false;
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
//					
					int actualDefense = planet1.getTechnologyDefense();
					int actualAttack = planet1.getTechnologyAtack();
					int costDefenseUpgrade = planet1.getUpgradeDefenseTechnologyDeuteriumCost();
					int costAttackUpgrade = planet1.getUpgradeAttackTechnologyDeuteriumCost();
					int deuteriumActual = planet1.getDeuterium();
//		
					String menuUpgrade = String.format(
							"Upgrade Technology\nActual Defense Technology:             %d\nActual Attack Technology:              %d\n\n1)Upgrade Defense Technology. Cost: %d  Deuterium\n2)Upgrade Attack Technology.  Cost: %d  Deuterium\n3)Go back\n\nDeuterium resources = %d",
							actualDefense, actualAttack, costDefenseUpgrade, costAttackUpgrade, deuteriumActual);

//					
					System.out.println(menuUpgrade);
					System.out.println("Option >");
					option = comprobacion.comprobarNumero();
					switch (option){
						
							case 1:
								planet1.upgradeTechnologyDefense();
								break;
							case 2:
								planet1.upgradeTechnologyAttack();
								break;
							case 3:
								salir = true;
								break;
							}
				}
				salir = false;
				break;
            
            case 4:
            	System.out.println("Aqui va el printStat");
            	break;
            
            case 0:
                System.out.println("Exiting...");
                salir = true;
                break;
            default:
                System.out.println("\nInvalid option\n");
		} 

}
           }
       }
	
        
