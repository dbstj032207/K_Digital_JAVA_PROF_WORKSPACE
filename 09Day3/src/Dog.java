
public class Dog extends Pet {

	private String color;

	//기능==> 이전에 오버라이딩
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}


	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍~");
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("쩝쩝~");
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("쿨쿨~");
	}
	
	
	
}
