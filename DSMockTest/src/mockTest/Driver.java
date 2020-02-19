package mockTest;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car cars[] = new Car[]
				{
				new Car("1234HO", (float)1000.00,"red","101a"), 
				new Car("1001CR", 500,"blue","102b"),
				new Car("4785MI", 600,"yello","103c"),
				new Car("7856SW", 750,"black","104d"),
				new Car("7854HO", 800.5F,"grey","105e"),
				new Car("6531SW", 999.6F,"brown","106f"),
				new Car("7421SE", 1000.0F,"pink","107g"),
				new Car("7864ST", 654,"green","108h"),
				new Car("3124DE", 1200,"blue", "109i"),
				new Car("3645RF", 800, "purple", "110j"), };

		LinearList list = new LinearList();
		System.out.println("**********Car List********");
		for (int i = 0; i < 10; i++) {
			list.insert(cars[i]);
		}
		list.show();
		System.out.println();
		

		System.out.println("******Retrieving a Car******"); //display fifth element 
		list.retrieve("6531SW").display();
		
		System.out.println("******Removing a Car******");
		list.remove().display();
		System.out.println();
		
		System.out.println("******Display new list******");
		list.show();
		System.out.println();
		
		
		System.out.println("******Deleted list******");
		list.destroy();
		list.show();
		
		
	}
}
