package ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Person hari= new Person("123","Hari",29);
		Person bhavya= new Person("234","Bhavya",27);
		Person vihana = new Person("456","Vihana", 1);
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(hari);
		personList.add(bhavya);
		personList.add(vihana);
		
		Collections.sort(personList, new AgeComparator());
		Collections.sort(personList, new NameComparator());
		for(int i=0;i<personList.size();i++)
		{
			Person p=personList.get(i);
				System.out.println("Name ="+p.getAdharNumber() +"Age ="+p.getAge() + "Name ="+p.getName());
				
		}
	}
	
	static class AgeComparator implements Comparator<Person>
	{

		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			if(o1.getAge() > o2.getAge() )
			{
				return 1;
			}
			else if(o1.getAge()<o2.getAge())
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		}
		
	}
	static class NameComparator  implements Comparator<Person>
	{

		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
	
			return o1.getName().compareTo(o2.getName());
			
		}	
	}
}
