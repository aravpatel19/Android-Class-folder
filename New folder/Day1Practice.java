import java.util.*;

public class Day1Practice{
	public static void main(String[]args){

		Hero batman = new Hero("Batman", "being rich");
		System.out.println(batman);

		System.out.println(batman.getName());
		System.out.println(batman.getPower());
		batman.updatePower("Super Strength");
		System.out.println(batman);

		System.out.println();

		Superhero hero = new Superhero();
		System.out.println(hero);

		Superhero.Villain joker = new Superhero.Villain();
		System.out.println(joker);

		System.out.println();

		Hero superman = new Hero("Superman", "being able to fly and super strength and fly");
		Hero spiderman = new Hero("Spiderman", "being able to climb and shoot webs");
		Hero hulk = new Hero("Hulk", "Growing into a strong green giant");
		Hero flash = new Hero("Flash", "Super Speed");

		ArrayList<Hero> list = new ArrayList<>();
		list.add(batman);
		list.add(superman);
		list.add(spiderman);
		list.add(hulk);
		list.add(flash);

		/*for(int i=0; i<list.size()-1; i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(j).compareTo(list.get(i)) < 0){
					Hero temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}*/

		Collections.sort(list);
		System.out.println(list);

	}

	public static class Hero implements Comparable<Hero>{

		private String name;
		private String power;

		public Hero(String name, String power){
			this.name = name;
			this.power = power;
		}

		public int compareTo(Hero a){
			return name.compareTo(a.getName());
		}


		public String getName(){
			return name;
		}
		public String getPower(){
			return power;
		}

		public void updatePower(String power){
			this.power = power;
		}
		public String toString(){
			return name+" has the power of "+power;
		}
	}
}