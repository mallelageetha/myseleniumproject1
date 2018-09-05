package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ArrayListEx.Person;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Set <Person> personSet = new HashSet<Person>();
		personSet.add(new Person("Hari","1127",27));
	    personSet.add(new Person("Vihana","11234",1));
	    personSet.add(new Person("Bhavya","2734",27));
	 
	    Iterator <Person> it = personSet.iterator();
	    
	    while(it.hasNext()) {
	    	Person p = it.next();
	    	System.out.println("Name ="+p.getAdharNumber() +"Age ="+p.getAge() + "Name ="+p.getName());
	    }	
	}

}
