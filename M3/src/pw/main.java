package pw;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;


public class main implements variables{
	private planet planeta;
	private battle pelea;
	 //createenemyarmy
	private  int metalEnemigo = METAL_BASE_ENEMY_ARMY;
	private int deuterioEnemigo = DEUTERIUM_BASE_ENEMY_ARMY;
    main(){
    	this.planeta = new planet();
    	this.pelea = new battle();
    }

	public static void main(String[] args) throws resourceException{
		main programa = new main();
		programa.getPlaneta();
		
		planet planet1 = programa.getPlaneta();
		battle machetazos = programa.getPelea();
		planet1 = new planet();
		programa.createEnemyArmy();
		
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
        
       
        for (int i = 0; i < machetazos.getArmies().length; i++) {
        	for (int j = 0; j < machetazos.getArmies()[i].length; j++) {
        		System.out.println(machetazos.getArmies()[i][j]);
            
            }
        }
        System.out.println("despues de machetazos.setarmy");
        
        programa.batalla();
        
               
		Comprobar comprobacion = new Comprobar();
		final String menu00 = "\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n0)Exit";
	    final String menu02 = "1)Build troops\n2)Build Defenses\n3)Go Back";
	    final String menu021 = "1)Build LigthHunter\n2)Build HeavyHunter\n3)Build BattleShip\n4)Build ArmoredShip\n5)Go Back";
	    final String menu022 = "1)Build Missile Launcher\n2)Build Ion Cannon\n3)Build Plasma Cannon\n4)Go Back";
	    final String menu03 = "1)Upgrade Defense Technology.\n2)Upgrade Attack Technology.\n3)Go Back";
	    final String menu05 = "Planet Wars\n1)View Planet Stats\n2)Build\n3)Upgrade Technology\n4)View Battle Reports\n5)View Thread Comming\n0)Exit";
	   
		boolean salir = false;
		ArrayList<militaryUnit>[] armies = new ArrayList[4];
        for (int i = 0; i < armies.length; i++) {
            armies[i] = new ArrayList<militaryUnit>();
        }
        
        armies[0].add(new ligthHunter());
        armies[1].add(new heavyHunter());
        armies[2].add(new battleShip());
        armies[3].add(new armoredShip());
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
       
	public void createEnemyArmy() {
		int recursosMetal = metalEnemigo;
	    int recursosDeuterium = deuterioEnemigo;
	    int[] porcentajesEnemy = {35, 25, 20, 20}; // LigthHunter, HeavyHunter, BattleShip, ArmoredShip
	    int total = 0;
	    System.out.println("awfawfaw");
	    
	    ArrayList<militaryUnit>[] enemyArmy = new ArrayList[4];
	    for (int i= 0; i < enemyArmy.length; i++) {
	    	enemyArmy[i] = new ArrayList<militaryUnit>();
	    	System.out.println("despues de arraylist enemyarmy");
	    	
	    }
	    
        while (recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
            int randNum =  (int)(Math.random()*100);
            System.out.println("metal" + recursosMetal + "deuterio" + recursosDeuterium);
            System.out.println("dpepepeepepeep");
            total = 0;
            boolean seleccionado = false;
            System.out.println(randNum);
            for (int i = 0; i < porcentajesEnemy.length; i++) {
            	total += porcentajesEnemy[i];
            	System.out.println(total);
            	System.out.println(seleccionado);
            	if(total >= randNum) {
            		System.out.println("despues del for de porcentajes enemy");
            	
            	 if (i == 0 & !seleccionado & recursosMetal >= METAL_COST_LIGTHHUNTER & recursosDeuterium >= DEUTERIUM_COST_LIGTHHUNTER) {
                     enemyArmy[0].add(new ligthHunter());
                     recursosMetal -= METAL_COST_LIGTHHUNTER;
                     recursosDeuterium -= DEUTERIUM_COST_LIGTHHUNTER;
                     seleccionado = true;
                     System.out.println("Ha añadido LigthHunter");
                     
                     
                 } else if (i == 1 &  !seleccionado & recursosMetal >= METAL_COST_HEAVYHUNTER & recursosDeuterium >= DEUTERIUM_COST_HEAVYHUNTER) {
                     enemyArmy[1].add(new heavyHunter());
                     recursosMetal -= METAL_COST_HEAVYHUNTER;
                     recursosDeuterium -= DEUTERIUM_COST_HEAVYHUNTER;
                     seleccionado = true;
                     System.out.println("Ha añadido HeavyHunter");
                 } else if ( i == 2 &  !seleccionado &   recursosMetal >= METAL_COST_BATTLESHIP & recursosDeuterium >= DEUTERIUM_COST_BATTLESHIP) {
                     enemyArmy[2].add(new battleShip());
                     recursosMetal -= METAL_COST_BATTLESHIP;
                     recursosDeuterium -= DEUTERIUM_COST_BATTLESHIP;
                     seleccionado = true;
                     System.out.println("Ha añadido BattleShip");
                 } else if ( i == 3 &    !seleccionado &  recursosMetal >= METAL_COST_ARMOREDSHIP & recursosDeuterium >= DEUTERIUM_COST_ARMOREDSHIP) {
                     enemyArmy[3].add(new armoredShip());
                     recursosMetal -= METAL_COST_ARMOREDSHIP;
                     recursosDeuterium -= DEUTERIUM_COST_ARMOREDSHIP;
                     seleccionado = true;
                     System.out.println("Ha añadido AromredShip");
                 } 
            	}
            	}
            	
            
            
           
        }
        metalEnemigo += 40000;
        deuterioEnemigo += 20000;
        System.out.println("antes de clon enemyarmy");
        pelea.setEnemyArmy(enemyArmy.clone());
        System.out.println("despues de clone ");
        }
		
	
	
	public void batalla() {
		pelea = new battle();
		 pelea.setPlanetArmy(planeta.getArmy());
	     pelea.iniciarArmies();
		int numAleatorio = (int)(Math.random()*2+1);
		int grupoAtacante = 0;
		int grupoDefensor = 0;
		int atacante = 0;
		int defensor = 0;
		boolean salir = false;
		boolean salir2 = false;
		int cont = 0;
		 
		
		while (!salir) {
			if (numAleatorio %2 == 0) {
				grupoAtacante = pelea.getEnemyGroupAttacker();
				cont = 1;
				System.out.println("despues de crear grupoAtacante cont = 1");
			}
			else{
				grupoAtacante = pelea.getEnemyGroupAttacker();
				cont = 0;
				System.out.println("despues de crear grupoAtacante cont = 0");
				
			}
			grupoDefensor = pelea.getGroupDefender(pelea.getArmies()[numAleatorio %2]);
			System.out.println("PETA ANTES");
			System.out.println(grupoAtacante + " " + grupoDefensor);
			System.out.println(numAleatorio%2);
			System.out.println(cont);
			atacante = (int)(Math.random()*pelea.getArmies()[cont][grupoAtacante].size());
			System.out.println("PETA DESPUES");
			defensor = (int)(Math.random()*pelea.getArmies()[numAleatorio %2][grupoDefensor].size());
			
			((militaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).takeDamage(((militaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());	
			while (!salir2) {
				int numAleatorio2 = (int)(Math.random()*100);
				if (((militaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).getActualArmor() <= 0){
					 pelea.getArmies()[numAleatorio%2][grupoDefensor].remove(defensor);
					 if ( pelea.getArmies()[numAleatorio%2][grupoDefensor].isEmpty());
					 System.out.println(pelea.remainderPercentageFleet( pelea.getArmies()[numAleatorio%2]));
					 	if (pelea.remainderPercentageFleet( pelea.getArmies()[numAleatorio%2]) <= 20) {
					 		
					 		salir2 = true;
					 		System.out.println("Has entrado en salir2");
					 		salir = true;
					 		
			
					 	}
					 	 grupoDefensor = pelea.getGroupDefender(pelea.getArmies()[numAleatorio %2]);
			 
					}
				defensor = (int)Math.random()*pelea.getArmies()[numAleatorio %2][grupoDefensor].size();
			
			if (numAleatorio %2 == 0) {
				if (CHANCE_ATTACK_ENEMY_UNITS[grupoAtacante] <= numAleatorio2) {
					((militaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).takeDamage(((militaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());	
					
				}
				else {
					salir2 = true;
				}
				
			}
			else{
				if (CHANCE_ATTACK_ENEMY_UNITS[grupoAtacante] <= numAleatorio2) {
					((militaryUnit) pelea.getArmies()[numAleatorio%2][grupoDefensor].get(defensor)).takeDamage(((militaryUnit) pelea.getArmies()[cont][grupoAtacante].get(atacante)).attack());	
					
				}
				else {
					salir2 = true;
				}
				
				}
		}
		}
		 System.out.println(pelea.remainderPercentageFleet( pelea.getArmies()[0]) +  " " + pelea.remainderPercentageFleet( pelea.getArmies()[1]));
		if (pelea.remainderPercentageFleet( pelea.getArmies()[0]) <= 20 | pelea.remainderPercentageFleet( pelea.getArmies()[1]) <= 20) {
			salir = true;
			
		}
		numAleatorio += 1;
		
	 	
	}



	public planet getPlaneta() {
		return planeta;
	}


	public void setPlaneta(planet planeta) {
		this.planeta = planeta;
	}


	public battle getPelea() {
		return pelea;
	}


	public void setPelea(battle pelea) {
		this.pelea = pelea;
	}
}
