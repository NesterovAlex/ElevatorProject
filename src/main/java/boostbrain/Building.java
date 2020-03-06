
package boostbrain;

import java.util.LinkedList;
import java.util.List;

public class Building {
   
   public int floor; 
   public final static int NUMOFFLOORS = 5 + (int)(Math.random()* 16);
   public final  List<Person>[] stage;
   
   public Building() {
	   stage = new LinkedList[NUMOFFLOORS];
   }
   
     
     /* creating an array of floors */
        
       
     
     public List<Person>[] addPeopleToQueue(List<Person>[] arr) {
    	 
    	 for (int i = 0; i < arr.length; i++) {
             
            arr[i] =  new LinkedList <>();
             
             for (int w = 0; w < (int)(Math.random()*11) + 1; w++) {
               arr[i].add(w, new Person());
             }
         }
    	 return arr;
     }
     
     public void showBuilding(List<Person>[] stage) {
		  for (List<Person> linkedList : stage) {
             System.out.println(linkedList.toString());
          }
		
	}
       
}
