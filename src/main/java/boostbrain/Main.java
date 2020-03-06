package boostbrain;

import java.util.List;

public class Main {
	
	/* method for checking elevator shutdown conditions */
	static boolean completionCheck(List<Person>[] stage, boolean endVar) {

		  for (int t = 0; t < stage.length; t++) {
              for (int b = 0; b < stage[t].size(); b++) {
                  if(stage[t].get(b).floor != t){
                      endVar = false;
                      break;}
                  }       
          }
		  return endVar;
	}
	
    public static void main( String[] args) {

    	/*generation of people on floors*/
    
         Building bg = new Building();
         Elevator el = new Elevator(); 
         bg.addPeopleToQueue(bg.stage);
         
        System.out.println("Number of floors in the building " + Building.NUMOFFLOORS);
        
        System.out.println("The number of people on each floor in line to the elevator");
        
        for (List<Person> arrOfFloor : bg.stage) {
            System.out.print(arrOfFloor.size() + " ");
        }
        
        System.out.println("");
        System.out.println(""); 
        
        bg.showBuilding(bg.stage);
        System.out.println("");
        
         while(true) {  
            
        	 /* cycle completion indicator */
        	 boolean endVar = true;
        	System.out.println("lift up");
         	el.movingUp(bg.stage, el.elevator);     
         	bg.showBuilding(bg.stage);
         	System.out.println("");
         	System.out.println("lift down");
         	el.movingDown(bg.stage, el.elevator);
         	bg.showBuilding(bg.stage);
            endVar = completionCheck(bg.stage, endVar);
           
             if(endVar == true) break;
            
         }
         
    }
}
