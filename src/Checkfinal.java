import java.lang.reflect.Field;

public class Checkfinal {
	private final String name;
	Checkfinal(String name){
		this.name=name;
	}
	private String name() {
		return name;
	}
	private void reproduce() {
		new Checkfinal("reproduce") {
		void printName() {
			System.out.println(name());
		}	
		}.printName();
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("these are fields");
		 
			 try {
				Field f=TestComb.class.getDeclaredField("id");
				f.setAccessible(true);
				System.out.println("name.."+f.get(new TestComb()));
			} catch (NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		new Checkfinal("main").reproduce();
	}
}
