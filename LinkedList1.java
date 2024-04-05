package Collection;

import java.util.LinkedList; 
public class LinkedList1 {
	
	public static void main(String[] args) {
		
			LinkedList<String> s2=new LinkedList<String>();
				
			s2.addFirst("Prachi");
				s2.addFirst("Pooja");
				s2.addFirst("Utkrasha");
				s2.addFirst("Akansha");
				s2.addFirst("Divya");
				s2.addFirst("Sidhi");
				s2.addLast("Rushikesh");
				s2.addLast("Akash");
				s2.addLast("nikhil");
				s2.addLast("kunal");
				s2.addLast("Devendra");
				s2.addLast("Samir");
				
				System.out.println(s2);
				
				s2.size();
				System.out.println(s2.size());
				
				s2.remove(0);
				System.out.println(s2);
				
				s2.addFirst("Swara");
				System.out.println(s2);
				
				s2.remove("Akansha");
				System.out.println(s2);
				
				for(String t:s2) 
				{
					System.out.println(t);
					
				}
				
		}
}
	 

