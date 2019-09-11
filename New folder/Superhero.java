public class Superhero{

	private String name;
	public Superhero(){

		this.name = "Batman";
	}

	public String toString(){
		return name + " is the superhero";
	}

	public static class Villain{

		private String name;

		public Villain(){
			this.name = "Joker";
		}

		public String toString(){
			return name + " is the villain";
		}
	}

}
