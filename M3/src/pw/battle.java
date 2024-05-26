package pw;

import java.util.ArrayList;

public class battle implements variables{
	 	private ArrayList<militaryUnit>[] planetArmy;
	    private ArrayList<militaryUnit>[] enemyArmy;
	    private ArrayList[][] armies;
	    private String battleDevelopment;
	    private int[][] initialCostFleet;
	    private int initialNumberUnitsPlanet;
	    private int initialNumberUnitsEnemy;
	    private int[] wasteMetalDeuterium;
	    private int[] enemyDrops;
	    private int[] planetDrops;
	    private int[][] resourcesLooses;
	    private int[][] initialArmies;
	    private int[] actualNumberUnitsPlanet;
	    private int[] actualNumberUnitsEnemy;
	    
	    
	    public ArrayList<militaryUnit>[] getPlanetArmy() {
			return planetArmy;
		}

		public void setPlanetArmy(ArrayList<militaryUnit>[] planetArmy) {
			this.planetArmy = planetArmy;
		}

		public ArrayList<militaryUnit>[] getEnemyArmy() {
			return enemyArmy;
		}

		public void setEnemyArmy(ArrayList<militaryUnit>[] enemyArmy) {
			this.enemyArmy = enemyArmy;
		}

		public ArrayList[][] getArmies() {
			return armies;
		}

		public void setArmies(ArrayList[][] armies) {
			this.armies = armies;
		}

		public int[][] getInitialCostFleet() {
			return initialCostFleet;
		}

		public void setInitialCostFleet(int[][] initialCostFleet) {
			this.initialCostFleet = initialCostFleet;
		}

		public int getInitialNumberUnitsPlanet() {
			return initialNumberUnitsPlanet;
		}

		public void setInitialNumberUnitsPlanet(int initialNumberUnitsPlanet) {
			this.initialNumberUnitsPlanet = initialNumberUnitsPlanet;
		}

		public int getInitialNumberUnitsEnemy() {
			return initialNumberUnitsEnemy;
		}

		public void setInitialNumberUnitsEnemy(int initialNumberUnitsEnemy) {
			this.initialNumberUnitsEnemy = initialNumberUnitsEnemy;
		}

		public int[] getWasteMetalDeuterium() {
			return wasteMetalDeuterium;
		}

		public void setWasteMetalDeuterium(int[] wasteMetalDeuterium) {
			this.wasteMetalDeuterium = wasteMetalDeuterium;
		}

		public int[] getEnemyDrops() {
			return enemyDrops;
		}

		public void setEnemyDrops(int[] enemyDrops) {
			this.enemyDrops = enemyDrops;
		}

		public int[] getPlanetDrops() {
			return planetDrops;
		}

		public void setPlanetDrops(int[] planetDrops) {
			this.planetDrops = planetDrops;
		}

		public int[][] getResourcesLooses() {
			return resourcesLooses;
		}

		public void setResourcesLooses(int[][] resourcesLooses) {
			this.resourcesLooses = resourcesLooses;
		}

		public int[][] getInitialArmies() {
			return initialArmies;
		}

		public void setInitialArmies(int[][] initialArmies) {
			this.initialArmies = initialArmies;
		}

		public int[] getActualNumberUnitsPlanet() {
			return actualNumberUnitsPlanet;
		}

		public void setActualNumberUnitsPlanet(int[] actualNumberUnitsPlanet) {
			this.actualNumberUnitsPlanet = actualNumberUnitsPlanet;
		}

		public int[] getActualNumberUnitsEnemy() {
			return actualNumberUnitsEnemy;
		}

		public void setActualNumberUnitsEnemy(int[] actualNumberUnitsEnemy) {
			this.actualNumberUnitsEnemy = actualNumberUnitsEnemy;
		}

		public void setBattleDevelopment(String battleDevelopment) {
			this.battleDevelopment = battleDevelopment;
		}
		
	/********************************************************************  *******************************************************************/

		public String getBattleReport(int battles) {
	        return battleDevelopment;
	    }

	    public String getBattleDevelopment() {
	        return battleDevelopment;
	    }
	    
	    
	    public void initInitialArmies() { /*BIEN*/
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 7; j++) {
	                if (armies[i][j] == null) {
	                    initialArmies[i][j] = 0;
	                } else {
	                    	initialArmies[i][j] = armies[i][j].size();
	                    }
	                } 
	            }
	        }
	    
	    
	    //final
	    public void updateResourcesLooses() {
	       
	    }
	    
	    public void fleetResourceCost(ArrayList<militaryUnit>[] army) {
	        int totalMetal = 0;
	        int totalDeuterium = 0;
	        
	         for (int i = 0; i < army.length; i++) {
	                 totalMetal += army[i].size() * METAL_COST_UNITS[i];
	                 totalDeuterium += army[i].size() * DEUTERIUM_COST_UNITS[i];
	         }
	         
	         if (army.length == 7) {
	             initialCostFleet[0][0] =  totalMetal;
	             initialCostFleet[0][1] = totalDeuterium;
	         }
	         else {
	             initialCostFleet[1][0] = totalMetal;
	             initialCostFleet[1][1] = totalDeuterium;
	         }
	    }
	      
	        
	    
	    public void initialFleetNumber(ArrayList<militaryUnit>[] army) {
	        int totalUnidades = 0;
	        for (int i = 0; i < army.length; i++) {
	        	 if (army[i] == null) {
	        		 totalUnidades += 0;
	        	 }
	        	 else {
	        		 totalUnidades += army[i].size();
	        	 }
	        }
	        
	        if (army.length == 7) {
	        	 initialNumberUnitsPlanet = totalUnidades;
	        
	        }
	        else {
	        	initialNumberUnitsPlanet = totalUnidades;
	        	
	                  } 
	              }	 

	  
	    public int remainderPercentageFleet(ArrayList<militaryUnit>[] army) {
	    	 int flotaActual = 0;
	    	 int resultado = 0;
	    	 for (int i = 0; i < army.length; i++) {
	    		 if (army[i] != null)    			
	    			 flotaActual += army[i].size();
	    	 }

	    	  if (army.length == 7) {
	    	         resultado = (flotaActual * 100) / initialNumberUnitsPlanet;
	    	         
	    	        }
	    	  else {
	    	         resultado = (flotaActual * 100) / initialNumberUnitsEnemy;
	    	        
	    	        }
	    	  		return resultado;
	    	    }
	    		 
	 	   
	    public int getGroupDefender(ArrayList<militaryUnit>[] army) {
	        // Paso 1: Calcular el total de unidades
	        int totalUnits = 0;
	        int calculo = 0;
	        int totalprobabilidad = 0;
	        boolean  salir = false;
	        ArrayList groupProbabilidades = new ArrayList();

	    
	        for (int i = 0; i < army.length; i++) {
	        	if (army[i] != null)
	            totalUnits += army[i].size();
	            
	        }
	        for (int i = 0; i < army.length; i++) {
	        	 calculo = (army[i].size() * 100) / totalUnits;
	        	 groupProbabilidades.add(calculo);
	        	 totalprobabilidad += calculo;
	        }
	        /*while
			num random
			entra al for
			meto los numeros en variable
			compruebo*/

	     
	         return 0;
	    }
	    

	    public int getPlanetGroupAttacker() {
	        return 0;
	    }

	    public int  getEnemyGroupAttacker() {
	        return 0;
	    }

	    public void resetArmyArmor() {

	    }
	}

	


