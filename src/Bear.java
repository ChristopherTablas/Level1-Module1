
public class Bear {
	String color;
	String name;
	
	public Bear(String color, String name){
		this.color = color;
		this.name = name;
	}
	public String roar() {
		return "ROOOAAAARRRRR ";
	}
	
	public static void main(String[] args) {
	Bear bob = new Bear("Brown ", "Bob.");
	System.out.println("My name is " + bob.name + " My color is " + bob.color + bob.roar());
	Bear john = new Bear("White ", "John.");
	System.out.println("My name is " + john.name + " My color is " + john.color + john.roar());

	}
}
