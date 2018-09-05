package ArrayListEx;

public class Person {

		private String adharNumber;
		private String name;
		private int age;
		
		public Person(String number, String personName, int personAge)
		{		
			this.adharNumber=number;
			this.name=personName;
			this.age=personAge;
		
		}
		public String getAdharNumber()
		{
			return adharNumber;
		}
		public String getName() 
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		
		
		
	}

