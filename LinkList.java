import java.util.*;
public class LinkList {

		  public static void main(String[] args){

		    LinkedList<String> animals = new LinkedList<String>();

		    animals.add("Dog");
		    animals.add("Cat");
		    animals.add("Cow");
		    animals.add("Giraffe");
		    animals.add("Panda");
		    animals.add("Frog");

		    System.out.println(" LinkedList: " + animals);

		    animals.get(1);
		    animals.remove();
		    animals.remove(2);
		    animals.remove("Cow");
		    System.out.println(animals.contains("Giraffe"));                       //True or false 
		    System.out.println("Size : "+ animals.size());

		    animals.set(2,"Lion");

		    Object[] a = animals.toArray();
		    System.out.print( "After converted LinkedList to Array: ");
        for (Object element : a)
            System.out.print(element + " ");

        System.out.println("\n" + "Index of Lion : " +animals.indexOf("Lion"));

		
		  System.out.println("\n LinkedList: " + animals);

		    System.out.println("Linkedlist to String " + animals.toString());
		  }
		}

