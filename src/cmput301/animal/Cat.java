package cmput301.animal;

public class Cat {

	private String name;
	private int age;
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void breathe(){
		System.out.println("Lung Breathes");
	}
}
