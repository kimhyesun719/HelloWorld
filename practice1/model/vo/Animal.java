package practice1.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	public Animal() {
	}
	
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	@Override
	public String toString() {
		return "���� �̸���" + name + "�̰�, ������ " + kinds + "�Դϴ�.";
	}
	
	public abstract void speak();
		
	

}
