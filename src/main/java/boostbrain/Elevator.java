
package boostbrain;

import java.util.LinkedList;
import java.util.List;

public class Elevator {
	
      /* maximum capacity of elevator */ 
     private final  int CAPACITY = 5;
     
     /* elevator is represented as array */
     public Person[] elevator;
     
     public Elevator() {
		elevator= new Person[CAPACITY]; 
	}
     
     /* moving people into the elevator when it moves up */
     public Person[] passToElevatorUp(Person[] elevator, List<Person>[] stage, int floor) {
 		
		 for (int i = 0; i < elevator.length; i++) {
	            if(elevator[i] == null){
	                for (int m = 0; m <  stage[floor].size(); m++) {
	                 if(stage[floor].get(m).floor > floor){
	                     elevator[i] = stage[floor].get(m);
	                     stage[floor].remove(m);break;
	                 }
	                }
	            }
	           }  
		 return elevator;
	}
	
     /* moving people into the elevator as it moves down */
	public Person[] passToElevatorDown(Person[] elevator, List<Person>[] stage, int floor) {
		
		 for (int c = 0; c < elevator.length; c++) {
	            if(elevator[c] == null){
	                for (int m = 0; m < stage[floor].size(); m++) {
	                 if(stage[floor].get(m).floor < floor){
	                     elevator[c] = stage[floor].get(m);
	                     stage[floor].remove(m);break;
	                 }
	                }
	            }
	     }
		 return elevator;
	}

	/* moving people from the elevator */	
	public Person[] passfromElevator(Person[] elevator, List<Person> stage, int floor) {
		
		 for (int i = 0; i < elevator.length; i++) {
              if(elevator[i] != null && elevator[i].floor == floor){
                 stage.add(elevator[i]); 
                 elevator[i] = null;
             }
           }
		 return elevator;
	}
	
	/* move the elevator down */
	public void movingUp(List<Person>[] stage, Person[] elevator) {
		
		   for (int floor = 0; floor < stage.length; floor++) {

	            System.out.println("Stage " + floor); 
	            
	            passfromElevator(elevator, stage[floor], floor);    
	          
	           for (Person person : elevator) {
	              System.out.print(person + "   ");
	            }
	         
	           passToElevatorUp(elevator, stage, floor);
	                  
	             System.out.println("");
	             
	             for (Person person : elevator) {
	                  System.out.print(person + " ");
	             }
	             
	            System.out.println("");
	            System.out.println("");
	           
	            
	        }
	}
	
	/* move the elevator down */
	public void movingDown(List<Person>[] stage, Person[] elevator) {
		
		 for (int floor = stage.length - 1; floor >= 0; floor--) {
			 
			 System.out.println("Stage " + floor);
       	  
			 passfromElevator(elevator, stage[floor], floor);
	         
	           for (Person person : elevator) {
	              System.out.print(person + "   ");
	            }
	           
	         passToElevatorDown(elevator, stage, floor);

	             System.out.println("");
	             
	             for (Person person : elevator) {
	                  System.out.print(person + " ");
	             }
	             
	            System.out.println("");
	            System.out.println("");     
	        }
	}
	
     
  
}
