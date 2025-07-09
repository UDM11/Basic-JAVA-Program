class Book{
	String name;
	int price;
	String Auther;
	
	Book(){
		name = "Unknown";
		price = 0;
		Auther = "Not Assigned";
	}
	
	Book(String n){
		name = n;
		price = 0;
		Auther = "Not Assigned";
	}
	
	Book(String n, int a){
		name = n;
		price = a;
		Auther = "Not Assigned";
	}
	
	Book(String n, int a, String c){
		name = n;
		price = a;
		Auther = c;
	}
	
	void disply(){
		System.out.println("Name: " + name +", Price: " +price +", Auther: " +Auther);
	}
	
	public static void main(String[] args){
		Book b1 = new Book();
		Book b2 = new Book("Java");
		Book b3 = new Book("C", 300);
		Book b4 = new Book("Math", 500, "Mr. King");
		
		b1.disply();
		b2.disply();
		b3.disply();
		b4.disply();
	}
}