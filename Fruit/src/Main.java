import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1=new Fruit(101,"Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi", 200));
		fl.add(new Fruit(104,"Strawberry", 1000));
		fl.add(new Fruit(105,"Pear", 500));
		fl.add(new Fruit(106,"Cherry", 300));
		fl.add(new Fruit(107,"Watermelon", 10000));
		fl.add(new Fruit(108,"Grape", 5000));
		fl.add(new Fruit(109,"Blueberry", 2000));
		fl.add(new Fruit(110,"Peach", 700));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s:fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}

	}

}
