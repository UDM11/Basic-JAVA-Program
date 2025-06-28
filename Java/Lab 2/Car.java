public class Car{
	String brand;
	int year;

	void displayDetails(){
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}

	public static void main(String[] args){
		Car myCar = new Car();

		myCar.brand = "Toyota";
		myCar.year = 2020;

		myCar.displayDetails();
	}
}