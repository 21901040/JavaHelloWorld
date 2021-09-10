
public class Fruit {
	int no; //number
	String name;
	int price;
	
	public Fruit(int i, String string, int j) {
		this.no=i;
		this.name=string;
		this.price=j;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}
