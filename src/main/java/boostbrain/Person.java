
package boostbrain;

public class Person implements Comparable<Person>{
     
	/* floor number where the passenger is going */
     public int floor;
    
     public Person() {
        floor = 1 + (int)(Math.random() * (Building.NUMOFFLOORS - 1));
    }
    
    @Override
     public int compareTo(Person person){
         return(floor - person.floor);
     }

    @Override
    public String toString() {
        return Integer.toString(floor);
    }
      
}
