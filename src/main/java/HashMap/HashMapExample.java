package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



import ArrayListEx.Person;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person hari = new Person("Hari","23454",29);
		Person vihana = new Person("Vihana","34256",1);
		Person bhavya = new Person("Bhavya","43556",27);
		HashMap<String,Person> personMap = new HashMap<String,Person>();
		personMap.put("1", hari);
		personMap.put("2",vihana);
		personMap.put("3",bhavya);
		
		Iterator<Entry<String,Person>> it = personMap.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String,Person> e = it.next();
			String key = e.getKey();
			Person value = e.getValue();
			System.out.println("Name =" +value.getName() +"Adhar =" +value.getAdharNumber() + "Age=" +value.getAge());
		}
	}

}
