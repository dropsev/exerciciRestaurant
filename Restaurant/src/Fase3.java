import java.util.*;
import java.io.*;


public class Fase3 {
	
	//Bills from 5 to 500	
	static int a = 5;
	static int b = 10;
	static int c = 20;
	static int d = 50;
	static int e = 100;
	static int f = 500;
  

	public static void main(String[] args) {

		
		//Menu final price
		int totalCost =0;

		String[] arrDish = new String[5];
		int[] price = new int[5];
		
		
		arrDish[0] = "Mariscs";
		arrDish[1] = "Calamars";
		arrDish[2] = "Paella";
		arrDish[3] = "Bistec";
		arrDish[4] = "Calçots";
		
		price[0] = 10;
		price[1] = 15;
		price[2] = 20;
		price[3] = 15;
		price[4] = 5;
		
		//double[] price = {10,15,20,15,5};		
		
		
		for (int i = 0; i < arrDish.length; i++) {

		    System.out.println(arrDish[i]  + " " + price[i]);

		}
		
		Scanner order = new Scanner(System.in);
		List list = new ArrayList();
		
		while(true){		
			System.out.print("What would you like to eat?");
			list.add(order.next());
			
			System.out.println("Anything else? Type y to continue or n to finish order");
		    Scanner s1 = new Scanner(System.in);
		    String a1 = s1.nextLine();
		    
		    if(a1.equals("n"))
		        break;
		    
		    else if (a1.equals("y"))
		    	System.out.print("What would you like to eat?");
			list.add(order.next());
			
			System.out.println("Anything else? Type y to continue or n to finish order");
		    Scanner s2 = new Scanner(System.in);
		    String a2 = s2.nextLine();
		    
		    if(a2.equals("n"))
		        break;
		    		    
		    	
		}
		
		System.out.println(list);
		
		//List<String> listDish = Arrays.asList(arrDish);
		
//		if (listDish.containsAll(list)) {
//			for (int j = 0; j < list.size(); j++) {			
//            System.out.println(price[j]);
//			}
//		}
//		
//		else {
//			System.out.println("The ordered dish doesn't exist.");
//		}
//		
		
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < arrDish.length; j++) {
				if(list.get(i)==arrDish[j]) {
					totalCost = totalCost + price[j];
					
					System.out.println(totalCost);
				}
			else {
					System.out.println("The ordered dish doesn't exist.");
				}
			}
			
		}
		
		
		
		
    }


}
