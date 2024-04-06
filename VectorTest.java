package Collection;
import java.util.Enumeration;
import java.util.Vector;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v=new Vector<String>();
		System.out.println(v.size());
		System.out.println(v.capacity());

		//we can change this default behaiour
		
			Vector v1=new Vector(2); 
			System.out.println(v.size());
			System.out.println(v.capacity());
			
			// Now addinhg Elements	
			v1.add("Appple");
			v1.add("Mango");
			v1.add("Grapes");
			System.out.println(v.size());
			System.out.println(v1);
			
			//observe capacity
			System.out.println(v1.capacity());
			
			//iterator by using Enumaration
			Enumeration enumeration = v1.elements();
			while(enumeration.hasMoreElements()) {
				String element=(String)enumeration.nextElement();
				System.out.println(element);
			}
	}

}
