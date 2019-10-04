import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(90);
		e.setName("Mahesh");
		System.out.println(e);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("d://emp.ser")))){
			oos.writeObject(e);
			oos.flush();
		}catch (Exception e1) {
			e1.printStackTrace();
		};
		
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d://emp.ser"))){
			Object obj=ois.readObject();
			Employee emp=(Employee)obj;
			System.out.println("emp read "+emp);
		}catch (Exception e1) {
			e1.printStackTrace();
		};

	}

}
