package com.test7;
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	//end 생성자
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}//end person 
public class Ex06_9{
	public static void main(String[] args) {
		Person p = new Person ("홍길동", 44);
		Person p2 = new Person("홍길동", 44);
		System.out.println(p==p2); //f
		if (p.equals(p2)) {
			System.out.println("p와p2는 같다");
		} else {
			System.out.println("p와p2는 다르다");
		}

	}
}